package com.ig.ui;

import com.ig.model.Account;
import com.ig.service.AccountService;
import com.ig.exception.AccountNotFoundException;
import com.ig.exception.InvalidAmountException;
import com.ig.exception.InsufficientFundsException;
import java.util.List;
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Account Operations Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View All Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: // Check Balance
                    System.out.print("Enter account number: ");
                    int accNo = scanner.nextInt();
                    try {
                        float balance = accountService.getBalance(accNo);
                        System.out.println("Account balance: " + balance);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2: // Deposit
                    System.out.print("Enter account number: ");
                    accNo = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    float depositAmt = scanner.nextFloat();
                    try {
                        accountService.deposit(depositAmt, accNo);
                        System.out.println("Amount deposited successfully.");
                    } catch (AccountNotFoundException | InvalidAmountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3: // Withdraw
                    System.out.print("Enter account number: ");
                    accNo = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    float withdrawAmt = scanner.nextFloat();
                    try {
                        accountService.withdraw(withdrawAmt, accNo);
                        System.out.println("Amount withdrawn successfully.");
                    } catch (AccountNotFoundException | InvalidAmountException | InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4: // View All Accounts
                    List<Account> accounts = accountService.getAllAccounts();
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts available.");
                    } else {
                        System.out.println("\n--- All Accounts ---");
                        for (Account account : accounts) {
                            System.out.println(account);
                        }
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
