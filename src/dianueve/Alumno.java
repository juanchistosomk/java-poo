package dianueve;

public class Alumno extends Persona {
	
	// Subclase (clase derivada)
	
	private String grado;
	private double promedio;
	
	
	
	public Alumno (String nombre, int edad, String grado, double promedio) {
		super(nombre, edad);
		this.grado=grado;
		this.promedio=promedio;
	}

	
	
	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	@Override
	public void mostrarDetalle() {

		System.out.println("=========== Alumno ========");
		super.mostrarDetalle();
		System.out.println("Grado: " + this.grado);
		System.out.println("Promedio: " + this.promedio);

	}
	
	

}
