package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
       return 100;
    }
    @Override
    String getDescription(){

//        String str = super.getDescription()+ String.format("Моя страна - %s. Я несу %d яиц в месяц.",
//                Country.RUSSIA, getCountOfEggsPerMonth());
        return super.getDescription()+ String.format(" Моя страна - %s. Я несу %d яиц в месяц.",
                Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
