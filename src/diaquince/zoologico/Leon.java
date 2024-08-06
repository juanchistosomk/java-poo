package diaquince.zoologico;

/**
 *  Subclase
 */
public class Leon extends Animal {

	
	private String densidadMelena;
	
	
		
	public Leon(String nombre, int edad, String densidadMelena) {
		super(nombre, edad);
		this.densidadMelena = densidadMelena;
	}
	
	
	public Leon() {
		this("desconocido", 0, "desconocida");
	}
	
	
	
		
	
	public String getDensidadMelena() {
		return densidadMelena;
	}

	public void setDensidadMelena(String densidadMelena) {
		this.densidadMelena = densidadMelena;
	}




	// Sobrecarga de Metodos

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Densidad melena: " + this.densidadMelena);
	}
		
		
	@Override
	public void hacerSonido() {
		System.out.println("El león RUGEE! 🦁 \n");
	} 
	
	
}
