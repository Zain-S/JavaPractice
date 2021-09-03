package com.company;

public class OOP1 {
    public String formatNumber(int value) {
        return String.format("%d", value);
    }
    public String formatNumber(double value) {
        return String.format("%.3f", value);
    }
    public String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    //concat function String
    public void concatFunctionString(){
        // create first string
        String first = "Java ";
        System.out.println("First String: " + first);

        // create second
        String second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
    }

    //equals function String
    public static void equalsFunctionString()
    {
        String first = "Java Programming";
        String second = "Java Programming";
        String third = "Python Programming";

        System.out.println("Comparing 1st and 2nd: " + first.equals(second));
        System.out.println("Comparing 2nd and 3rd: " + second.equals(third));
    }


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