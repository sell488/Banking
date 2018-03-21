package com.sell488.Banking.BankActions;

import javax.swing.*;

public class BankActions {

    public BankActions() {

    }

    public void Deposit() {
        String depositAmount = JOptionPane.showInputDialog(null, "How much would you like to deposit");
        int depositInt = Integer.parseInt(depositAmount);


    }
}
