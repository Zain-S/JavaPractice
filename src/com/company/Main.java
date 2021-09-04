package com.company;

public class Main {

    public static void main(String[] args) {
        Introduction introduction = new Introduction();
//        introduction.divisionPractice();
//        introduction.incrementDecrement();
//        introduction.ternaryOperator();
//        introduction.nestedTernaryOperator();

        FlowControl flowControl = new FlowControl();
//        flowControl.forEach();

        ArraysClass arrays = new ArraysClass();
//        arrays.simpleArray();
//        arrays.twoDArray();
//        arrays.print2DArray();
//        arrays.print2DArrayUsingForEach();
//        arrays.threeDArray();
//        arrays.threeDArrayUsingForEach();
//        arrays.copyArrayUsingArrayCopy();
//        arrays.copyArrayUsingCopyOfRange();
//        arrays.copying2dArraysUsingLoop();

        OOP1 oop1 = new OOP1();
//        System.out.println(oop1.formatNumber(89.9001151));
        OOP1 oop2 = new OOP1(8);
//        System.out.println("object reference = " + oop2);
//        OOP1 c1 = new OOP1(2, 3);
//        OOP1 c2 = new OOP1(3);
//        OOP1 c3 = new OOP1();
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        ThisExample thisExample = new ThisExample(2, 4);
//        System.out.println("4 factorial = " + OOP1.factorial(4));

        Main main = new Main();
//        main.instanceOfPractice();

        Examples examples = new Examples();
//        examples.printInteger();
//        examples.addition();
//        examples.multiplicationFloat();
//        examples.ascii();
//        examples.calculatorv1();
//        examples.sumOfNNumbers();
//        examples.sumOfNNumbersUsingForEach();
    }

    //instance of practice
    void instanceOfPractice()
    {
        Factorial factorial = new Factorial();
        boolean result1 = factorial instanceof Factorial;
        boolean result2 = factorial instanceof OOP1;
        System.out.println("obj is an instance of OOP1: " + result2);
        System.out.println("obj is an instance of Factorial: " + result1);
    }
}
