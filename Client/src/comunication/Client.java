package comunication;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author David
 */
public class Client {
    
    private Socket client;
    private DataOutputStream outputStream;
    private DataInputStream inputStream;
    private String hostName;

    public Client(String hostName) {
        this.hostName = hostName;
    }
    
    public void tryToConnect() throws IOException {

        //mostrarMensaje("Intentando realizar conexion\n");
        client = new Socket(InetAddress.getByName(hostName), 12345);
        //mostrarMensaje("Conectado a: " + c.getClient().getInetAddress().getHostName());

    }

    public void setStreams() throws IOException {
        outputStream = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        inputStream = new DataInputStream(new BufferedInputStream(client.getInputStream()));
    }

    public void closeConnection() {
        //mostrarMensaje("\nCerrando conexion");

        try {
            outputStream.close();
            inputStream.close();
            client.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public Socket getClient() {
        return client;
    }

    public void setClient(Socket client) {
        this.client = client;
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