package carros;

import motores.Motor;
import motores.MotorDiesel;

public class Sedan extends CarroBase {

	public Sedan(Motor motor) {
		super(motor);
	}

	@Override
	public void imprimirCategoria() {
		System.out.println("Soy Sedan");
		imprimirMotor();
	}
}
