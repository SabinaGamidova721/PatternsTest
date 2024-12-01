package com.example.demo;

public class MySQLCommand implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Executing query on MySQL: " + query);
    }
}