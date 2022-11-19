package exercise;

import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class TcpConnection implements Connection {
    private String ipAddress;
    private int port;
    private Connection connection;
    private List<String> list = new ArrayList<>();


    public TcpConnection(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.connection = new Disconnected(this);
    }

    public void setConnected(Connection connect) {
        this.connection = connect;
    }

    @Override
    public String getCurrentState() {
        return this.connection.getCurrentState();
    }

    @Override
    public void connect() {
        this.connection.connect();
    }

    @Override
    public void disconnect() {
        this.connection.disconnect();
    }

    @Override
    public void write(String data) {
        if (getCurrentState().equals("disconnected")) {
            System.out.println("Error! Connection already disconnected");
        } else {
            list.add(data);
        }
    }

}
// END
