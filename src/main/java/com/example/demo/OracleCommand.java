package com.example.demo;

public class OracleCommand implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Executing query on Oracle: " + query);
    }
}