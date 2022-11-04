package designrobots.common.robotbase;

public class FireBall extends Weapon {
    //es un arma
    //va a ser disparar una bola de fuego, es nivel 7

    protected FireBall(int pSpeed) {
        super(pSpeed);
        this.setLevel(7);
    }

    @Override
    void triggerWeapon(int pPosX, int pPosY, ORIENTATION pDirection) {
        
    }
    
}
