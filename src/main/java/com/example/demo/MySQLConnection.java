package com.example.demo;

public class MySQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }
}