package com.javarush.task.task18.task1819;

import java.io.*;
import java.nio.ByteBuffer;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        
        try(FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2)){
            
            byte [] buffer1 = new byte[fis1.available()];
            fis1.read(buffer1);
            byte [] buffer2 = new byte[fis2.available()];
            fis2.read(buffer2);
            
            ByteBuffer byteBuffer = ByteBuffer.allocate(buffer1.length + buffer2.length);
            byteBuffer.put(buffer2);
            byteBuffer.put(buffer1);
            byte [] result = byteBuffer.array();
            
            FileOutputStream fos = new FileOutputStream(file1);
            fos.write(result);
            fos.close();
            
        }
        
    }
}
