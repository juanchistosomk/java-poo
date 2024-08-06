package ejerciciosunidaduno.ejerciciotres;


public class Persona {

	
	private String  nombre;
	private int edad;
	
	
	// Sobrecarga de constructores
	
	public Persona(String nombre) {
		this(nombre, 0);
	}
	
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}


	
	//
	
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
	
	
	
	// Método
	
	public void presentarse() {
		
		System.out.println("Nombre es " + this.nombre + " y tengo " + this.edad + " años!");
		System.out.println();
		
	}
	
	
	
	
	
}
