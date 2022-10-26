/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.ObjetosEspecificos;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author David
 */
public class Servidor {
    
    private Socket conexion;
    private ServerSocket servidor;

    public Servidor() {
    }
    
    public Socket getConexion() {
        return conexion;
    }

    public void setConexion(Socket conexion) {
        this.conexion = conexion;
    }

    public ServerSocket getServidor() {
        return servidor;
    }

    public void setServidor(ServerSocket servidor) {
        this.servidor = servidor;
    }
    
}
