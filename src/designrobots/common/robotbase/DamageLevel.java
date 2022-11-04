package designrobots.common.robotbase;

public class DamageLevel {
	private double damageLevel;
	private boolean enabled;
	
	public DamageLevel() {
		this.damageLevel = 100.0;
		this.enabled = true;
	}

	public void hitDamage(int pLevel) {
		// dado el nivel saco el % de daño, lo rebajo
		// evaluo si llegue a cero o menos, pongo el enabled en false
		int percent;
		if(pLevel >= 3 && pLevel <= 5) {
			//danan un arma o golpe o direccion de movimiento en un 20% por cada nivel
			for(int i = 0; i < pLevel; i++) {
				percent = (int) (this.damageLevel * (20.0f / 100.0f)); 
				this.damageLevel = this.damageLevel - percent;
			}
		} else if(pLevel >= 6 && pLevel <= 8) {
			//danan un arma o golpe o direccion de movimiento en un 30% por cada nivel
			for(int i = 0; i < pLevel; i++) {
				percent = (int) (this.damageLevel * (30.0f / 100.0f)); 
				this.damageLevel = this.damageLevel - percent;
			}
		} else if(pLevel == 9 || pLevel == 10) {
			//danan por completo una de las direcciones de movimiento
			this.damageLevel = 0;
		} 

		if(this.damageLevel <= 0) {
			this.enabled = false;
		}
	}

	public boolean isEnabled() {
		return enabled;
	}
}
