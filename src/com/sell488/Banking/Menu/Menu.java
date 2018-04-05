package com.sell488.Banking.Menu;

import com.sell488.Banking.BankActions.AccountManager;
import com.sell488.Banking.BankActions.BankActions;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.HashMap;

public class Menu {

    private int accountNum;
    private String userName1 = "sell488";
    private String password1 = "1234";
    //inits menu
    public Menu() {
        String user = JOptionPane.showInputDialog(null, "Do you want to 1. access your bank account or 2. manage accounts?");
        if(user == "1") {
            bankAccount(user);
        }

        else if(user == "2") {
            login();
        }
    }

    //asks for bank account number
    public void bankAccount(String user){
        int accountNum = 1234;
        this.accountNum = accountNum;

            String bankAccount = JOptionPane.showInputDialog(null, "What is your bank account number?");
            if(accountNum == Integer.parseInt(bankAccount)) {
                access();
            }

            else handleError();
    }

    public void login() {
        AccountManager access = new AccountManager();

        String userName = JOptionPane.showInputDialog(null, "Enter your user name");
        if(userName == userName1) {
            String password = JOptionPane.showInputDialog("Enter password");
            if(password == password1) {
                manageAccounts();
            }
        }
    }

    public void manageAccounts() {
        String editAccounts = JOptionPane.showInputDialog(null, "Do you want to 1. Add a new account 2. Edit an existing account?");
        if(editAccounts == "1") {
            String addAccount = JOptionPane.showInputDialog(null, "What account number do you want to create");
//            HashMap<Integer, Integer> menuAccount = access().getList;
        }
    }

    //asks for action type
    public void access() {
            String bankActions = JOptionPane.showInputDialog(null, "1. Deposit 2. Withdraw 3. Exit");
            int handleInt = Integer.parseInt(bankActions);
        handleOptions(handleInt);
    }

    //handles options
    public void handleOptions(int bankActions) {

        if(bankActions == 1) {
            BankActions deposit = new BankActions();

            String depositAmount = JOptionPane.showInputDialog(null, "How much would you like to deposit");
            int depositInt = Integer.parseInt(depositAmount);

            deposit.deposit(accountNum, depositInt);

        }

        else if(bankActions == 2) {
            BankActions withdraw = new BankActions();

            String withdrawAmount = JOptionPane.showInputDialog(null, "How much would you like to withdraw?");
            int withdrawInt = Integer.parseInt(withdrawAmount);

            withdraw.withdraw(accountNum, withdrawInt);

        }

        else if(bankActions == 3){
            exit();
        }

        else {
            handleError();
        }

    }


    //generic error handler
    public void handleError(){
        System.out.println("Error");
        Menu menu = new Menu();
    }

    //creates a new Menu object
    public void exit() {
        Menu menu = new Menu();
    }
}
