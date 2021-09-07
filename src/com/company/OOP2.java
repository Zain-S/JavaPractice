package com.company;

public class OOP2 {}

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

//Implementing Abstract Methods
abstract class Animal3 {
    abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
    }
}
class Dog3 extends Animal3 {
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

//Accesses Constructor of Abstract Classes
abstract class Animal4 {
    abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
    }
    Animal4()
    {
        System.out.println("Animal 4 Constructor");
    }
}
class Dog4 extends Animal4 {
    public void makeSound() {
        System.out.println("Bark bark");
    }
    Dog4()
    {
        super();
    }
}

//Static function in abstract class
abstract class Animal5 {
    abstract void makeSound();
    static public void eat() {
        System.out.println("I can eat.");
    }
}

//Implementing an Interface
interface Polygon {
    void getArea(int length, int breadth);
}
class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}