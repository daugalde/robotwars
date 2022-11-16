package model;

import java.awt.Graphics;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import robotwar.common.robotbase.IRobot;
import robotwar.common.robotbase.MOVEMENT;
import view.Panel;

/**
 *
 * @author David
 */
public class Robot extends IRobot {

    private JLabel player1;
    private Weapon currentWeapon;
    private Saw currentHit;

    public Robot(JLabel p1) {
        this.player1 = p1;
        this.currentWeapon = new Weapon();
        this.currentHit = new Saw();
    }

    public JLabel getPlayer1() {
        return player1;
    }

    public void setPlayer1(JLabel p1) {
        this.player1 = p1;
    }

    @Override
    protected void refreshMove(MOVEMENT mvmnt, LocalTime lt, Graphics grphcs) {

        if (mvmnt.getValue() == 0) {
            player1.setLocation(player1.getX() - 1, player1.getY());
        }
        if (mvmnt.getValue() == 1) {
            player1.setLocation(player1.getX() + 1, player1.getY());
        }

        if (mvmnt.getValue() == 3) {
            player1.setLocation(player1.getX(), player1.getY() + 1);
        }

        if (mvmnt.getValue() == 2) {
            player1.setLocation(player1.getX(), player1.getY() - 1);
        }
    }
    
    public void fireWeapon (Panel p) {
        p.getWeapon().setImage(currentWeapon.getImage());
        if(p.getRefreshTimer().isRunning()){
           p.getRefreshTimer().stop();
        }
        p.resetBulletLocation();
        p.getWeapon().setX(player1.getX());
        p.getWeapon().setY(player1.getY());
        p.getRefreshTimer().start();
       
    }
    
    public void strike (Panel p) {
        p.getWeapon().setImage(currentHit.getImage());
        if(p.getRefreshTimer().isRunning()){
           p.getRefreshTimer().stop();
        }
        p.resetBulletLocation();
        p.getWeapon().setX(player1.getX());
        p.getWeapon().setY(player1.getY());
        p.getRefreshTimer().start();
        
        try {
            p.getRefreshTimer().wait((long) 300.0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Robot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        p.getRefreshTimer().stop();
       
    }
}
