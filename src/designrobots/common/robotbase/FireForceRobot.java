package designrobots.common.robotbase;

import java.util.Arrays;

public class FireForceRobot extends IRobot {
	//su weapon va a ser disparar una bola de fuego, es nivel 7
	//otra weapon es disparar un shock electrico de nivel 5
	//sus strikes son "Golpe directo" nivel 2 y "Spiky Hit" nivel 5, "Fire Punch" nivel 6

	private DamageLevel[][] elementos = {weapons, strikes, directionsdamage}; //sera para elegir por random que cosa se daña en caso de damage()
	private int random;
	private int random2;
	private boolean isThereAny;
	private boolean available;
	private int index;
	private DamageLevel[] damaged;
	private static FireForceRobot thisRobot = null;

	public FireForceRobot(ORIENTATION pOrientation) {
		super();	
	}

	@Override
	public void damage(int pLevel) {
		//hay que evaluar el nivel y actuar acorde a este bajando el nivel de energia
		if(pLevel == 1 || pLevel == 2) {
			energy = energy - pLevel;
		} else {
			random = (int) (Math.random() * elementos.length - 0 + 1) + 0;
			damaged = elementos[random];
			//hacemos otro random para saber cual del tipo elegido se dañara
			random2 = (int) (Math.random() * damaged.length - 0 + 1) + 0;
			if(damaged[random2].isEnabled()) {
				damaged[random2].hitDamage(pLevel);
			} else {
				isThereAny = false;  //a revisar si hay al menos un elemento que no este completamente danado
				Arrays.stream(damaged) 
					.forEach(e-> { if(e.isEnabled()){
						isThereAny = true;
						index = e.hashCode();
					}});
				if(isThereAny) {
					Arrays.stream(damaged) 
						.forEach(e-> { if(e.isEnabled()){
							if(e.hashCode() == index) {
								e.hitDamage(pLevel);
							}
						}});
				} else {
					DamageLevel[] notThese = damaged;
					available = false;  //a ver si habra uno disponible para dañar
					//si no hay ningun elemento de UN tipo especifico (ya sea arma, golpe o direccion) que podamos
					//hacerle daño debido a que estan destrozados, hay que revisar si en los OTROS tipos se puede
					Arrays.stream(elementos) 
						.forEach(e-> { if(e != notThese) {
							Arrays.stream(e)
								.forEach(i-> { if(i.isEnabled()) {
									available = true;
									i.hitDamage(pLevel);
								}});
						}});
					if(!available) {
						System.out.println("Es posible que el robot este completamente destruido");
					}
				}	
			}
		}
	}

	public static FireForceRobot getInstance(ORIENTATION pOrientation) {
		//singleton
		if (thisRobot == null) {
			thisRobot = new FireForceRobot(pOrientation)
		}
        return thisRobot;
    }
}