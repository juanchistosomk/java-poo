package diaquince.gestionvehiculos;

/**
 *  Subclase
 */
public class Motocicleta extends Vehiculo {

	// Atributo adicional
	private boolean tieneCasco;

	
	// Polimorfismo estático
	
	public Motocicleta() {
		this("desconocido","desconocido", 0, false);		
	}
	
	
	public Motocicleta(String marca, String modelo, int anio) {
		this(marca, modelo, anio, false);
		
	}

	public Motocicleta(String marca, String modelo, int anio, boolean tieneCasco) {
		super(marca, modelo, anio);
		this.tieneCasco = tieneCasco;
	}


	public boolean isTieneCasco() {
		return tieneCasco;
	}


	public void setTieneCasco(boolean tieneCasco) {
		this.tieneCasco = tieneCasco;
	}
	
	
	
	
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Tiene casco: " + (this.tieneCasco ? "Si" : "No"));
	}
	
	
	@Override
	public void realizarMantenimiento() {
		System.out.println("La moto esta en mantenimiento, cambio de neumaticos ");
	}
	
	
	
	
}
