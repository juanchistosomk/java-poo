package ejerciciosunidaduno.ejercicionueve;

public class Animal {
	
	
	private String  nombre;
	private int edad;
	private String especie;

	
	
	public Animal(String nombre, int edad, String especie) {
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
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


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	// Métodos
	
	public void mostrarDetalles() {
		
		System.out.println( "Nombre: " + this.nombre);
		System.out.println( "Edad: " + this.edad );
		System.out.println( "Especie: " + this.especie );
		
	}
	
	
	public void describir() {
		
		System.out.println( "Nombre: " + this.nombre);
		System.out.println( "Edad: " + this.edad );		
		
	}
	
	
	public void hacerSonido() {
		
		System.out.println( "El animal hace un sonido ");
		
	}
	
	
	
	
}
