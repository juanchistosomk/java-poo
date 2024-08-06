package diadiez;

/**
 * Subclase
 */

public class Asistente extends Empleado {
	
	
	private String supervisor;
	private String nivelEstudios;
	
	
	
	public Asistente(String nombre, int edad, String supervisor, String nivelEstudios) {
		super(nombre, edad);
		this.supervisor = supervisor;
		this.nivelEstudios = nivelEstudios;
	}


	

	public String getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}


	public String getNivelEstudios() {
		return nivelEstudios;
	}


	public void setNivelEstudios(String nivelEstudios) {
		this.nivelEstudios = nivelEstudios;
	}




	@Override
	public void mostrarInformacion() {
		
		
		System.out.println("========== Asistente ==========");
		System.out.println();
		
		super.mostrarInformacion();
		
		System.out.println("Supervisor: " + this.supervisor);
		System.out.println("Nivel estudios: " + this.nivelEstudios);
		
	}


}
