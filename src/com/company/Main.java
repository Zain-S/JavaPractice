package com.company;

import static com.company.Polygon.type;

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
//        main.dogClass();
//        main.dog2Class();
//        main.dog3Class();
//        main.dog4Class();
//        main.animal5Class();
//        main.polygonClass();
//        System.out.println(type);
//        main.polygon2Class();
//        main.polygon3Class();
//        main.polymorphicVariables();
//        main.staticVariables();
//        main.nestedClass();
//        main.accessOuterClassMember();
//        main.staticInnerClass();
        main.staticNestedClass();

        Examples examples = new Examples();
//        examples.printInteger();
//        examples.addition();
//        examples.multiplicationFloat();
//        examples.ascii();
//        examples.calculatorV1();
//        examples.sumOfNNumbers();
//        examples.sumOfNNumbersUsingForEach();
//        examples.vowelOrConstant();
//        examples.rootsOfQuadraticEq(2.3,4, 5.6 );
//        examples.pyramidUsingAsterisk();
//        examples.pyramidUsingNumbers();
//        examples.pyramidUsingAlphabets();
//        examples.invertedHalfPyramidUsingAsterisk();
//        examples.removeAllWhiteSpaces();
//        examples.stringToDate();
//        examples.stringToDateUsingFormatter();
//        examples.concatenateTwoArrays();
//        examples.getCurrentDateTime();


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

    //Method overriding in Java Inheritance
    void dogClass()
    {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }

    //super Keyword in Inheritance
    void dog2Class()
    {
        Dog2 labrador = new Dog2();
        labrador.eat();
        labrador.bark();
    }

    //Implementing Abstract Methods
    void dog3Class() {
        Dog3 d1 = new Dog3();
        d1.makeSound();
        d1.eat();
    }

    //Accesses Constructor of Abstract Classes
    void dog4Class(){
        Dog4 d1 = new Dog4();
    }

    //Static function in abstract class
    void animal5Class(){
        Animal5.eat();
    }

    //Implementing an Interface
    void polygonClass()
    {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }

    //default methods in Java Interfaces
    void polygon2Class()
    {
        Rectangle2 r1 = new Rectangle2();
        r1.getArea();
        r1.getSides();
        Square2 s1 = new Square2();
        s1.getArea();
        s1.getSides();
    }

    //Private and static Methods in Interface
    void polygon3Class()
    {
        Triangle3 t1 = new Triangle3(2, 3, 4);
        t1.getArea();
        t1.getPerimeter(2, 3, 4);
        Polygon3.example();
    }

    //Polymorphic Variables
    void polymorphicVariables(){
        ProgrammingLanguage pl;
        pl = new ProgrammingLanguage();
        pl.display();
        pl = new Java();
        pl.display();
    }

    //Static Variables
    void staticVariables(){
        System.out.println(Test.AGE);
        System.out.println(Test.age);
    }

    //Java Nested and Inner Class
    void nestedClass(){
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }

    //Accessing Members of Outer Class within Inner Class
    void accessOuterClassMember(){
        Car car1 = new Car("Mazda", "8WD");
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());
        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }

    //Static Inner Class
    void staticInnerClass(){
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }

    //Static Nested Class
    void staticNestedClass(){
        Animal6 animal = new Animal6();
        Animal6.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();
        Animal6.Mammal mammal = new Animal6.Mammal();
        mammal.displayInfo();
    }


}

