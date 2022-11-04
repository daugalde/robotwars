package designrobots.common.robotbase;

public class FirePunch extends Weapon {
    //"Fire Punch" nivel 6

    protected FirePunch(int pSpeed) {
        super(pSpeed);
        this.setLevel(6);
    }

    @Override
    void triggerWeapon(int pPosX, int pPosY, ORIENTATION pDirection) {
       
        
    }
    
}
