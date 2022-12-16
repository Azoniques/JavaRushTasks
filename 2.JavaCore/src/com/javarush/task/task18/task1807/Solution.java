package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int comma = (int)',';
        int count=0;
        try (FileInputStream fis = new FileInputStream(
                new BufferedReader(
                        new InputStreamReader(System.in)).readLine())){
            while(fis.available()>0){
                if(fis.read() == comma)count++;
            }
        };
        System.out.println(count);
    }
}
