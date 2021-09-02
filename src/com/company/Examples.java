package com.company;

import java.util.Scanner;

public class Examples {
    //example 1
    //Java Program to Print an Integer (Entered by the User)
    public void printInteger(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();
        System.out.println("Number is: " + num);
    }

    //example 2
    //Java Program to Add Two Integers
    public void addition(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2ndt integer: ");
        int num2 = input.nextInt();
        input.close();
        int result = num1+num2;
        System.out.println("Addition is: " + result);
    }

    //example 3
    //Java Program to Multiply two Floating Point Numbers
    public void multiplicationFloat(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st floating number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter 2ndt floating number: ");
        float num2 = input.nextFloat();
        input.close();
        float result = num1 * num2;
        System.out.println("Addition is: " + result);
    }

    //example 4
    //Find ASCII value of a character
    public void ascii()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        int ascii = ch;
        System.out.println("Ascii Value of " + ch + " is: " + ascii);
    }

    //example
    //simple calculator using switch
    public void calculatorv1()
    {
        float result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter number 2: ");
        float num2 = scanner.nextFloat();
        System.out.print("Enter an operator: ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        switch (operator){
            case '/':
                result = num1 / num2;
                System.out.println("Division is: " + result);
                break;
            case  '*':
                result = num1 * num2;
                System.out.println("Multiplication is: " + result);
                break;
            case '+':
                result = num1 + num2;
                System.out.println("Addition is: " + result);
                break;
            case '-':
                result = num1 = num2;
                System.out.println("Subtraction is: " + result);
                break;
            default:
                System.out.println("You entered wrong operator.");
        }
    }

    //example
    //Display Sum of n Natural Numbers
    public void sumOfNNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        scanner.close();
        for (int i = 1; i <= num; i++) sum += i;
        System.out.println("Sum of " + num + " numbers is: " + sum);
    }

    //example
    //Display Sum of n Natural Numbers using for each loop
    public void sumOfNNumbersUsingForEach(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of string: ");
        int size;
        size = scanner.nextInt();
        int[] number = new int[size];
        int sum = 0;
        for (int num: number) {
            System.out.print("Enter a number: ");
            number[num] = scanner.nextInt();
            sum+=number[num];
        }
        System.out.println("Sum of " + number.length + " numbers is: " + sum);
    }
}
