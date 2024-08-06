package abstracta;

/**
 * Clases Abstractas: defien el que hacer pero NO el como. Las clases hijas son las que se 
 * encargan de como se de hacer.
 * pueden tener constructores, atributos y metodos
 * los metodos unicamente tienen la definicion 
 * 
 */


public abstract class Figura {
	
	
	private int numeroLados;
	
	
	public Figura() {
		this.numeroLados = 0;
	}
	
	
	public abstract double area();   // Método Abstracto
	
	
	
}
