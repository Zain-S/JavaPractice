package com.company;

import java.io.*;

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

    //Java Exception Handling using Try Catch finally
    private int[] list = {5, 6, 8, 9, 2};
    void exceptionHandlingUsingTryCatchFinally(){
        PrintWriter out = null;
        try{
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutputFile.txt"));
            for (int i = 0; i < 7; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            if(out!=null)
            {
                System.out.println("Closing Print Writer.");
                out.close();
            }
            else
            {
                System.out.println("Print Writer didn't open.");
            }
        }
    }

    //Multiple Catch blocks
    void multipleCatchBlocks(){
        try {
            list[10] = 11;
        }
        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException: " + e1.getMessage());
        }
        catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException: " + e2.getMessage());
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
        File newFile = new File("text.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }


    //Throwing checked exception
    void throwingCheckedException(){
        try {
            find();
            System.out.println("Rest of code in try block");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    void find() throws IOException {
        throw new IOException("File not found .....");
    }

    //Multi-catch block
    void multiCatchBlock(){
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        }
        //This is not good.
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
        //This is better
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    //try-with-resources
    void tryWithResources(){
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
            while((line = br.readLine()) != null){
                System.out.println("Line: " + line);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
