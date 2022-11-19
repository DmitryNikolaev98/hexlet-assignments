package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }

    @Override
    public void connect() {
        this.tcpConnection.setConnected(new Connected(this.tcpConnection));
    }

    @Override
    public void disconnect() {
        System.out.println("Error!");

    }

    @Override
    public void write(String data) {

    }

}
// END
