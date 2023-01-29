package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        args = new String[]{"D:\\test.txt"};
        int countSpace = 0;
        int countChar = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()){
                countChar++;
                if (' ' == (char)fileReader.read()) countSpace++;
            }
        }
        System.out.format("%.2f", 1.0*countSpace/countChar*100);

        }

    }
