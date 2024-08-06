package diadieciseis;

/**
 *  Subclase
 */

public class Gato extends Animal {

	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}
	
	
	// Sobreescribir método abstracto
	@Override
	public void hacerSonido() {
		System.out.print(getNombre() + " hace MIAU! ");	
	}
	
	

}
