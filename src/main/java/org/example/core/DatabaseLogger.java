package org.example.core;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Database is logged " + data);
    }
}
