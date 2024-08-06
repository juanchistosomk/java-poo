package diacatorce.polimorfismoestatico;

/**
 *  Polimorfismo estatico en tiempo de compilación
 *  con sobrecarga de constructores
 */

public class Persona {
	
	
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {		
		this.nombre = nombre;
		this.edad = edad;
	}


	public Persona(String nombre) {
		this(nombre, 0);
	}
	
	
	// constructor por defecto
	
	public Persona() {
		this("desconocido", 0);
	}
	
	
	
	
	public void mostrarInfo() {
		System.out.print("Nombre: " + this.nombre);
		System.out.print("Edad: " + this.edad);

	}
	
	
	
	
	

}
