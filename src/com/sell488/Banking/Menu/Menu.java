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



    public void handleError(){
        System.out.println("Error");
        Menu menu = new Menu();
    }

    public void exit() {
        Menu menu = new Menu();
    }
}
