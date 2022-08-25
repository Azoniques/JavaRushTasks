package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String path  = input.nextLine();
        FileInputStream fin = new FileInputStream(path);
        InputStreamReader inreader = new InputStreamReader(fin);
        BufferedReader bufferedReader = new BufferedReader(inreader);
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            System.out.println(line);
        }
        input.close();
        fin.close();
        bufferedReader.close();
    }
}