package com.upendra.patterns.creational.factory;

public class LoggerFactory {
    public static Logger getLogger(String type) throws IllegalArgumentException{
        return switch(type){
            case "console"-> new ConsoleLogger();
            default -> throw new IllegalArgumentException("Unknown Logger type");
        };
    }
}
