package com.example.demo;

public interface DatabaseFactory {
    Connection createConnection();
    Command createCommand();
}