/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.Administrador;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import negocio.ObjetosEspecificos.Cliente;

/**
 *
 * @author David
 */
public class Administrador {

    private JLabel jugador;
    private JLabel jugador2;
    private JLabel obj[];
    private int puntosj1;
    private int puntosj2;
    private JTextField caja1;
    private JTextField caja2;
    private Cliente c;
    private DataOutputStream salida;
    private DataInputStream entrada;
    private JLabel mensaje;
    private String servidorChat;

    public Administrador() {
    }

    public Administrador(String servidorChat) {
        setC(new Cliente());
        setObj(new JLabel[15]);
        setMensaje(new JLabel());
        setServidorChat(servidorChat);
        setCaja1(new JTextField());
        setCaja2(new JTextField());

    }

    public void conectarAServidor() throws IOException {

        mostrarMensaje("Intentando realizar conexion\n");
        c.setCliente(new Socket(InetAddress.getByName(servidorChat), 12345));
        mostrarMensaje("Conectado a: " + c.getCliente().getInetAddress().getHostName());

    }

    public void obtenerFlujos() throws IOException {
        /*
        salida = new ObjectOutputStream(c.getCliente().getOutputStream());
        salida.flush();
        entrada = new ObjectInputStream(c.getCliente().getInputStream());
        */
        salida = new DataOutputStream(new BufferedOutputStream(c.getCliente().getOutputStream()));
        entrada = new DataInputStream(new BufferedInputStream(c.getCliente().getInputStream()));
    }

    public void procesarConexion() throws IOException {

        do {

            try {

                if (entrada.readInt() == 1) {
                    getJugador().setLocation(getJugador().getX() + 4, getJugador().getY());
                   // borraImagen(getJugador(), 1);
                    
                }
                if (entrada.readInt() == 2) {
                    getJugador().setLocation(getJugador().getX() - 4, getJugador().getY());
                   // borraImagen(getJugador(), 1);
                    
                }
                if (entrada.readInt() == 3) {
                    getJugador().setLocation(getJugador().getX(), getJugador().getY() - 4);
                 //   borraImagen(getJugador(), 1);
                        
                }
                if (entrada.readInt() == 4) {
                    getJugador().setLocation(getJugador().getX(), getJugador().getY() + 4);
                  //  borraImagen(getJugador(), 1);
                  
                }

                asignaP();
            } 
            catch (Exception ex) {
                mostrarMensaje("\nSe recibio un tipo de objeto desconocido");
            }

        } while (true);

    }

    public void cerrarConexion() {
        mostrarMensaje("\nCerrando conexion");

        try {
            salida.close();
            entrada.close();
            c.getCliente().close();
        } catch (IOException excepcionES) {
            excepcionES.printStackTrace();
        }
    }

    public void enviarDatos(int enviar) {

        try {

            if (enviar == 1) {
                salida.writeInt(enviar);
                salida.flush();
                jugador2.setLocation(jugador2.getX() + 1, jugador2.getY());
                //borraImagen(jugador2, 2);

            }
            if (enviar == 2) {
                salida.writeInt(enviar);
                salida.flush();
                jugador2.setLocation(jugador2.getX() - 1, jugador2.getY());
                //borraImagen(jugador2, 2);


            }
            if (enviar == 3) {
                salida.writeInt(enviar);
                salida.flush();
                jugador2.setLocation(jugador2.getX(), jugador2.getY() - 1);
                //borraImagen(jugador2, 2);

            }
            if (enviar == 4) {
                salida.writeInt(enviar);
                salida.flush();
                jugador2.setLocation(jugador2.getX(), jugador2.getY() + 1);
                //borraImagen(jugador2, 2);

            }
            asignaP();
            quienGana();
        } catch (IOException excepcionES) {
        }
    }
    
    public void asignaP(){
      caja1.setText(""+puntosj1);
      caja2.setText(""+puntosj2);
    }

    public void borraImagen(JLabel jug, int num) {

        for (int i = 0; i < obj.length; i++) {
            if (getObj()[i].getBounds().intersects(jug.getBounds().getBounds2D()) && getObj()[i].getText().equals("1")) {

                if (getObj()[i].isEnabled()) {

                    if (num == 1) {
                        setPuntosj1(getPuntosj1() + 50);

                    }
                    if (num == 2) {
                        setPuntosj2(getPuntosj2() + 50);
                    }
                }
                getObj()[i].setEnabled(false);
            }
            if (getObj()[i].getBounds().intersects(jug.getBounds().getBounds2D()) && getObj()[i].getText().equals("2")) {

                if (getObj()[i].isEnabled()) {
                    if (num == 1) {
                        setPuntosj1(getPuntosj1() + 75);
                    }
                    if (num == 2) {
                        setPuntosj2(getPuntosj2() + 75);
                    }
                }
                getObj()[i].setEnabled(false);
            }
            if (getObj()[i].getBounds().intersects(jug.getBounds().getBounds2D()) && getObj()[i].getText().equals("3")) {

                if (getObj()[i].isEnabled()) {
                    if (num == 1) {
                        setPuntosj1(getPuntosj1() + 100);
                    }
                    if (num == 2) {
                        setPuntosj2(getPuntosj2() + 100);
                    }
                }
                getObj()[i].setEnabled(false);
            }
            
        }
    }

