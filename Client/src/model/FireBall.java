package model;

import robotwar.common.robotbase.ORIENTATION;
import robotwar.common.robotbase.Weapon;

/**
 *
 * @author Dell
 */
public class FireBall extends Weapon {
    //es un arma
    //va a ser disparar una bola de fuego, es nivel 7
    
    public FireBall(int pSpeed, int pLevel, int pAttackDistance) {
        super(pSpeed,pLevel,pAttackDistance);
        this.setLevel(7);
    }
    @Override
    protected void triggerWeapon(int i, int i1, ORIENTATION orntn) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
