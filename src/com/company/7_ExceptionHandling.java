package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class ExceptionHandling {
    //Exception handling using try...catch
    void exceptionHandlingUsingTryCatch(){
        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    //Java Exception Handling using finally block
    void exceptionHandlingUsingFinallyBlock(){
        try {
            int divideByZero = 5 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        finally {
            System.out.println("This is the finally block");
        }
    }

    //Exception handling using throw
    void exceptionHandlingUsingThrow(){
        try {
            findFile();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}
