package carros;

import motores.Motor;

public class Pickup extends CarroBase {

	public Pickup(Motor motor) {
		super(motor);
	}

	@Override  //sobreescritura de metodos
	public void imprimirCategoria() {
		System.out.println("Soy Pickup");
		imprimirMotor();
	
	}
	
	//sobrecarga de metodos
	public void imprimirCategoria(String name) {
	  System.out.println(name);
	}
	

}
