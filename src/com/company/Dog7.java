package com.company;

import java.io.Serializable;

//Java Class Reflection
//Reflection of Java Methods
//Reflection of Java Fields
//Reflection of Java Constructor
public class Dog7 extends Animal7 implements Serializable {
    String name;
    String breed;
    public String type;
    private String color;
    public Dog7(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public Dog7(){
    }
    private Dog7(int age){
    }
    public void display() {
        System.out.println("I am a dog.");
    }
    private void makeSound() {
        System.out.println("Bark Bark");
    }
}

