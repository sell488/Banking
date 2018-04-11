package com.sell488.Banking;

import com.sell488.Banking.BankActions.Account;
import com.sell488.Banking.BankActions.AccountManager;

public class Main {

    public static void main(String... args) {
       //testing
        Account rob = new Account("Robert","password123");
        rob.addBalance(200);
        System.out.println(rob.getBalance());
        AccountManager admin = new AccountManager();

        admin.addBalance(rob,100);
        admin.getBalance();
        System.out.println(admin.getAccountInfo(rob));

    }


}