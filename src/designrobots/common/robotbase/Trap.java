package designrobots.common.robotbase;

public abstract class Trap {

	private int posX;
	private int posY;
    private boolean enabled;   //que sea intermitente esto, las trampas se activan y desactivan
	private int trapLevel;
	
	protected Trap(int posX, int posY, int trapLevel) {
		this.posX = posX;
		this.posY = posY;
		this.trapLevel = trapLevel;
	}
	
	public void fire(IRobot robot) {
		if (this.isEnabled()) {
			robot.damage(trapLevel);
		}
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setTrapLevel(int nivel) {
		this.trapLevel = nivel;
	}

	public int getTrapLevel() {
		return trapLevel;
	}
}