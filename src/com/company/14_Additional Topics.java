package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

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
    void singleParameter(){
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
}
@FunctionalInterface
interface MyInterface{
    double getPieValue();
}
@FunctionalInterface
interface MyInterface2{
    String reverse(String string);
}

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
