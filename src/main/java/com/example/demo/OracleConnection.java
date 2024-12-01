package com.example.demo;

public class OracleConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
    }
}