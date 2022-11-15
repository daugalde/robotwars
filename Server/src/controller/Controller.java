package controller;

import comunication.SocketServer;
import java.awt.event.KeyEvent;
import view.View;
import java.io.IOException;
import model.Model;

/**
 *
 * @author David
 */
public class Controller implements Runnable {

    private final View view;
    private Model model;
    private SocketServer server;

    public Controller() throws IOException {
        server = new SocketServer();
        this.model = new Model();
        this.view = new View();

        this.view.getView().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                    setMovement(1);
                }

                if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                    setMovement(2);
                }

                if (evt.getKeyCode() == KeyEvent.VK_UP) {
                    setMovement(3);
                }

                if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                    setMovement(4);
                }
            }
        });
    }

    public void run() {
        try {

            do {

                server.waitForClients();

                server.setStreams();

                do {
                    if (server.getInputStream().readInt() == 1) {
                        this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX() + 4, this.view.getPlayer2Label().getY());
                    }
                    if (server.getInputStream().readInt() == 2) {
                        this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX() - 4, this.view.getPlayer2Label().getY());
                    }
                    if (server.getInputStream().readInt() == 3) {
                        this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX(), this.view.getPlayer2Label().getY() - 4);
                    }
                    if (server.getInputStream().readInt() == 4) {
                        this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX(), this.view.getPlayer2Label().getY() + 4);
                    }

                } while (true);
                
            } while(true);
        } catch (IOException ex) {
            System.err.println("Server Closed Connection");
        } finally {
            server.closeConnection();
        }
    }

    public void setMovement(int enviar) {

        try {
            server.getOutputStream().writeInt(enviar);
            
            server.getOutputStream().flush();

            if (enviar == 1) {
                this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX() + 1, this.view.getPlayer1Label().getY());
            }
            if (enviar == 2) {
                this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX() - 1, this.view.getPlayer1Label().getY());
            }
            if (enviar == 3) {
                this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX(), this.view.getPlayer1Label().getY() - 1);
            }
            if (enviar == 4) {
                this.view.getPlayer1Label().setLocation(this.view.getPlayer1Label().getX(), this.view.getPlayer1Label().getY() + 1);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model admin) {
        this.model = admin;
    }
}
