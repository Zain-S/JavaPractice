package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

class JavaIOStream {
}
class InputStreamClass{
    void fileInputStream(){
        try{
            FileInputStream inputStream = new FileInputStream("textWrite.txt");
            byte[] array = new byte[inputStream.available()];

            //Available Bytes in stream
            System.out.println("Available Bytes in File: " + inputStream.available());
            inputStream.read();
            inputStream.read();
            inputStream.read();
            System.out.println("Available Bytes in File: " + inputStream.available());
            System.out.println();

            //Data read from the file using read(byte array)...
            inputStream = new FileInputStream("textWrite.txt");
            inputStream.read(array);
            inputStream.close();
            System.out.println("Data read from the file using read(byte array)...");
            String data = new String(array);
            System.out.println(data);

            //Data read from the file using read()...
            inputStream = new FileInputStream("textWrite.txt");
            System.out.println("Data read from the file using read()...");
            int i = inputStream.read();
            while (i!=-1)
            {
                System.out.print((char)i);
                i = inputStream.read();
            }
            inputStream.close();

            //discard and skip the specified number of bytes using skip()...
            System.out.println("discard and skip the specified number of bytes using skip()...");
            inputStream = new FileInputStream("textWrite.txt");
            inputStream.skip(5);
            array = new byte[inputStream.available()];
            inputStream.read(array);
            System.out.println("Data read after skipping 5 bytes: ");
            data = new String(array);
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
