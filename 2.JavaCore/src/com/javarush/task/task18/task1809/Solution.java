package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String src = bufferedReader.readLine();
        String dst = bufferedReader.readLine();

        try(FileInputStream fileIn = new FileInputStream(src);
            FileOutputStream fileOut = new FileOutputStream(dst)){

            byte [] buffer = new byte[fileIn.available()];
            fileIn.read(buffer);

            for (int i = buffer.length-1; i >=0 ; i--) {
                fileOut.write(buffer[i]);
            }



        }


    }
}
