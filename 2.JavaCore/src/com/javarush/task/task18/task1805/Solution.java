package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        long[] arrByte = new long[256];
        byte[] buffer = new byte[64000];
        int bufferSize = 64000;


        try (FileInputStream fileInputStream = new FileInputStream(
                new BufferedReader(
                        new InputStreamReader(System.in)).readLine())) {
            while (fileInputStream.available() > 0){
                if (fileInputStream.available() < 64000) {
                    bufferSize = fileInputStream.available();
                }
                fileInputStream.read(buffer, 0, bufferSize);
                for (int i = 0; i < bufferSize; i++)
                    arrByte[buffer[i] & 0b11111111]++;
            }


            for (int i = 0; i < arrByte.length; i++) {
                if (arrByte[i] > 0) System.out.print(i + " ");
            }
        }
    }

}

