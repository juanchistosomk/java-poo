package diadieciseis;

/**
 *  Subclase: debe usar OBLIGATORIAMENTE 
 *  los metodos ABSTRACTOS.
 *  CONTRATO-> Si heredo de superclase abstracta 
 *  
 *  Al heredar, la clase Perro se convierte en clase Abstracta, y las que hereden de Perro
 */

public class Perro extends Animal  {

	
	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	
	// Sobreescribir método abstracto
	@Override
	public void hacerSonido() {
		System.out.print(getNombre() + " hace GUAU! ");	
	}
	

}
