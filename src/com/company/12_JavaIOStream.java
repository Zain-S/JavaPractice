package com.company;

import java.io.FileInputStream;
import java.io.InputStream;

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
