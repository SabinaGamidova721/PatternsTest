package com.example.demo;

public class MySQLFactory implements DatabaseFactory {

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MySQLCommand();
    }
}