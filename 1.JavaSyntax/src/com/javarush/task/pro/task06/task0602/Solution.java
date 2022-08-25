package com.javarush.task.pro.task06.task0602;

/* 
Упорядоченная информация
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println("Я — поэт, зовусь я Цветик.");
        //System.out.println("От меня вам всем приветик.");
        printLines("Privet, ti cho ohuel", 10);
        printLines("sam takoy", 20);
    }
    public static void printLines(String str, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
