package diadiecisiete;

public class Main {

	public static void main(String[] args) {

		Empleado empleadoTP = new EmpleadoTiempoParcial(11, "Rios", 1200, 8, 9);
		Empleado empleadoTC = new EmpleadoTiempoCompleto(22, "Ana", 100, 45);
		
		
		
		empleadoTP.mostrarDetalles();
		
		
		empleadoTC.mostrarDetalles();
		
		
		
		
	}

}
