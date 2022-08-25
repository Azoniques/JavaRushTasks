package com.javarush.task.pro.task06.task0607;

/* 
Добро пожаловать! Но не всем.
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String userName = console.nextLine();


        signIn(userName);
    }

    public static void signIn(String username){

        if(username.equalsIgnoreCase("user")) {
            //System.out.println("Неверный позователь");
            return;
        }

        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
