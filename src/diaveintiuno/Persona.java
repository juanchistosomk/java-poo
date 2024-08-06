package diaveintiuno;

// Sobreescribir toString()


//@Loombok -> evita agregar constructor y getters y setters
public class Persona {

	
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {	
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	
		
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {  
		return "Nombre: " + this.nombre + "\nEdad: " + this.edad;          //super.toString();
	}
	
	
	/*
	public void mostrarDetalles() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
	}
	*/
	
	

	
	
}
