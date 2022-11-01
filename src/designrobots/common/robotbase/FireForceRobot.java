package designrobots.common.robotbase;

import java.awt.Graphics;
import java.time.LocalTime;

public class FireForceRobot extends IRobot {
	//su weapon va a ser disparar una bola de fuego, es nivel 7
	//sus strikes son "Golpe directo" nivel 2 y "Spiky Hit" nivel 5

	public FireForceRobot(Weapon pdirections, DamageLevel pweapons) {
		super(pdirections, pweapons);
		
	}

	@Override
	public void damage(int pLevel) {
		//hay que evaluar el nivel y actuar acorde a este bajando el nivel de energia
	}

	
	
}
