package com.sell488.Banking.BankActions;


public class Account {

    private  String name;
    String password;
    private  int id;
    private  double balance;

    public Account(){

    }


    public Account(String name, String password){
        this.name = name;
        this.password = password; //for now all characters are supported
       // this.id = id; //i don't think the user should have the ability to specify his id
    }

    //user options (setters)
    public void addBalance(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void setName(String name){
        this.name = name;
    }

    public void deleteAccount(){
        this.name = null;
        this.id = 0;
        this.balance = 0;

    }

    public void changePassword(String password){
        this.password = password;
    }


    //getters
    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getAccountInfo(){
        return "id: " + id + " name: " + this.name + " balance: " + balance;
    }


}
