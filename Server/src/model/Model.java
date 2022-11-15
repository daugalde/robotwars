package model;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author David
 */
public class Model {

    private JLabel jugador;
    private JLabel jugador2;
    private JLabel mensaje;
    private JLabel obj[];
    private int puntosj1;
    private int puntosj2;
    private JTextField caja1;
    private JTextField caja2;
    
    private int contador;

    public Model() {
        setContador(0);       
        setObj(new JLabel[15]);
        setCaja1(new JTextField());
        setCaja2(new JTextField());
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public JLabel getMensaje() {
        return mensaje;
    }

    public void setMensaje(JLabel mensaje) {
        this.mensaje = mensaje;
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
