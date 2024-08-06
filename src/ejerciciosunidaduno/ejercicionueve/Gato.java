package ejerciciosunidaduno.ejercicionueve;

public class Gato extends Animal {
	

	public Gato() {
		super("desconocido",0,"desconocido");
	}
	
		
	public Gato(String nombre, int edad, String especie) {
		super(nombre, edad, especie);
	}
	
	
	
	@Override
	public void hacerSonido() {
		
		System.out.println( "😸 El gato maúlla 'Miau'" );
		
	}
	

}
