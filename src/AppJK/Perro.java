package AppJK;

public class Perro extends Mascota {   // Clase Hija
	
	public Perro(String nombre, String raza, int edad) {
		
		// super(nombre, raza, edad);
		
		this.nombre=nombre;
		this.raza=raza;
		this.edad=edad;
	}
	
	// Sobre escritura de Métodos
	// Permite modificar el comportamiento de los métodos de la clase Padre
	// o agregar nuevas funcionalidades
	
	
	@Override
	public void dormir() {
				
		System.out.println("El Perro duerme");
		
		super.dormir();  // Super - Clase Padre: permite CONSERVAR las funcionalidades Originales de la clase Padre al hacer Override

	}
	
	
}
