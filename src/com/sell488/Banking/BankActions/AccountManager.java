package com.sell488.Banking.BankActions;

import com.sell488.Banking.BankActions.Account;

import javax.swing.*;
import java.util.HashMap;

public class AccountManager {

    Account accountLists = new Account();
    public void addNewAccount(int accountNum, int initialBalance) {
        HashMap<Integer, Integer> accountList = new HashMap<Integer, Integer>();
        accountList = accountLists.getAccountList();
        if(!(accountList.containsKey(accountNum))) {
            String newAccount = JOptionPane.showInputDialog(null, "Account name");
        }
    }
}
