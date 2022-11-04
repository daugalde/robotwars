package designrobots.common.robotbase;

public class ElectricShock extends Weapon {
    //es un arma
    //disparar un shock electrico de nivel 5

    protected ElectricShock(int pSpeed) {
        super(pSpeed);
        this.setLevel(5);
    }

    @Override
    void triggerWeapon(int pPosX, int pPosY, ORIENTATION pDirection) {
        
    }
    
}
