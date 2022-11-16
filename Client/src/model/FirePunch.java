
package model;

import robotwar.common.robotbase.ORIENTATION;
import robotwar.common.robotbase.Weapon;
/**
 *
 * @author Sarah
 */
public class FirePunch extends Weapon {
    //"Fire Punch" nivel 6
    
    protected FirePunch(int pSpeed, int pLevel, int pAttackDistance) {
        super(pSpeed,pLevel,pAttackDistance);
        this.setLevel(6);
    }

    @Override
    protected void triggerWeapon(int posx, int posy, ORIENTATION pdirection) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
