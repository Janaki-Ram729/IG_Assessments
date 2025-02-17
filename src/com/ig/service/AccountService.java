package com.ig.service;

import com.ig.model.Account;
import com.ig.exception.AccountNotFoundException;
import com.ig.exception.InvalidAmountException;
import com.ig.exception.InsufficientFundsException;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    List<Account> accountList = new ArrayList<>();

    public AccountService() {
        try {
            accountList.add(new Account(100001, "Ram K", Account.AccountType.SAVINGS, 1500f));
            accountList.add(new Account(100002, "Nithin S", Account.AccountType.CURRENT, 6000f));
            accountList.add(new Account(100003, "Kaushal K", Account.AccountType.SAVINGS, 2000f));
            accountList.add(new Account(100004, "Shiv G", Account.AccountType.CURRENT, 7000f));
            accountList.add(new Account(100005, "Manideep E", Account.AccountType.SAVINGS, 1200f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isValidAccount(int accNumber) throws AccountNotFoundException {
        for (Account account : accountList) {
            if (account.getAccNumber() == accNumber) {
                return true;
            }
        }
        throw new AccountNotFoundException("Account number " + accNumber + " not found.");
    }
    public List<Account> getAllAccounts() {
        return accountList;
    }


    public void deposit(float amt, int accNumber) throws InvalidAmountException, AccountNotFoundException {
        if (amt < 0) {
            throw new InvalidAmountException("Deposit amount cannot be negative.");
        }

        for (Account account : accountList) {
            if (account.getAccNumber() == accNumber) {
                account.setBalance(account.getBalance() + amt);
                return;
            }
        }
        throw new AccountNotFoundException("Account number " + accNumber + " not found.");
    }

    public void withdraw(float amt, int accNumber) throws InvalidAmountException, InsufficientFundsException, AccountNotFoundException {
        if (amt < 500) {
            throw new InvalidAmountException("Minimum withdrawal amount is 500.");
        }

        for (Account account : accountList) {
            if (account.getAccNumber() == accNumber) {
                if (account.getBalance() - amt < (account.getType() == Account.AccountType.SAVINGS ? 1000 : 5000)) {
                    throw new InsufficientFundsException("Insufficient balance. Minimum balance requirement not met.");
                }
                account.setBalance(account.getBalance() - amt);
                return;
            }
        }
        throw new AccountNotFoundException("Account number " + accNumber + " not found.");
    }

    public float getBalance(int accNumber) throws AccountNotFoundException {
        for (Account account : accountList) {
            if (account.getAccNumber() == accNumber) {
                return account.getBalance();
            }
        }
        throw new AccountNotFoundException("Account number " + accNumber + " not found.");
    }
}
