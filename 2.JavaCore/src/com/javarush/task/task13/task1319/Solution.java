package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";

        while (!line.equalsIgnoreCase("exit")){
            line = reader.readLine();
            stringBuilder.append(line).append("\n");
        }


//        do {
//            line = reader.readLine();
//            bufferedWriter.write(line + "\n");
//        }while (!line.equalsIgnoreCase("exit"));
        bufferedWriter.write(stringBuilder.toString());

        bufferedWriter.close();


    }
}
