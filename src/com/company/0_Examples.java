package com.company;

import javax.sound.midi.MidiFileFormat;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class Examples {
    //Java Program to Print an Integer (Entered by the User)
    public void printInteger(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();
        System.out.println("Number is: " + num);
    }

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

    //Find the Sum of Natural Numbers using Recursion
    void sumOfNaturalNumbersUsingRecursion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Answer: " + sumUsingRecursion(number));
    }
    int sumUsingRecursion(int number){
        if(number>0)
            return number + sumUsingRecursion(number -1);
        else
            return number;
    }

    //Find Factorial of a Number Using Recursion
    void findFactorialUsingRecursion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Answer: " + factorialUsingRecursion(number));
    }
    int factorialUsingRecursion(int number){
        if(number!=0)
            return number*factorialUsingRecursion(number-1);
        else
            return 1;
    }

    // Binary to Decimal Conversion Using Custom Method
    void binaryToDecimalUsingCustom(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        long number = scanner.nextLong();
        scanner.close();
        System.out.println("Answer: " + convertBinaryToDecimal(number));
    }
    int convertBinaryToDecimal(long number){
        int decimalNumber = 0, i = 0;
        long remainder;
        while (number!=0){
            remainder = number%10;
            number /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            i++;
        }
        return decimalNumber;
    }

    //Binary to Decimal Conversion Using parseInt()
    void binaryToDecimalUsingParseInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = scanner.next();
        scanner.close();
        System.out.println("Answer: " + Integer.parseInt(number, 2));
    }

    //Decimal to Binary Conversion using Custom Method
    void decimalToBinaryUsingCustom(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Answer: " + convertDecimalToBinary(number));
    }
    long convertDecimalToBinary(int number){
        long binaryNumber = 0, i = 1;
        int remainder;
        while (number!=0){
            remainder = number % 2;
            number /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }

    // Decimal to Binary Conversion using toBinaryString()
    void decimalToBinaryUsingToBinaryString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Answer: " + Integer.toBinaryString(number));
    }

    // Reverse a Sentence Using Recursion
    void reverseSentenceUsingRecursion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String sentence = scanner.next();
        scanner.close();
        System.out.println("Answer: " + reverseSentence(sentence));
    }
    String reverseSentence(String sentence){
        if(sentence.length()>0)
            return sentence.substring(sentence.length()-1) + reverseSentence(sentence.substring(0, sentence.length()-1));
        else
            return sentence;
    }

    //Sort Strings in Dictionary Order
    void sortStringInDictionaryOrder(){
        String[] words = { "Ruby", "C", "Python", "Java" };
        String temp;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].charAt(0)>words[j].charAt(0))
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("String in lexicographical order:  " + Arrays.toString(words));
    }

    //Add Two Complex Numbers by Passing Class to a Function
    void AddComplexNumbersByPassingClassToFunction(){
        Complex c1 = new Complex(1,1),
                c2 = new Complex(2,2),
                result;
        result = Complex.add(c1, c2);
        System.out.printf("Result: %.1f + %.1fi ", result.real, result.imaginary);
    }

    //Calculate Difference Between Two Time Periods
    void calculateDifferenceBetweenTwoTimePeriods(){
        Time T1 = new Time(12,34,55);
        Time T2 = new Time(8,12,15);
        Time difference = Time.difference(T1, T2);
        System.out.printf("Time difference is: %d:%d:%d", difference.hours, difference.minutes, difference.seconds);
    }

    //Convert String to Date using predefined formatters
    void convertStringToDate(){
        // Format y-M-d or yyyy-MM-d
        String string = "2021-09-16";
        LocalDate localDate = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(localDate);
    }

    //Round a Number using format
    void roundNumberUsingFormat(){
        double num = 5.45621;
        System.out.format("%.2f",num);
    }

    //Round a Number using DecimalFormat
    void roundNumberUsingDecimalFormat(){
        double num = 5.452123;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.println(decimalFormat.format(num));
    }

    //Concatenate Two Arrays using arraycopy
    void concatenateTwoArraysUsingArraycopy(){
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};
        int length1 = num1.length;
        int length2 = num2.length;
        int[] result = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, result, 0, length1);
        System.arraycopy(num2, 0, result, length1, length2);
        System.out.println("Result: " + Arrays.toString(result));
    }

    //Concatenate Two Arrays without using arraycopy
    void concatenateTwoArraysWithoutUsingArraycopy(){
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};
        int length1 = num1.length;
        int length2 = num2.length;
        int[] result = new int[num1.length + num2.length];
        int pos = 0;
        for (int element:
             num1) {
            result[pos] += element;
            pos++;
        }
        for (int element:
             num2) {
            result[pos] += element;
            pos++;
        }
        System.out.println("Result: " + Arrays.toString(result));
    }

    //Convert char to String
    void convertCharToString(){
        char ch = 'c';
        //Two methods
        String string = Character.toString(ch);
        string = String.valueOf(ch);
        System.out.println(string);
    }

    // Convert char array to String
    void convertCharArrayToString(){
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        String string1 = String.valueOf(ch);
        String string2 = new String(ch);
        System.out.println(string1);
        System.out.println(string2);
    }

    // Convert String to char array
    void convertStringToCharArray(){
        String data = "This is String";
        char[] array = data.toCharArray();
        //Two different outputs
        System.out.println(Arrays.toString(array));
        System.out.println(array);
    }
}
//Add Two Complex Numbers by Passing Class to a Function
class Complex{
    double real;
    double imaginary;
    Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    static Complex add(Complex c1, Complex c2)
    {
        Complex result = new Complex(0, 0);
        result.real = c1.real+ c2.real;
        result.imaginary = c1.imaginary + c2.imaginary;
        return result;
    }
}

//Calculate Difference Between Two Time Period
class Time{
    int seconds;
    int minutes;
    int hours;
    Time(int hours, int minutes, int seconds)
    {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public static Time difference(Time T1, Time T2)
    {
        Time Difference = new Time(0, 0, 0);
        if(T1.seconds<T2.seconds){
            T1.seconds+=60;
            T1.minutes--;
        }
        if(T1.minutes<T2.minutes){
            T1.minutes+=60;
            T1.hours--;
        }
        Difference.seconds = T1.seconds-T2.seconds;
        Difference.minutes = T1.minutes-T2.minutes;
        Difference.hours = T1.hours- T2.hours;
        return Difference;
    }
}