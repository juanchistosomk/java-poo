package diacatorce.herenciamultinivel;

/**
 * Subclase que deriva de Coche
 */

public class CocheDeportivo extends Coche {
	
	
	private int velocidadMax;

	
	public CocheDeportivo(String marca, String modelo, int numPuertas, int velocidadMax) {
		super(marca, modelo, numPuertas);
		this.velocidadMax = velocidadMax;
	}


	
	
	public int getVelocidadMax() {
		return velocidadMax;
	}


	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
	
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.print("Velocidad max: " + this.velocidadMax);
	}
	
	
	

}
