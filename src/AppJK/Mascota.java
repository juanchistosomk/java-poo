package AppJK;

public class Mascota {   // Clase Padre
	
	public String nombre;
	public String raza;
	public int edad;
	
	
	// Si la clase Padre tiene Constructor CON PARAMETROS entonces las clases
	// hijas deben usar en sus constructures->  SUPER(.., Parametros);
	// *Si el Constructor no tiene parametros, la palabra SUPER es opcional
	
	public Mascota() {
		// Contructor sin parametros
		//  + de 1 contructor es sobrecarga de constructores
	}
	public Mascota(String nombre, String raza, int edad) {
		this.nombre=nombre;
		this.raza=raza;
		this.edad=edad;
	}
	
	
	
	public void dormir() {
		System.out.println("La mascota duerme");		
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
