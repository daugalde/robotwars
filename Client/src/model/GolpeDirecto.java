
package model;

import robotwar.common.robotbase.ORIENTATION;
import robotwar.common.robotbase.Weapon;

/**
 *
 * @author Sarah
 */
public class GolpeDirecto extends Weapon {
    //"Golpe directo" nivel 2 
    
    protected GolpeDirecto(int pSpeed, int pLevel, int pAttackDistance) {
        super(pSpeed,pLevel,pAttackDistance);
        this.setLevel(2);
    }

    @Override
    protected void triggerWeapon(int posx, int posy, ORIENTATION pdirection) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
