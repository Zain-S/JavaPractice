package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operators operators = new Operators();
//        operators.divisionPractice();
//        operators.incrementDecrement();
//        operators.ternaryOperator();
//        operators.nestedTernaryOperator();

        FlowControl flowControl = new FlowControl();
//        flowControl.forEach();

        Arrays arrays = new Arrays();
        arrays.twoDArray();

        Examples examples = new Examples();
//        examples.printInteger();
//        examples.addition();
//        examples.multiplicationFloat();
//        examples.ascii();
//        examples.calculatorv1();
//        examples.sumOfNNumbers();
//        examples.sumOfNNumbersUsingForEach();
    }



    //concat function String
    public static void concatFunctionString(){
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

    //Java Program to Print an Integer (Entered by the User)
//    public void printInteger(){
//        System.out.println("Enter an integer: ");
//
//    }
}
