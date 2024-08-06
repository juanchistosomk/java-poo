package diaveinte.composicionejemplodos;

public class Computadora {
	
	

	private Procesador procesador;  // COMPOSICION
	private Memoria memoria;        // COMPOSICION
	
	public Computadora(Procesador procesador, Memoria memoria) {
		this.procesador = procesador;
		this.memoria = memoria;
	}
	
	
	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}
	
	
	
	public void mostrarDetalles() {
		System.out.println("Computadora. 🔳");
		System.out.println("Procesador: " +  this.procesador.getModelo());
		System.out.println("Memoria: " + this.memoria.getCapacidad() );
	}
	
	

}
