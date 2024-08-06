package AppJK;

public class Gato extends Mascota {   // Clase Hija
	
	
	// *Solo pueden hacer uso de atributos y métodos PUBLICOS de la clase Padre
	
	public Gato(String nombre, String raza, int edad) {
		
		// super(nombre, raza, edad);
		
		this.nombre=nombre;
		this.raza=raza;
		this.edad=edad;
	}
	
	
}
