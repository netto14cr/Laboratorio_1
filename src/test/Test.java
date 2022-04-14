package test;

import carros.*;
import motores.MotorDiesel;
import motores.MotorElectrico;
import motores.MotorGas;
import motores.MotorGasolina;

/*
 Nombre: Test.java
 Descripción: Clase encargada de pruebas de inyección de dependencias, composición, poliformismo
 			  con la implementacion de clases Motor y Carros
 Estudiante: Néstor Leiva Mora
 Laboratorio 1 - I ciclo 2022.

 */

public class Test {

	public static void main(String[] args) {

		// Declara el uso de motor gasolina
		MotorGasolina motorGasolina = new MotorGasolina();
		// Delcara el uso de motor de diesel
		MotorDiesel motorDiesel = new MotorDiesel();
		// Delcara el uso de Motor de Gas
		MotorGas motorGas = new MotorGas();
		// Delcara el uso de Motor Electrico
		MotorElectrico motorElectrico = new MotorElectrico();

		// Inyeccción de dependencias para clase de carro Pickup
		CarroBase carro1 =  new Pickup(motorGasolina);
		carro1.imprimirCategoria();

		// Inyeccción de dependencias para clase de carro Sedan
		CarroBase carro2 = new Sedan(motorElectrico);//polimorfismo
		carro2.imprimirCategoria();

		// Inyeccción de dependencias para clase de carro Suv
		CarroBase carro3 =  new Suv(motorGas);
		carro3.imprimirCategoria();

		// Inyeccción de dependencias para clase de carro Crossover
		CarroBase carro4 =  new Crossover(motorDiesel);
		carro4.imprimirCategoria();

	}
	
}
