package com.company;

public class OOP1 {
}


//Create objects inside the same class
class ObjectInsideClass {
    boolean isOn;
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }
    public static void main(String[] args) {
        ObjectInsideClass led = new ObjectInsideClass();
        led.turnOn();
    }
}