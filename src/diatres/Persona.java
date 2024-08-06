package diatres;

public class Persona {
	
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;		
	}
	
	// Sobrecarga de Constructores
	
	public Persona() {
		this.nombre = "JK";
		this.edad = 0;
	}
	
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	
	public Persona(int edad) {
		this.nombre = "Desconocido";
		this.edad = 34;
	}


	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}


		
	

}
