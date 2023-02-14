package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file;
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
            file = console.readLine();
        }
        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))){
            int count = 0;
            while(fileReader.ready()){
                String [] s = fileReader.readLine().split("[^\\w]");
                for (String word : s){
                    if ("world".equals(word)){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }



    }
}
