package diaquince.zoologico;

public class Zoologico {

	public static void main(String[] args) {

		
		Animal elefante = new Elefante("Choky", 29, 1.87);
		Animal leon = new Leon("Simba", 10, "Alta");
		Animal tigre = new Tigre("Mordelón", 16, "Ciervos");
		
		
		elefante.mostrarDetalles();
		elefante.hacerSonido();
		elefante.registrarMantenimientos("Bañar", "Alimentar");
		
		
		
		leon.mostrarDetalles();
		leon.hacerSonido();
		leon.registrarMantenimientos("Revisión veterinario", "Alimentar");

		
		
		tigre.mostrarDetalles();
		tigre.hacerSonido();
		tigre.registrarMantenimientos("Vacunar", "Alimentar");
		
			
		
		System.out.println();
		
		
		// Método estático
		System.out.println("Contador: " + Animal.contadorAnimales() + "\n" );
		
	}

}
