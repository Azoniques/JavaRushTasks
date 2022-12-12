package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        int maxByte = 0;
        try (FileInputStream fileInputStream = new FileInputStream(file)){

            while (fileInputStream.available() > 0){
                int currByte = fileInputStream.read();
                if(currByte>maxByte) maxByte = currByte;
            }
        }
        System.out.println(maxByte);

    }
}
