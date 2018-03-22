package com.sell488.Banking.BankActions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Account {

    HashMap<Integer, Integer> accounts = new HashMap<Integer, Integer>();
    public Integer getAccount(Integer account) {
        return accounts.get(account);
    }

    public void setAccounts(int account, int amount) {
        accounts.put(account, amount);
    }

}
