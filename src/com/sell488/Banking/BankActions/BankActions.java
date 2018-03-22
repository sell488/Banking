package com.sell488.Banking.BankActions;

import javax.swing.*;

public class BankActions {

    public BankActions() {

    }

    public void deposit(int account, int amount) {
        Account balance = new Account();
        balance.Account();
        int currentBalance = balance.getAccount(account);
        System.out.println("got balance");
        int transaction = currentBalance + amount;
        balance.setAccounts(account, transaction);
        System.out.println("Deposit");
    }

    public void withdraw(int account, int amount) {
        Account balance = new Account();
        int currentBalance = balance.getAccount(account);
        int transaction = currentBalance - amount;
        balance.setAccounts(account, transaction);
        System.out.println("Withdraw");
    }
}
