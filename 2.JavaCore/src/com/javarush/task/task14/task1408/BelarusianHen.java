package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 666;
    }

    @Override
    String getDescription(){

        return super.getDescription()+ String.format(" Моя страна - %s. Я несу %d яиц в месяц.",
                Country.BELARUS, getCountOfEggsPerMonth());
    }
}

