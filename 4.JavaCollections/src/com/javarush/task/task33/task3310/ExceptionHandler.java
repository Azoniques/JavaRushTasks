package com.javarush.task.task33.task3310;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutionException;

public class ExceptionHandler {
    public static void log(Exception e){
        Helper.printMessage(e.toString());
    }
}
