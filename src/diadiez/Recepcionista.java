package diadiez;

/**
 * Subclase
 */

public class Recepcionista extends Empleado {
	
	
	private String turno;
	private String[] idiomas;
	
		
	
	public Recepcionista(String nombre, int edad, String turno, String... idiomas) {
		super(nombre, edad);
		this.turno = turno;
		this.idiomas = idiomas;
	}



	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public String[] getIdiomas() {
		return idiomas;
	}


	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}


	

	@Override
	public void mostrarInformacion() {
		
		
		System.out.println("========== Recepcionista ==========");
		System.out.println();
		
		super.mostrarInformacion();
		
		System.out.println("Turno: " + this.turno);
		System.out.println("Idiomas: " + String.join(", ", this.idiomas) );
		
	}

}
