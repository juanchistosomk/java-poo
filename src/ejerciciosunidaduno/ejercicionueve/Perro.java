package ejerciciosunidaduno.ejercicionueve;


public class Perro extends Animal  {

	
	public Perro() {
		super("desconocido", 0, "desconocido");
	}
	
	public Perro(String nombre, int edad, String especie) {
		super(nombre, edad, especie);
	}
	
	
	
	@Override
	public void hacerSonido() {
		
		System.out.println( "🐶 El perro ladra 'Guau' " );
		
	}

	
	
}
