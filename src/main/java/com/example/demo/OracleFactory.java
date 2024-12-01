package com.example.demo;

public class OracleFactory implements DatabaseFactory {

    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Command createCommand() {
        return new OracleCommand();
    }
}