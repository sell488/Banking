package com.sell488.Banking.BankActions;

import javax.swing.*;

public class BankActions {

    public BankActions() {

    }

    public void Deposit(int account, int amount) {
        Account balance = new Account();
        int currentBalance = balance.getAccount(account);
        int transaction = currentBalance + amount;
        balance.setAccounts(account, transaction);
    }
}
