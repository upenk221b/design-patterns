package com.upendra.patterns.creational.factory;

import java.util.Date;

public class ConsoleLogger implements Logger{
    @Override
    public void info(String message){
        Date date = new Date();
        System.out.println("["+date+"][localhost:8080][INFO]::" + message);
    }
}