    public void mostrarMensaje(final String mensajeAMostrar) {

        getMensaje().setText(mensajeAMostrar);
    
    }

    public void llenaVec(JLabel ob0, JLabel ob1, JLabel ob2, JLabel ob3, JLabel ob4, JLabel ob5, JLabel ob6, JLabel ob7, JLabel ob8, JLabel ob9,
            JLabel ob10, JLabel ob11, JLabel ob12, JLabel ob13, JLabel ob14, JTextField j1, JTextField j2) {
        getObj()[0] = ob0;
        getObj()[1] = ob1;
        getObj()[2] = ob2;
        getObj()[3] = ob3;
        getObj()[4] = ob4;
        getObj()[5] = ob5;
        getObj()[6] = ob6;
        getObj()[7] = ob7;
        getObj()[8] = ob8;
        getObj()[9] = ob9;
        getObj()[10] = ob10;
        getObj()[11] = ob11;
        getObj()[12] = ob12;
        getObj()[13] = ob13;
        getObj()[14] = ob14;

        getObj()[0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj2.gif")));
        getObj()[2].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[3].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj2.gif")));
        getObj()[5].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[6].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj2.gif")));
        getObj()[7].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[8].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj2.gif")));
        getObj()[9].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[10].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj2.gif")));
        getObj()[11].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[12].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj2.gif")));
        getObj()[13].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj1.gif")));
        getObj()[14].setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/obj2.gif")));

        getJugador().setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/avion.gif")));
        getJugador2().setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/robot2.gif")));
        
        caja1 = j1;
        caja2 = j2;
    }

    public void quienGana() {
/*        if (!getObj()[0].isEnabled()  &&
            !getObj()[1].isEnabled()  && 
            !getObj()[2].isEnabled()  && 
            !getObj()[3].isEnabled()  && 
            !getObj()[4].isEnabled()  && 
            !getObj()[5].isEnabled()  && 
            !getObj()[6].isEnabled()  &&
            !getObj()[7].isEnabled()  &&
            !getObj()[8].isEnabled()  &&
            !getObj()[9].isEnabled()  &&
            !getObj()[10].isEnabled() &&
            !getObj()[11].isEnabled() &&
            !getObj()[12].isEnabled() &&
            !getObj()[13].isEnabled() &&
            !getObj()[14].isEnabled())
        {
            if (puntosj1 > puntosj2) {
                JOptionPane.showMessageDialog(null, "Gana el jugador 1 con el cohete");
            }
            if (puntosj1 < puntosj2) {
                JOptionPane.showMessageDialog(null, "Gana el jugador 2 con el robot");
            }

            if (puntosj1 == puntosj2) {
                JOptionPane.showMessageDialog(null, "Ambos jugadores estan empatados");
            }
         
        }*/
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
/*
    public ObjectOutputStream getSalida() {
        return salida;
    }

    public void setSalida(ObjectOutputStream salida) {
        this.salida = salida;
    }

    public ObjectInputStream getEntrada() {
        return entrada;
    }

    public void setEntrada(ObjectInputStream entrada) {
        this.entrada = entrada;
    }
*/
    public JLabel getMensaje() {
        return mensaje;
    }

    public void setMensaje(JLabel mensaje) {
        this.mensaje = mensaje;
    }

    public String getServidorChat() {
        return servidorChat;
    }

    public void setServidorChat(String servidorChat) {
        this.servidorChat = servidorChat;
    }

    public JLabel getJugador() {
        return jugador;
    }

    public void setJugador(JLabel jugador) {
        this.jugador = jugador;
    }

    public JLabel getJugador2() {
        return jugador2;
    }

    public void setJugador2(JLabel jugador2) {
        this.jugador2 = jugador2;
    }

    public JLabel[] getObj() {
        return obj;
    }

    public void setObj(JLabel[] obj) {
        this.obj = obj;
    }

    public int getPuntosj1() {
        return puntosj1;
    }

    public void setPuntosj1(int puntosj1) {
        this.puntosj1 = puntosj1;
    }

    public int getPuntosj2() {
        return puntosj2;
    }

    public void setPuntosj2(int puntosj2) {
        this.puntosj2 = puntosj2;
    }

    public JTextField getCaja1() {
        return caja1;
    }

    public void setCaja1(JTextField caja1) {
        this.caja1 = caja1;
    }

    public JTextField getCaja2() {
        return caja2;
    }

    public void setCaja2(JTextField caja2) {
        this.caja2 = caja2;
    }
}
