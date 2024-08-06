package diacuatro;

public class Main {

	public static void main(String[] args) {

		
		Empleado empleadoUno = new Empleado("Juan Carlos C.",1001,"Ingeniero", 5000.0);
		empleadoUno.imprimirDetalles();
		empleadoUno.aplicarAumento(12);
		System.out.println("Aumento (12)%: " + empleadoUno.getSalarioMensual() );
		System.out.println();
		
		Empleado empleadoDos = new Empleado("Jhon Gómez");
		empleadoDos.imprimirDetalles();
		empleadoDos.aplicarAumento(12);
		System.out.println("Aumento (12)%: " + empleadoDos.getSalarioMensual() );
		System.out.println();
		
	}

}
