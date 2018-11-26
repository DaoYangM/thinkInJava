package top.daoyang.access.exercise;

public class ConnectionManager {

    private static int count = 0;
    private static Connection[] connections = {Connection.getConnection(), Connection.getConnection(), Connection.getConnection()};

    public static Connection getConnection() {
        if (count < connections.length)
            return connections[count++];
        return null;
    }
    public static void main(String[] args) {
        Connection connection = ConnectionManager.getConnection();
    }
    
}

class Connection {
    private Connection () {}

    static Connection getConnection() {
        return new Connection();
    }
}