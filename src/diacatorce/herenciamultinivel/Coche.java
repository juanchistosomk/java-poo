package diacatorce.herenciamultinivel;


/**
 * Subclase que deriva de vehiculo
 */
public class Coche extends Vehiculo {
	
	
	private int numPuertas;

	public Coche(String marca, String modelo, int numPuertas) {
		super(marca, modelo);
		this.numPuertas = numPuertas;
	}

	
	
	
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.print("Num puertas: " + this.numPuertas);
	}
	
	

}
