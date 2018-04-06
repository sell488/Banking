package com.sell488.Banking.BankActions;

import com.sell488.Banking.BankActions.Account;

import javax.swing.*;
import java.util.HashMap;

public class AccountManager extends Account{
    AccountManager accountLists = new AccountManager();

    //adds a new account
    public void addNewAccount(int accountNum, int initialBalance) {
        accounts = accountLists.getAccounts();
        if(!(accounts.containsKey(accountNum))) {
            accounts.put(accountNum, initialBalance);
        }
    }

    //manages accounts
    public void manageAccounts() {

    }

    //Gets the list from Account Class
    public HashMap<Integer, Integer> getList() {
        HashMap <Integer, Integer> editMap = getAccounts();
        return editMap;
    }

}
