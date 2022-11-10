/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.View;
import java.io.EOFException;
import java.io.IOException;
import negocio.Administrador.Administrador;

/**
 *
 * @author David
 */
public class Controller extends Thread {

    private Administrador admin;

    public Controller() {
        setAdmin(new Administrador("localhost"));
    }
    
    public Controller(String conexion) {
        
        setAdmin(new Administrador(conexion));
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public void run() {
        
        while (true) {
            try {
                getAdmin().conectarAServidor();   // Paso 1: crear un socket para realizar la conexion

                getAdmin().obtenerFlujos();       // Paso 2: obtener los flujos de entrada y salida

                getAdmin().procesarConexion();     // Paso 3: procesar la conexion
                     
            } // el servidor cerro la conexion
            catch (EOFException excepcionEOF) {
                System.err.println("El cliente termino la conexion");
            } // procesar los problemas que pueden ocurrir al comunicarse con el servidor
            catch (IOException excepcionES) {
                excepcionES.printStackTrace();
            } 
            finally {
                getAdmin().cerrarConexion(); // Paso 4: cerrar la conexion
            }
        }
       
    }
    
    public void asigna(View p)  {
       
        getAdmin().setMensaje(p.getJLabel3());
        getAdmin().setJugador(p.getJLabel1());
        getAdmin().setJugador2(p.getJLabel2());       
        
        getAdmin().getJugador().setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Images/avion.gif")));
        getAdmin().getJugador2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Images/robot2.gif")));
        //getAdmin().llenaVec(p.getJ0(), p.getJ1(), p.getJ2(), p.getJ3(), p.getJ4(), p.getJ5(), p.getJ6(), p.getJ7(), p.getJ8(), p.getJ9(), p.getJ10(), p.getJ11(), p.getJ12(), p.getJ13(), p.getJ14(),p.getT1(),p.getT2());    
    }

    public void datos(int p ) {
        getAdmin().enviarDatos(p);       
    }    
   
   
}
