package model;

import java.awt.Graphics;
import java.time.LocalTime;
import javax.swing.JLabel;
import javax.swing.JTextField;
import robotwar.common.robotbase.IRobot;
import robotwar.common.robotbase.MOVEMENT;
import robotwar.common.robotbase.ORIENTATION;
import robotwar.common.robotbase.Weapon;

/**
 *
 * @author David
 */
public class Robot extends IRobot{


    public Robot() {
      // super.addWeapon(new Weapon());
    }


    protected void refreshMove(MOVEMENT mvmnt, LocalTime lt, Graphics grphcs) {
        System.out.println("Move robot");
    }
    
    
}
