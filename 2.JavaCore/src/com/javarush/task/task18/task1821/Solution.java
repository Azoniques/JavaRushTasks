package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        args[0] = "D:\\test2.txt";
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {

            int[] array = new int[256];
            while (fileInputStream.available() > 0) {
                int i = fileInputStream.read();
                array[i]++;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    System.out.println((char) i + " " + array[i]);
                }


            }
//        System.out.println(array);
        }
    }
}
