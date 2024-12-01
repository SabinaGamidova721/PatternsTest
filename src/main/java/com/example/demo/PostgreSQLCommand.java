package com.example.demo;

public class PostgreSQLCommand implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Executing query on PostgreSQL: " + query);
    }
}