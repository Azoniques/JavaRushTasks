package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Map<String, Double> salary = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while(reader.ready()){
                String[] buffer = reader.readLine().split(" ");
                String key = buffer[0];
                double d = Double.parseDouble(buffer[1]);
                salary.merge(key, d, Double::sum);
//                salary.put(key, salary.getOrDefault(key, 0.0)+ d);
            }

        }
        salary.forEach((k,v)-> System.out.println(k+" "+v));





    }
}
