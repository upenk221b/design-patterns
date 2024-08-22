package com.upendra.patterns.creational.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        DatabaseConnection connection1 = DatabaseConnection.getInstance();

        //String builder used here to save memory.
        System.out.println(new StringBuilder("Are both connections same ? ").append(connection.equals(connection1)));

    }
}
