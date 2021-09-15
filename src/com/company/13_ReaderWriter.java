package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

class ReaderClass {
    //File Reader
    void fileReader(){
        try {
            Reader reader = new FileReader("ReaderWriter.txt");
            char[] array = new char[100];
            System.out.println("Is there data in the stream?  " + reader.ready());
            reader.read(array);
            System.out.println("Data in stream: ");
            System.out.println(array);
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Stream Reader
    void inputStreamReader(){
        char[] array = new char[100];
        try{
            FileInputStream fileInputStream = new FileInputStream("ReaderWriter.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            //Custom encoding
            InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream, Charset.forName("Cp1252"));
            inputStreamReader.read(array);
            System.out.println("Data in the stream: ");
            System.out.println(array);
            //getEncoding()
            System.out.println("Character encoding of input1: " + inputStreamReader.getEncoding());
            System.out.println("Character encoding of input2: " + inputStreamReader1.getEncoding());
            inputStreamReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class WriterClass{
    //File Writer
    void fileWriter(){
        String data = "This is the data in the output file.";
        try{
            Writer writer = new FileWriter("ReaderWriter.txt");
            writer.write(data);
            writer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Stream Writer
    void outputStreamWriter(){
        String data = "This is a line of text inside the file.";
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("ReaderWriter.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}