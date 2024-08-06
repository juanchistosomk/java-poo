package ejerciciosunidaduno.ejercicionueve;

public class Main {

	public static void main(String[] args) {
		
		
				
		Perro perro = new Perro("Tony", 3, "SED");
		
		perro.mostrarDetalles();
		System.out.println();
		
		perro.describir();
		perro.hacerSonido();		
		System.out.println();
		
		
		
		Gato gato = new Gato("Tommy", 12, "RTG");
		
		gato.mostrarDetalles();
		System.out.println();
		
		gato.describir();
		gato.hacerSonido();		
		System.out.println(); 

		
		
	}

}
