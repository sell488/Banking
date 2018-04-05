package com.sell488.Banking.BankActions;

import com.sell488.Banking.BankActions.Account;

import javax.swing.*;
import java.util.HashMap;

public class AccountManager extends Account{
    Account accountLists = new AccountManager();

    public void addNewAccount(int accountNum, int initialBalance) {
        accounts = accountLists.getAccounts();
        if(!(accounts.containsKey(accountNum))) {
            String newAccount = JOptionPane.showInputDialog(null, "Account name");
        }
    }

    public void manageAccounts() {

    }

    public HashMap<Integer, Integer> getList() {
        HashMap <Integer, Integer> editMap = getAccounts();
        return editMap;
    }

}
