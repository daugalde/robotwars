package designrobots.common.robotbase;

public class GolpeDirecto extends Weapon {
    //"Golpe directo" nivel 2 

    protected GolpeDirecto(int pSpeed) {
        super(pSpeed);
        this.setLevel(2);
    }

    @Override
    void triggerWeapon(int pPosX, int pPosY, ORIENTATION pDirection) {
        
    }
    
}
