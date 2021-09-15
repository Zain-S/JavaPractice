package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

class TypeCasting{
    //int to double
    void intToDouble(){
        int num = 10;
        System.out.println("The integer value: " + num);
        double num1 = num;
        System.out.println("The double value: " + num1);
    }
    //double to int
    void doubleToInt(){
        double num = 10.99;
        System.out.println("The double value: " + num);
        int data = (int)num;
        System.out.println("The integer value: " + data);
    }
    //int to String
    void intToString(){
        int num = 10;
        System.out.println("The integer value: " + num);
        String data = String.valueOf(num);
        System.out.println("The string value is: " + data);
    }
    //String to int
    void StringToInt(){
        String data = "10";
        System.out.println("The string value is: " + data);
        int num = Integer.parseInt(data);
        System.out.println("The integer value is: " + num);
    }
}

class LambdaExpression{
    //Implement SAM with anonymous classes in java
    void noParameter(){
        MyInterface myInterface;
        myInterface = () -> 3.1415;
        System.out.println("Value of Pi: " + myInterface.getPieValue());
    }
    void oneOrMoreParameter(){
        MyInterface2 myInterface2;
        myInterface2 = (string) -> {
            String result = "";
            for (int i = string.length()-1; i>=0; i--) {
                result+= string.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda Reversed: " + myInterface2.reverse("Zain"));
    }

    //Generic Functional Interface and Lambda Expressions
    void generic(){
        // reverse function
        GenericInterface<String> reverse;
        reverse = (data) -> {
            String result = "";
            for (int i = data.length()-1; i >= 0 ; i--) {
                result += data.charAt(i);
            }
            return result;
        };
        System.out.println("ZAIN reversed: " + reverse.func("ZAIN"));

        // Factorial
        GenericInterface<Integer> factorial;
        factorial = (data) -> {
            int result = 1;
            for (int i = 1; i <= data ; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Factorial of 5: " + factorial.func(5));
    }

    //using lambdas with the Stream API
    void streamUsingLambda(){
        List<String> myPlaces = Stream.getPlaces();
        System.out.println("Places from Nepal: ");
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }
}
@FunctionalInterface
interface MyInterface{
    double getPieValue();
}
@FunctionalInterface
interface MyInterface2{
    String reverse(String string);
}
@FunctionalInterface
interface GenericInterface<T>{
    T func(T data);
}
class Stream{
    static List<String> places = new ArrayList<>();
    public static List<String> getPlaces(){
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        return places;
    }
}

//Generics
class Generics{
    GenericClass<Integer> genericClass = new GenericClass<>(5);
    GenericClass<String> genericClass1 = new GenericClass<>("Apple");
    void genericClass(){
        System.out.println("Generic Class returns: " + genericClass.getData());
        System.out.println("Generic Class returns: " + genericClass1.getData());
    }
    void genericMethods(){
        genericClass.genericMethod("5");
        genericClass1.genericMethod("String");
    }
}
class GenericClass<T>{
    private T data;
    GenericClass(T data){
        this.data = data;
    }
    <T> void genericMethod(T data){
        System.out.println("Generic Method. ");
        System.out.println("Data passed: " + data);
    }
    T getData(){
        return this.data;
    }
}

//Files
class FileClass {
    //Create a new File
    void createNewFile(){
        File file = new File("newFile.txt");
        try{
            if(file.createNewFile())
                System.out.println("New File is created.");
            else
                System.out.println("File already exists.");
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    //Read a file using FileReader
    void readFile(){
        char[] array = new char[50];
        try {
            FileReader fileReader = new FileReader("OutputFile.txt");
            fileReader.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            fileReader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    //Write to file using FileWrite
    void writeFile(){
        String data = "This is the data in the output file";
        try{
            FileWriter fileWriter = new FileWriter("newFile.txt");
            fileWriter.write(data);
            System.out.println("Data is written to the file.");
            fileWriter.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }

    //Delete a file
    void deleteFile(){
        File file = new File("newFile.txt");
        if(file.delete())
            System.out.println("File deleted.");
        else
            System.out.println("File not deleted");
    }
}

// Primitive Type to Wrapper Objects
class WrapperClass{
    // Primitive Types to Wrapper Objects
    void primitiveToWrapper(){
        int a = 5;
        double b = 5.5;
        Integer obj1 = a;
        Double obj2 = b;
        if(obj1 instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if(obj2 instanceof Double) {
            System.out.println("An object of Double is created.");
        }
    }

    // Wrapper Objects into Primitive Types
    void wrapperToPrimitive(){
        Integer aObj = Integer.valueOf(23);
        Double bObj = Double.valueOf(5.55);
        int a = aObj.intValue();
        double b = bObj.doubleValue();
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
    }
}