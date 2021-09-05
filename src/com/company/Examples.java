package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
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
    public void calculatorV1()
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

    //example 8 Check Whether an Alphabet is Vowel or Consonant
    public void vowelOrConstant()
    {
        System.out.print("Enter a character: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println("Character is vowel");
        else
            System.out.println("Character is constant");
        scanner.close();
    }

    //Find all Roots of a Quadratic Equation
    public void rootsOfQuadraticEq(double a,double b,double c){
        double determinant = b * b - 4 * a * c;
        double real = 0, imaginary = 0;
        String root1, root2;
        if(determinant > 0)
        {
            root1 = String.valueOf((-b + Math.sqrt(determinant)) / (2 * a));
            root2 = String.valueOf((-b - Math.sqrt(determinant)) / (2 * a));
        }
        else if(determinant ==0)
        {
            root1 = root2 = String.format("%.2f",(-b / (2 * a)));
        }
        else
        {
            real = -b / (2 * a);
            imaginary = Math.sqrt(-determinant) / (2 * a);

            root1 = String.format("%.2f",real) + "+" + String.format("%.2f", imaginary) + "i";
            root2 = String.format("%.2f", real) + "-" + String.format("%.2f", imaginary) + "i";
        }
        System.out.println("Root 1 is: " + root1);
        System.out.println("Root 2 is: " + root2);
    }

    //print half pyramid using *
    public void pyramidUsingAsterisk()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //print half pyramid using *
    public void pyramidUsingNumbers()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //print half pyramid using *
    public void pyramidUsingAlphabets()
    {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //print Inverted half pyramid using *
    public void invertedHalfPyramidUsingAsterisk()
    {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Remove All Whitespaces
    public void removeAllWhiteSpaces(){
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }

    //Convert String to Date using predefined formatters
    public void stringToDate()
    {
        String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }

    //String to Date using pattern formatters
    public void stringToDateUsingFormatter()
    {
        String string = "July 25, 2017";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date);
    }

    //Concatenate Two Arrays using arraycopy
    public void concatenateTwoArrays()
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        System.out.println(Arrays.toString(result));
    }

    //Get Current date and time in default form
    public void getCurrentDateTime()
    {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date and Time is: " + current);
    }
}
