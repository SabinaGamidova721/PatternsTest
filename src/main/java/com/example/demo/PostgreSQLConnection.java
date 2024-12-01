package com.example.demo;

public class PostgreSQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
    }
}