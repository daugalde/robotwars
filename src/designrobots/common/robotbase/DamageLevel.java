package designrobots.common.robotbase;

public class DamageLevel {
	private double level;
	private boolean enabled;
	private int percent;
	
	public DamageLevel() {
		this.level = 100.0;
		this.enabled = true;
	}

	public double getLevel() {
		return level;
	}

	public void hitDamage(int pLevel) {
		// dado el nivel saco el % de daño, lo rebajo
		// evaluo si llegue a cero o menos, pongo el enabled en false
		if(pLevel >= 3 && pLevel <= 5) {
			//danan un arma o golpe o direccion de movimiento en un 20% por cada nivel
			for(int i = 0; i < pLevel; i++) {
				percent = (int) (this.level * (20.0f / 100.0f)); 
				this.level = this.level - percent;
			}
		} else if(pLevel >= 6 && pLevel <= 8) {
			//danan un arma o golpe o direccion de movimiento en un 30% por cada nivel
			for(int i = 0; i < pLevel; i++) {
				percent = (int) (this.level * (30.0f / 100.0f)); 
				this.level = this.level - percent;
			}
		} else if(pLevel == 9 || pLevel == 10) {
			//danan por completo una de las direcciones de movimiento
			this.level = 0;
		} 

		if(this.level <= 0) {
			this.enabled = false;
		}
	}

	public boolean isEnabled() {
		return enabled;
	}
}
