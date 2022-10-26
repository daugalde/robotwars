/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.ObjetosEspecificos;

import java.net.Socket;

/**
 *
 * @author David
 */
public class Cliente {
    
    private Socket cliente;

    public Cliente() {
    }
    
    public Socket getCliente() {
        return cliente;
    }

    public void setCliente(Socket cliente) {
        this.cliente = cliente;
    }
    
}
