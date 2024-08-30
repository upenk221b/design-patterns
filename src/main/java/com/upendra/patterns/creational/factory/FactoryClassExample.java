package com.upendra.patterns.creational.factory;

public class FactoryClassExample {
    public static void main(String[] args) {
        Logger console = LoggerFactory.getLogger("console");

        console.info("Implemented Logger");
    }
}
