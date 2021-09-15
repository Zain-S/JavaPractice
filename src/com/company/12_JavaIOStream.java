package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

class JavaIOStream {
}
class InputStreamClass{
    //Read Files
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
    //almost useless
    void byteArrayInputStream(){
        byte[] array = {1, 2, 3, 4, 5};
        try{
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
            System.out.println("Available bytes at the beginning: " + byteArrayInputStream.available());
            System.out.println("The bytes read from the input stream: ");
            for (int i = 0; i < array.length; i++) {
                //available() method
                System.out.println("Available bytes at Loop " + i + ": " + byteArrayInputStream.available());
                //read() method
                System.out.println("Data: " + byteArrayInputStream.read() + ", ");
            }
            //skip method()
            System.out.println("Skipping 1st Two inputs...");
            byteArrayInputStream = new ByteArrayInputStream(array);
            byteArrayInputStream.skip(2);
            System.out.println("The bytes read from the input stream: ");
            int data = byteArrayInputStream.read();
            while(data!=-1)
            {
                System.out.print(data + ", ");
                data = byteArrayInputStream.read();
            }
            byteArrayInputStream.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

    }
    //Convert object to stream to save in file
    void objectInputStream(){
        OutputStreamClass.objectOutputStream();
    }
    //The buffer will help to read bytes from the files more quickly.
    void bufferInputStream(){
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i!=-1)
            {
                System.out.print((char)i);
                i = bufferedInputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class OutputStreamClass{
    //Write Files
    void fileOutputStream(){
        try{
            String data = "This is a line of text inside the file.";

            //FileOutputStream to write data to a File
            OutputStream outputStream = new FileOutputStream("OutputFile.txt");
            outputStream.write(data.getBytes());
            System.out.println("Data is written to the file.");
            outputStream.close();

        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
    //almost useless
    void byteArrayOutputStream(){
        String data = "This is a line of text inside the string.";
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream())
        {
            byte[] array = data.getBytes(StandardCharsets.UTF_8);
            byteArrayOutputStream.write(array);
            String streamData = byteArrayOutputStream.toString();
            System.out.println("Output Stream: " + streamData);
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

    }
    //Convert object to stream to save in file
    static void objectOutputStream(){
        int data1 = 5;
        String data2 = "This is String";
        try(FileOutputStream fileOutputStream = new FileOutputStream("OutputFile.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            //Write data in file
            objectOutputStream.writeInt(data1);
            objectOutputStream.writeObject(data2);

            //Read data from file
            try(FileInputStream fileInputStream = new FileInputStream("OutputFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
            {
                System.out.println("Integer: " + objectInputStream.readInt());
                System.out.println("String: " + objectInputStream.readObject());
            }
            catch (Exception e)
            {
                e.getStackTrace();
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
    void objectOutputStream2(){
        Dog7 dog1 = new Dog7("Tyson", "Labrador");
        try(FileOutputStream fileOutputStream = new FileOutputStream("OutputFile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            //Write data
            objectOutputStream.writeObject(dog1);
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

        //Read data
        try(FileInputStream fileInputStream = new FileInputStream("OutputFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            Dog7 dog2 = (Dog7) objectInputStream.readObject();
            System.out.println("Name: " + dog2.name);
            System.out.println("Breed: " + dog2.breed);
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
    //The buffer will help to read bytes from the files more quickly.
    void bufferedOutputStream(){
        String data = "This is a line of text inside the file";

        try {
            FileOutputStream file = new FileOutputStream("output.txt");
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
