package com.sell488.Banking.BankActions;

import com.sell488.Banking.BankActions.Account;

import javax.swing.*;
import java.util.HashMap;

public class AccountManager extends Account{

    //Admin can change Account information so i'll override them to have that work


    public AccountManager(){
        super();

    }

     //overloading the method
     public void addBalance(Account account, double amount) {
         account.addBalance(amount);
    }

    //withdraw money from an account
    public void withdraw(Account account, double amount) {
        super.withdraw(amount);
    }

    //this method changes the name of an account
    public void changeName(Account account, String name) {
       account.setName(name);
    }

    //change the password of an account
    public void changePassword(Account account, String password){
        account.changePassword(password);
    }

    //Delete an account
    public void deleteAccount(Account account){
        account.deleteAccount();
    }

    //get account information
    public String getAccountInfo(Account account){
        return "Name: " + account.getName() + "\nbalance: " + account.getBalance();
    }
}
