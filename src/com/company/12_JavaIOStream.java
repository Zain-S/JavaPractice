package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

class JavaIOStream {
}
class InputStreamClass{
    byte[] array = new byte[100];
    void fileInputStream(){
        try{
            InputStream inputStream = new FileInputStream("textWrite.txt");
            System.out.println("Available Bytes in File: " + inputStream.available());
            inputStream.read(array);
            System.out.println("Data read from the file: ");
            String data = new String(array);
            System.out.println(data);
            inputStream.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
}
class OutputStreamClass{
    String data = "This is a line of text inside the file.";
    void fileOutputStream(){
        try{
            OutputStream outputStream = new FileOutputStream("OutputFile.txt");
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            outputStream.write(dataBytes);
            System.out.println("Data is written to the file.");
            outputStream.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
