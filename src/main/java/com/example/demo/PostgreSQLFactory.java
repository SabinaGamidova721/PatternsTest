package com.example.demo;

public class PostgreSQLFactory implements DatabaseFactory {

    @Override
    public Connection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public Command createCommand() {
        return new PostgreSQLCommand();
    }
}