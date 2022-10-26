/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.UI;

import interfaz.Pantalla;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import negocio.Administrador.Administrador;

/**
 *
 * @author David
 */
public class UI extends Thread {

    private Administrador admin;

    public UI() {
        setAdmin(new Administrador());
    }

    public void run() {
        try {

            // Paso 1: crear un objeto ServerSocket.
            getAdmin().getS().setServidor(new ServerSocket(12345, 100)); // primer parametro es el puerto donde se conecta y el segundo es la cantidad de conexiones

            while (true) {

                try {
                    getAdmin().esperarConexion(); // Paso 2: esperar una conexion.

                    getAdmin().obtenerFlujos();        // Paso 3: obtener flujos de entrada y salida.

                    getAdmin().procesarConexion(); // Paso 4: procesar la conexion.

                } // procesar excepcion EOFException cuando el cliente cierre la conexi�n 
                catch (EOFException excepcionEOF) {
                    System.err.println("El servidor termino la conexion");
                } finally {
                    getAdmin().cerrarConexion();   // Paso 5: cerrar la conexi�n.

                    getAdmin().setContador(getAdmin().getContador() + 1);
                }

            } // fin de instruccion while

        } // fin del bloque try
        catch (IOException excepcionES) {
            excepcionES.printStackTrace();
        }
        while (true) {

            getAdmin().quienGana();
        }
    }

    public void asigna(Pantalla p) {

        getAdmin().setMensaje(p.getJLabel3());
        getAdmin().setJugador(p.getJLabel1());
        getAdmin().setJugador2(p.getJLabel2());
        getAdmin().llenaVec(p.getJ0(), p.getJ1(), p.getJ2(), p.getJ3(), p.getJ4(), p.getJ5(), p.getJ6(), p.getJ7(), p.getJ8(), p.getJ9(), p.getJ10(), p.getJ11(), p.getJ12(), p.getJ13(), p.getJ14(), p.getT1(), p.getT2());

    }

    public void datos(int p) {
        getAdmin().enviarDatos(p);
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }
}
