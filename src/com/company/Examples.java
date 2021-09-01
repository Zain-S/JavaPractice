package com.company;

import java.util.Scanner;

public class Examples {
    //Java Program to Print an Integer (Entered by the User)
    public void printInteger(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();
        System.out.println("Number is: " + num);
    }
}
