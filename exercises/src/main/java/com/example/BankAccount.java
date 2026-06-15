package com.example;

public class BankAccount {
    private double balance;
    private String accountNumber;
    
    public BankAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }else{
            throw new IllegalArgumentException();
        }

    }

    public void withdraw(double amount){

        
        if (amount > balance){
            throw new IllegalArgumentException();
        } else if (amount <= 0){
            throw new IllegalArgumentException();
        } else{
            balance = balance - amount;
        }
    }
}
