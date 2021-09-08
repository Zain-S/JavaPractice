package com.company;

import java.lang.Math;

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
    //by default public static final
    String type = "Polygon";
    //// by default public
    void getArea(int length, int breadth);
}
class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

//default methods in Java Interfaces
interface Polygon2 {
    void getArea();
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}
class Rectangle2 implements Polygon2 {
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }
    public void getSides() {
        System.out.println("I have 4 sides.");
    }
}
class Square2 implements Polygon2 {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

//Private and static Methods in Interface
interface  Polygon3 {
    void getArea();
    static void example(){
        System.out.println("This is example");
    }
    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side: sides) {
            perimeter += side;
        }
        System.out.println("Perimeter: " + perimeter);
    }
}
class Triangle3 implements Polygon3 {
    private int a, b, c;
    private double s, area;
    Triangle3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }
    public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}

//Polymorphic Variables
class ProgrammingLanguage {
    public void display() {
        System.out.println("I am Programming Language.");
    }
}
class Java extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}

//Static Variables
class Test {
    static final int AGE = 16;
    static int age = 20;
}

//Use of static block in java
class StaticBlock {
    static int a = 23;
    static int b;
    static int max;
    static {
        System.out.println("First Static block.");
        b = a * 4;
    }
    static {
        System.out.println("Second Static block.");
        max = 30;
    }
    static void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("max = " + max);
    }
    public static void main(String args[]) {
        display();
    }
}

//Java Nested and Inner Class
class CPU {
    double price;
    class Processor{
        double cores;
        String manufacturer;
        double getCache(){
            return 4.3;
        }
    }
    protected class RAM{
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;
        }
    }
}

//Accessing Members of Outer Class within Inner Class
class Car {
    private String carName;
    private String carType;
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }
    private String getCarName() {
        return this.carName;
    }
    class Engine {
        private String engineType;
        void setEngine() {
            if(Car.this.carType.equals("4WD")){
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }
            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return engineType;
            //this.engineType & engineType are same
        }
    }
}

//Static Inner Class
class MotherBoard {
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
}

//Static Nested Class
class Animal6 {
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }
}

//Anonymous Class Extending a Class
class Polygon4{
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}
class AnonymousDemo {
    public void createClass() {
        Polygon4 polygon4 = new Polygon4() {
            public void display(){
                System.out.println("Inside an anonymous class.");
            }
        };
        polygon4.display();
    }
}