package com.ig.model;


import com.ig.exception.InvalidAmountException;
import com.ig.exception.LowBalanceException;

public class Account {
    Integer accNumber;
    String custName;
    AccountType type;
    Float balance;

    public enum AccountType {
        SAVINGS, CURRENT
    }

    public Account(Integer accNumber, String custName, AccountType type, Float balance) throws LowBalanceException, InvalidAmountException {
        this.accNumber = accNumber;
        this.custName = custName;
        this.type = type;
        if (balance < 0) {
            throw new InvalidAmountException("Balance cannot be negative");
        }
        this.balance = balance;
        if (type == AccountType.SAVINGS && balance < 1000) {
            throw new LowBalanceException("Savings account must have a minimum balance of 1000");
        } else if (type == AccountType.CURRENT && balance < 5000) {
            throw new LowBalanceException("Current account must have a minimum balance of 5000");
        }
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    public String getCustName() {
        return custName;
    }

    public AccountType getType() {
        return type;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}

