package diaocho;

public class Alumno extends Persona {
	
	// Subclase - Clase derivada
	// los atributos y metodos del Padre son heredados
	private String matricula;
	private String carrera;
	
	
	public Alumno(String nombre, int edad, String matricula, String carrera) {
		super(nombre, edad);
		this.matricula = matricula;
		this.carrera = carrera;
	}
	
	
	public Alumno(String nombre, String carrera ) {
		super(nombre);
		this.carrera = carrera;
	}
	

	// Los getters y setters subclase

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	// Sobreescritura de Metodos: agregar o modificar su comportamiento
	// <--- Fechita hacia arriba viene de una clase superior o superclase
	// Fecha hacia abajo es la Superclase
	
	@Override   // anotacion
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Carrera: " + this.carrera);
	}
	
	

}
