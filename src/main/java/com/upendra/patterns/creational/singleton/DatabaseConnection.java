package com.upendra.patterns.creational.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    //Private constructor
    private DatabaseConnection(){
        System.out.println("Database connection created!");
    }

    //static method to get single instance lazily
    public static DatabaseConnection getInstance(){
        //Lazy initialization
        if(instance == null){
            System.out.println("Creating new database connection..");
            instance = new DatabaseConnection();
        }
        System.out.println("Fetching the database connection...");
        return instance;
    }

}
