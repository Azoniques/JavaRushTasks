package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //args[0] = "D:\\test.txt";
        int counter = 0;
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            while (fileInputStream.available() > 0) {
                byte b = (byte) fileInputStream.read();
                if (b >= 'A' & b <= 'Z' || b >= 'a' & b <= 'z') counter++;


            }
        }
        System.out.println(counter);
        }
    }

