package com.sell488.Banking.Menu;

import com.sell488.Banking.BankActions.BankActions;

import javax.swing.*;

public class Menu {

    private int accountNum;
    //inits menu
    public Menu() {
        String user = JOptionPane.showInputDialog(null, "Do you want to access your bank account?");
        bankAccount(user);
    }

    //asks for bank account number
    public void bankAccount(String user){
        int accountNum = 1234;
        this.accountNum = accountNum;
        if(user.equalsIgnoreCase("yes")) {
            String bankAccount = JOptionPane.showInputDialog(null, "What is your bank account number?");
            if(accountNum == Integer.parseInt(bankAccount)) {
                access();
            }

            else handleError();
        }

        else handleError();
    }

    //asks for action type
    public void access() {
            String bankActions = JOptionPane.showInputDialog(null, "1. Deposit 2. Withdraw 3. Exit");
            handleOptions(bankActions);
    }

    //handles options
    public void handleOptions(String bankActions) {

        if(bankActions != "1" || bankActions != "2" || bankActions != "3") {

        }

        else if(bankActions == "1") {

            String depositAmount = JOptionPane.showInputDialog(null, "How much would you like to deposit");
            int depositInt = Integer.parseInt(depositAmount);

            BankActions deposit = new BankActions();
            deposit.Deposit(accountNum, depositInt);

        }

        else if(bankActions == "2") {

        }

        else if(bankActions == "3"){

        }

    }



    public void handleError(){
        System.out.println("Error");
        Menu menu = new Menu();
    }
}
