package diacatorce.polimorfismodinamico;

/**
 * Clase derivada de Empleado
 */

public class Gerente extends Empleado {

	
	@Override
	public void trabajar() {
		System.out.print("el empleado trabaja - Gestion equipo ");
	}
	
}
