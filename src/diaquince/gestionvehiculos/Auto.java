package diaquince.gestionvehiculos;

/**
 *  Subclase
 */

public class Auto extends Vehiculo{

	// Atributo adicional
	private int numeroDePuertas;
	
	
	public Auto() {
		this("desconocida","desconocido",0 ,0);   //delegación de contructor		
	}
	
	
	public Auto(String marca, String modelo, int anio) {
		this(marca, modelo, anio, 0);   //delegación de contructor		
	}
	

	public Auto(String marca, String modelo, int anio, int numeroDePuertas) {
		super(marca, modelo, anio);
		this.numeroDePuertas = numeroDePuertas;
	}


	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("No. puertas: " + this.numeroDePuertas);
	}
	
	
	@Override
	public void realizarMantenimiento() {
		System.out.println("El auto esta en mantenimiento");
	}
	
	
	
}
