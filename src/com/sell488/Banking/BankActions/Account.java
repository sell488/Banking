package com.sell488.Banking.BankActions;


public class Account {

    private  String name;
    private  int id;
    private  double balance;

    public Account(String theisAdmin){
        this.name = theisAdmin;
    }

    public Account(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void addBalance(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAccountInfo(){
        return "id: " + id + " name: " + this.name + " balance: " + balance;
    }

}
