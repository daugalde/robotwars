package controller;

import comunication.SocketServer;
import java.awt.event.KeyEvent;
import view.View;
import java.io.IOException;
import java.time.LocalTime;
import model.Robot;
import robotwar.common.robotbase.MOVEMENT;

/**
 *
 * @author David
 */
public class Controller implements Runnable {

    private final View view;
    private Robot player1;
    private SocketServer server;

    public Controller() throws IOException {
        server = new SocketServer();
        this.view = new View();
        this.player1 = new Robot(this.view.getPlayer1Label());
        
        this.view.getView().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
                    setMovement(MOVEMENT.LEFT);
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
                    setMovement(MOVEMENT.RIGHT);
                }

                if (evt.getKeyCode() == KeyEvent.VK_UP) {
                    setMovement(MOVEMENT.UP);
                }

                if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                    setMovement(MOVEMENT.DOWN);
                }
                
                if (evt.getKeyCode() == KeyEvent.VK_1) {
                    fireWeapon ();                   
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
                    if (server.getInputStream().readInt() == 0) {
                        this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX() - 4, this.view.getPlayer2Label().getY());
                    }
                    
                    if (server.getInputStream().readInt() == 1) {
                        this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX() + 4, this.view.getPlayer2Label().getY());
                    }
                    
                    if (server.getInputStream().readInt() == 2) {
                        this.view.getPlayer2Label().setLocation(this.view.getPlayer2Label().getX(), this.view.getPlayer2Label().getY() - 4);
                    }
                    if (server.getInputStream().readInt() == 3) {
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

    public void setMovement(MOVEMENT move) {

        try {
            server.getOutputStream().writeInt(move.getValue());
            
            server.getOutputStream().flush();
            
            this.player1.move(move, LocalTime.MIN, null);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void fireWeapon () {
        this.player1.fireWeapon( view.getPanel());
    }
    
    public Robot getModel() {
        return player1;
    }

    public void setModel(Robot admin) {
        this.player1 = admin;
    }
}
