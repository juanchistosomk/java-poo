package diadiez;


public class Main {

	public static void main(String[] args) {
		
		
		Empleado empleado = new Empleado(
				"Juan Pérez", 
				45);
		
		Abogado abogado = new Abogado(
				"Ana López", 
				35, 
				"Derecho Penal", 
				10);
		
		Asistente asistente = new Asistente(
				"Carlos García", 
				28, 
				"Ana López",
				"Licenciatura en Derecho");
		
		Recepcionista recepcionista = new Recepcionista(
				"Laura Martínez", 
				25,
				"Mañana",
				"Español", "Inglés", "Francés");
		
		
		
				
		System.out.println("========== SISTEMA GESTIÓN DESPACHO ABOGADOS ==========");
		System.out.println();
		
		empleado.mostrarInformacion();		
		System.out.println();
		
		abogado.mostrarInformacion();		
		System.out.println();
		
		asistente.mostrarInformacion();
		System.out.println();
		
		recepcionista.mostrarInformacion();
		System.out.println();
				

	}

}
