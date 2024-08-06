package diadieciseis;

public class Main {

	public static void main(String[] args) {

		
		// NO SE PUEDEN crear objetos de  una clase Abstracta
		
		// Aplicar POLIMORFISMO
		
		                  // subclase
		Animal perro = new Perro("Max", 12);
		perro.hacerSonido();  // Metodo abstracto obligatoria implementación
		
		                  // subclase
		Animal gato = new Gato("Tommy", 2);
		gato.hacerSonido();
		System.out.println();	
		gato.dormir();        // Metodo tradicional es opcional 
		
		
		
	}

}
