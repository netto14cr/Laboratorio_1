package carros;

import motores.Motor;
import motores.MotorDiesel;

public abstract class CarroBase {//patron de diseno template
    
	public abstract void imprimirCategoria();
	private Motor motor;
	
	
	//inyeccion de dependencia que es un tipo de inversion de control
	// esto es permitido por el polimorfismo.
	public CarroBase(Motor motor) {
		this.motor = motor; //composicion
	}
	
	public void imprimirMotor() { //immutable object
		System.out.println(motor.getMotor());
	}
	
	
}
