package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = bufferedReader.readLine();
        String outputFile1 = bufferedReader.readLine();
        String outputFile2 = bufferedReader.readLine();

        try(FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos1 = new FileOutputStream(outputFile1);
            FileOutputStream fos2 = new FileOutputStream(outputFile2)){

            byte [] buffer = new byte[fis.available()];
            fis.read(buffer,0, buffer.length);
            fos1.write(buffer, 0, buffer.length/2+ buffer.length%2);
            fos2.write(buffer, buffer.length/2+ buffer.length%2, buffer.length/2);


            }




        }


    }

