package diados;

public class Persona {
	
	// Atributos
	
	private String nombre;
	private int edad;
	private String ocupacion;
	
	// Constructor
	
	public Persona(String nombre, int edad, String ocupacion) {
		this.nombre=nombre;
		this.edad=edad;
		this.ocupacion=ocupacion;
	}
	
	
	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;			
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;			
	}
	
	public String getOcupacion() {
		return ocupacion;
	}
	
	public void setOcupacion(String ocupacion) {
		this.ocupacion=ocupacion;			
	}
	
	
	//Metodo comportamiento
	
	public void mostrarDetalles() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Ocupacion: " + ocupacion);
		System.out.println();
	}
	
	

}
