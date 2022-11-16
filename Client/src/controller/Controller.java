package controller;

import comunication.Client;
import java.awt.event.KeyEvent;
import view.View;
import java.io.EOFException;
import java.io.IOException;
import model.Robot;

/**
 *
 * @author David
 */
public class Controller implements Runnable {

    private Robot model;
    private final View view;
    private Client client;

    public Controller(String hostName) {
        client = new Client(hostName);
        this.view = new View();
        this.model = new Robot();

        this.view.getView().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                
                if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                    setMovement(0);
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                    setMovement(1);
                }

                if (evt.getKeyCode() == KeyEvent.VK_UP) {
                    setMovement(2);
                }

                if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                    setMovement(3);
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_1) {
                    System.out.println("Hit oponent");
                    
                }
            }
        });
    }

    public void run() {

        while (true) {
            try {
                client.tryToConnect();

                client.setStreams();

                do {

                    try {

                        if (client.getInputStream().readInt() == 0) {
                             this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX() - 4, this.view.getPlayer1Label().getY());
                        }
                        if (client.getInputStream().readInt() == 1) {
                            this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX() + 4, this.view.getPlayer1Label().getY());
                        }
                        if (client.getInputStream().readInt() == 2) {
                            this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX(), this.view.getPlayer1Label().getY() - 4);
                        }
                        if (client.getInputStream().readInt() == 3) {
                            this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX(), this.view.getPlayer1Label().getY() + 4);
                        }

                    } catch (Exception ex) {
                        //mostrarMensaje("\nSe recibio un tipo de objeto desconocido");
                    }

                } while (true);

            }
            catch (EOFException excepcionEOF) {
                System.err.println("Client Close Connection");
            }
            catch (IOException excepcionES) {
                excepcionES.printStackTrace();
            } finally {
                client.closeConnection();
            }
        }
    }

    public void setMovement(int move) {
        try {
            client.getOutputStream().writeInt(move);

            client.getOutputStream().flush();

            if (move == 0) {
                this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX() - 1, this.view.getPlayer2Label().getY());
            }
            if (move == 1) {
                this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX() + 1, this.view.getPlayer2Label().getY());
            }
            if (move == 2) {
                this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX(), this.view.getPlayer2Label().getY() - 1);
            }
            if (move == 3) {
                this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX(), this.view.getPlayer2Label().getY() + 1);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Robot getModel() {
        return model;
    }

    public void setModel(Robot model) {
        this.model = model;
    }
}
