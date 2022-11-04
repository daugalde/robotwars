package designrobots.common.robotbase;

public class SpikyHit extends Weapon {
    //"Spiky Hit" nivel 5

    protected SpikyHit(int pSpeed) {
        super(pSpeed);
        this.setLevel(5);
    }

    @Override
    void triggerWeapon(int pPosX, int pPosY, ORIENTATION pDirection) {
        
    }
    
}
