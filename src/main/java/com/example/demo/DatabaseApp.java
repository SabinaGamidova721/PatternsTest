package com.example.demo;

public class DatabaseApp {

    private Connection connection;
    private Command command;

    public DatabaseApp(String dbType) {
        DatabaseFactory factory;

        // Выбор фабрики в зависимости от типа базы данных
        switch (dbType.toLowerCase()) {
            case "oracle":
                factory = new OracleFactory();
                break;
            case "mysql":
                factory = new MySQLFactory();
                break;
            case "postgresql":
                factory = new PostgreSQLFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown database type");
        }
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
    }

    public void executeQuery(String query) {
        connection.connect();
        command.execute(query);
        connection.disconnect();
    }

    public static void main(String[] args) {
        DatabaseApp app = new DatabaseApp("oracle");
        app.executeQuery("SELECT * FROM users");
    }
}
