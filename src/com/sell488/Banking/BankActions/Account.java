package com.sell488.Banking.BankActions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Account {

    //default account
    public void Account(){
        accounts.put(1234, 0);
    }

    //HashMap for storing accounts and balances
    HashMap<Integer, Integer> accounts = new HashMap<Integer, Integer>();

    //Gets account balance at a specific key
    public Integer getAccount(Integer account) {
        return accounts.get(account);
    }

    //Gets the whole HashMap
    public HashMap getAccountList(){
        return accounts;
    }

    //gets accounts
    public HashMap<Integer, Integer> getAccounts() {
        return accounts;
    }

    //Sets the balance of an account
    public void setAccounts(int account, int amount) {
        accounts.put(account, amount);
    }

}
