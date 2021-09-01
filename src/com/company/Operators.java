package com.company;

public class Operators {
    //Arithmetic Operations Practice
    public void divisionPractice()
    {
        //(9.0 / 2) is 4.5
        float a = 9.0f;
        int b = 2;
        //it will give floating number
        System.out.println(a/b);
    }

    //increment decrement
    public void incrementDecrement(){
        int num = 5;
        int num2 = 5;
        System.out.println(num++);
        System.out.println(num);
        System.out.println(++num2);
        System.out.println(num2);
    }

    //ternary operator
    public void ternaryOperator()
    {
        int feb = 29;
        String result;
        result = (feb == 28)? "Not Leap Year" : "Leap Year";
        System.out.println(result);
    }

    //nested Ternary Operators
    public void nestedTernaryOperator(){
        int n1 = 2, n2 = 9, n3 = -11;
        int largest = (n1 >= n2)? ((n1 >= n3)? n1: n3) : ((n2 >= n3)? n2: n3);
        System.out.println("Largest Number: " + largest);
    }


}
