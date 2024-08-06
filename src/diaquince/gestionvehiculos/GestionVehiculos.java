package diaquince.gestionvehiculos;

public class GestionVehiculos {

	public static void main(String[] args) {

		// Polimorfismo dinámico 
		Vehiculo vehiculo1 = new Auto("Toyota","Lancer", 2014, 4);
		Vehiculo vehiculo2 = new Motocicleta("AKT","Ninja", 2023, true );
		Vehiculo vehiculo3 = new Camion("Kenworth","Mountain", 2021, 45);
				
		
		vehiculo1.mostrarDetalles();
		vehiculo2.mostrarDetalles();
		vehiculo3.mostrarDetalles();
		
		System.out.println();
		
		vehiculo1.realizarMantenimiento();
		vehiculo2.realizarMantenimiento();
		vehiculo3.realizarMantenimiento();
		
		
		System.out.println();
		// Registrar servicios varargs
		
		vehiculo1.registrarServicios("Cambio de aceite","Revisión de frenos");
		vehiculo2.registrarServicios("Revisión cadena","Cambio aceite");
		vehiculo3.registrarServicios("Verificar motor", "Cambio de neumáticos");
	
		
		System.out.println();
		// Mostrar contador
		
		Vehiculo.obtenerContadorVehiculos();
		
		
		int [] arreglo = new int[10];

		int valor = arreglo[0];
		System.out.println( valor);

		
		
	}

}
