package dianueve;

public class Profesor extends Persona {
	
	private String[] especialidad;
	private int aniosExperiencia;
	
	
	// VARARGS: Al final
	public Profesor(String nombre, int edad, int aniosExperiencia, String... especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
		this.aniosExperiencia = aniosExperiencia;
	}


	
	
	public String[] getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String[] especialidad) {
		this.especialidad = especialidad;
	}


	public int getAniosExperiencia() {
		return aniosExperiencia;
	}


	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}





	@Override
	public void mostrarDetalle() {
		System.out.println("=========== Profesor ========");
		super.mostrarDetalle();
		
		/*
		String cadena ="";
		for(String cad : this.especialidad) {
			cadena += " "+cad;
		}
		*/
				
		System.out.println("Especialidad: " + String.join(", ", this.especialidad));
		System.out.println("Años experiencia: " + this.aniosExperiencia);
	}
	
	
	
	
	
}
