package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city1) {
        System.out.println(String.format("В городе %s сегодня температура воздуха %d", city1.getName(), city1.getTemperature()));

    }

    public static void main(String[] args) {
        City cityMain = new City("Moscow", 19);
        showWeather(cityMain);


    }
}
