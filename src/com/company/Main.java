package com.company;

import java.lang.module.ModuleFinder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

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
//        main.staticNestedClass();
//        main.anonymousClass();
//        main.anonymousClassWithInterface();
//        main.singletonClass();
//        main.javaEnum();
//        main.javaEnumWithSwitch();
//        main.javaEnumMethods();
//        main.javaEnumConstructor();
//        main.javaEnumString();
//        main.javaClassReflection();
//        main.reflectionOfClassMethods();
        main.reflectionOfCLassFields();

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

    //Anonymous Class Extending a Class
    void anonymousClass(){
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }

    //Anonymous Class Implementing an Interface
    void anonymousClassWithInterface(){
        AnonymousDemo5 an = new AnonymousDemo5();
        an.createClass();
    }

    //Use of Singleton in Java
    void singletonClass(){
        Database db1;
        db1= Database.getInstance();
        db1.getConnection();
    }

    //Java Enum Class
    void javaEnum(){
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println(Size.LARGE);
        System.out.println(Size.EXTRALARGE);
        Size pizzaSize = Size.LARGE;
        System.out.println("Pizza Size is: " + pizzaSize);

        System.out.println("The size of the pizza is " + Size.LARGE.getSize());
    }

    //Java Enum with the switch statement
    void javaEnumWithSwitch(){
        Test2 t1 = new Test2(Size.MEDIUM);
        t1.orderPizza();
    }

    //Java Enum Methods
    void javaEnumMethods(){
        Size pizzaSize = Size.LARGE;
        System.out.println("Ordinal is: " + pizzaSize.ordinal());
        System.out.println("Comparing to Medium: " + pizzaSize.compareTo(Size.MEDIUM));
        System.out.println("String representation: " + Size.SMALL.toString());
        Size extraSmall = Size.valueOf("SMALL");
        System.out.println("Value of Extra Small: " + extraSmall);
        Size[] enumArray = Size.values();
        System.out.println(Arrays.toString(enumArray));
    }

    //enum Constructor
    void javaEnumConstructor(){
        Size2 size = Size2.SMALL;
        System.out.println(size.getSize());
    }

    //Java enum Strings
    void javaEnumString(){
        System.out.println(Size3.MEDIUM.toString());
    }

    //Java Class Reflection
    void javaClassReflection(){
        try {
            Dog7 d1 = new Dog7();
            Class obj = d1.getClass();
            String name = obj.getName();
            System.out.println("Name: " + name);
            int modifier = obj.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Reflection of Java Methods
    void reflectionOfClassMethods(){
        try {
            Dog7 d1 = new Dog7();
            Class obj = d1.getClass();
            Method[] methods = obj.getDeclaredMethods();
            for (Method m: methods) {
                System.out.println("Method Name: " + m.getName());
                System.out.println("Modifier: " + Modifier.toString(m.getModifiers()));
                System.out.println("Return Type: " + m.getReturnType());
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Reflection of Java Fields
    void reflectionOfCLassFields(){
        try {
            Dog7 d1 = new Dog7();
            Class obj = d1.getClass();

            Field field1 = obj.getField("type");
            field1.set(d1, "labrador");
            String typeValue = (String) field1.get(d1);
            System.out.println("Type Value: " + typeValue);
            System.out.println("Modifier: " + Modifier.toString(field1.getModifiers()));
            System.out.println();

            Field field2 = obj.getDeclaredField("color");
            field2.setAccessible(true);
            field2.set(d1, "White");
            String colorValue = (String) field2.get(d1);
            System.out.println("Color Value: "  + colorValue);
            System.out.println("Modifier:" + Modifier.toString(field2.getModifiers()));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
