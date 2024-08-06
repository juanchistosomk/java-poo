package diadiez;

/**
 * Subclase
 */

public class Abogado extends Empleado {
	
	private String especialidad;
	private int aniosExperiencia;
	
		
	
	public Abogado(String nombre, int edad, String especialidad, int aniosExperiencia) {
		super(nombre, edad);
		this.especialidad = especialidad;
		this.aniosExperiencia = aniosExperiencia;
	}


		
	
	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public int getAniosExperiencia() {
		return aniosExperiencia;
	}


	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	

	
	@Override
	public void mostrarInformacion() {
		
				
		System.out.println("========== Abogado ==========");
		System.out.println();
		
		super.mostrarInformacion();
		
		System.out.println("Especialidad: " + this.especialidad);		
		System.out.println("Años experiencia: " + this.aniosExperiencia);
		
	}

}
