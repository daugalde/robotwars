package model;

import robotwar.common.robotbase.ORIENTATION;
import robotwar.common.robotbase.Weapon;

/**
 *
 * @author Sarah
 */
public class ElectricShock extends Weapon {
    //es un arma
    //disparar un shock electrico de nivel 5
    
    public ElectricShock(int pSpeed, int pLevel, int pAttackDistance) {
        super(pSpeed,pLevel,pAttackDistance);
        this.setLevel(5);
    }
    @Override
    protected void triggerWeapon(int i, int i1, ORIENTATION orntn) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
