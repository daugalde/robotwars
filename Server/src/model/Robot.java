package model;

import java.awt.Graphics;
import java.time.LocalTime;
import javax.swing.JLabel;
import robotwar.common.robotbase.IRobot;
import robotwar.common.robotbase.MOVEMENT;

/**
 *
 * @author David
 */
public class Robot extends IRobot {

    private JLabel player1;

    public Robot(JLabel p1) {
        this.player1 = p1;
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

}
