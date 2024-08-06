package diaquince.zoologico;

/**
 *  Subclase
 */
public class Elefante extends Animal {

	
	private double tamanioTrompa;
	
	
	public Elefante(String nombre, int edad, double tamanioTrompa) {
		super(nombre, edad);   // Delegación superclase
		this.tamanioTrompa = tamanioTrompa;
	}
	
	// Sobrecarga de contructores
	public Elefante() {
		this("desconocido", 0, 0.0);   // Delegación de constructor
	}
	
	
	
	

	public double getTamanioTrompa() {
		return tamanioTrompa;
	}

	public void setTamanioTrompa(double tamanioTrompa) {
		this.tamanioTrompa = tamanioTrompa;
	}
	
	
	
	// Sobrescritura de Metodos
	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Tamaño trompa: " + this.tamanioTrompa + " metros");
	}
	
	
	@Override
	public void hacerSonido() {
		System.out.println("El elefante hace RTHRHGERTG! 🐘 \n");
	} 
	
		
	
	
}
