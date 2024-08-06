package diatres.delegacionconstructores;

public class Persona {
	
	private String nombre;
	private int edad;
	
	// Sobrecarga de Constructores
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;		
	}
	
	
	// Delegacion constructor		
	public Persona(String nombre) {
		this(nombre, 0);
	}
	
	public Persona(int edad) {
		this("Desconocido", 35);
	}
	
	public Persona() {
		this("JK", 0);
	}


	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}


}
