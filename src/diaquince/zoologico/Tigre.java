package diaquince.zoologico;

/**
 *  Subclase
 */
public class Tigre extends Animal {

	
	private String tipoPresa;
		
	
	
	
	public Tigre(String nombre, int edad, String tipoPresa) {
		super(nombre, edad);
		this.tipoPresa = tipoPresa;
	}

	
	public Tigre() {
		this("desconocido", 0, "desconocido");
	}
	
	
	
	public String getTipoPresas() {
		return tipoPresa;
	}


	public void setTipoPresas(String tipoPresa) {
		this.tipoPresa = tipoPresa;
	}
	

	

	// Sobrecarga de Metodos

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Tipo presa: " + this.tipoPresa);
	}
		
		
	@Override
	public void hacerSonido() {
		System.out.println("El tigre Gruñe! 🐯 \n");
	} 
	
	
}
