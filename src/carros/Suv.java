package carros;

import motores.Motor;

public class Suv extends CarroBase {

	public Suv(Motor motor) {
		super(motor);
	}

	@Override
	public void imprimirCategoria() {
      System.out.println("Soy SUV 2");
      imprimirMotor();
	}

}
