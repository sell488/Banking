package com.sell488.Banking.BankActions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Account {

    HashMap acounts = new HashMap();
    public Object GetAccount(int acount) {
        return acounts.get(acount);
    }

    public void SetAccounts(int acount, int amount) {
        acounts.put(acount, amount);
    }

}
