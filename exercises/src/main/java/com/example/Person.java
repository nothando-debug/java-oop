package com.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){        
        this.name = name;
        this.age = age;
    }

    public void setAge(int newAge){
        if (newAge <= 0 || newAge > 150){
            throw new IllegalArgumentException("You are too young or too old");
        } else{
            age = newAge;
        }

    }

    public void setName(String newName){
        if (newName == null || newName.isEmpty()){
            throw new IllegalArgumentException("Name is null or empty");
        } else{
            name = newName;
        }

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "My name is: " + name + ". I am " + age + " years old.";
    }

    
}
