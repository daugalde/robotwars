
package model;

import robotwar.common.robotbase.ORIENTATION;
import robotwar.common.robotbase.Weapon;

/**
 *
 * @author Sarah
 */
public class SpikyHit extends Weapon {
    //"Spiky Hit" nivel 5
    
    protected SpikyHit(int pSpeed, int pLevel, int pAttackDistance) {
        super(pSpeed,pLevel,pAttackDistance);
        this.setLevel(5);
    }

    @Override
    protected void triggerWeapon(int posx, int posy, ORIENTATION pdirection) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
