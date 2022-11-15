package comunication;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author David Ugalde
 */
public class SocketServer {
    
    private Socket connection;
    private ServerSocket server; 
    private DataOutputStream outputStream;
    private DataInputStream inputStream;

    public SocketServer() throws IOException {
        server = new ServerSocket(12345, 100);
    }
    
    public void waitForClients() throws IOException {
        connection = server.accept();
    }
    
    public void setStreams() throws IOException {
        setDataOutputStream(new DataOutputStream(new BufferedOutputStream(connection.getOutputStream())));
        setDataInputStream(new DataInputStream(new BufferedInputStream(connection.getInputStream())));
    }
    
    public void closeConnection() {
        try {
            outputStream.close();
            inputStream.close();
            server.close();
        } catch (IOException excepcionES) {
            excepcionES.printStackTrace();
        }
    }
    
    public Socket getConnection() {
        return connection;
    }

    public void setConnection(Socket connection) {
        this.connection = connection;
    }

    public ServerSocket getServidor() {
        return server;
    }

    public void setServidor(ServerSocket server) {
        this.server = server;
    }
    
    public DataOutputStream getOutputStream() {
        return outputStream;
    }

    public void setDataOutputStream(DataOutputStream outputStream) {
        this.outputStream = outputStream;
    }
    
    public DataInputStream getInputStream() {
        return inputStream;
    }

    public void setDataInputStream(DataInputStream inputStream) {
        this.inputStream = inputStream;
    }

}
