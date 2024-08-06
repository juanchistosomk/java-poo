package diacatorce.polimorfismodinamico;

public class Empresa {

	public static void main(String[] args) {

		Empleado emp = new Empleado();
		Empleado ger = new Gerente();
		Empleado dev = new Desarrollador();
		
		
		emp.trabajar();
		ger.trabajar();
		dev.trabajar();
		
				
		
	}

}
