package com.company;

public class OOP1 {
    //empty constructor
//    OOP1(){
//        //empty constructor
//    }

    //this keyword practice
    int instVar;
//    OOP1(int instVar){
//        this.instVar = instVar;
//        System.out.println("this reference = " + this);
//    }

    //this keyword in constructor overloading
    public int a, b;
    public OOP1( int i, int j ){
        this.a = i;
        this.b = j;
    }
    public OOP1(int i){
        this(i, i);
    }
    public OOP1(){
        this(0);
    }
    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

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