package com.javarush.task.task15.task1522;

public class Earth implements Planet{
    private static Earth instance;

    private Earth() {
        //System.out.println("Earth is created");
    }

    public static Earth getInstance(){
        if(instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
