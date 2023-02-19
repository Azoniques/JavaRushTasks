package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Map<String, Double> salary = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while(reader.ready()){
                String[] buffer = reader.readLine().split(" ");
                String name = buffer[0];
                double money = Double.parseDouble(buffer[1]);
                salary.merge(name, money, Double::sum);

//                salary.put(key, salary.getOrDefault(key, 0.0)+ d);
            }

        }
        Double max = Collections.max(salary.values());
        salary.forEach((k,v)-> {if(Double.compare(v, max) == 0)System.out.println(k);
        });





    }
}
