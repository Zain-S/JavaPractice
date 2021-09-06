package com.company;

public class OOP2 {

}

//Method overriding in Java Inheritance
class Animal {
public void eat() {
        System.out.println("I can eat");
    }
}
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }
    public void bark() {
        System.out.println("I can bark");
    }
}

//super Keyword in Inheritance
class Animal2 {
    public void eat() {
        System.out.println("I can eat");
    }
}
class Dog2 extends Animal2 {
    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }
    public void bark() {
        System.out.println("I can bark");
    }
}