package com.example;

public class Main {
   
    public static void main(String[] args) {
        // BankAccount b1 = new BankAccount(1000, "num1");

        // System.out.println(b1.toString());
        // b1.deposit(6);
        // b1.withdraw(500);
        // b1.withdraw(507);
        // System.out.println(b1.getBalance());

        Person person1 = new Person("Nothando", 23);
        person1.setAge(27);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }


}