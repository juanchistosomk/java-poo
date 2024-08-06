package diadieciseis;



abstract public class Animal {
	
	// CLASES ABSTRACTAS
	
	
	// Atributos
	private String nombre;
	private int edad;
	
	
	// Constructor
	public Animal(String nombre, int edad) {		
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




	// Método abstracto: no tienen comportamiento
	abstract public void hacerSonido();
	
	
	// Método concreto (tradicional)
	public void dormir() {
		System.out.println(this.nombre + " duerme!");
	}
	
	
	

}
