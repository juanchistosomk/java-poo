package diaquince.gestionvehiculos;

/**
 *  Subclase
 */

public class Camion extends Vehiculo {

	
	private double capacidadCarga;

	public Camion() {
		this("desconocida","desconocido",0, 0.0);
		// TODO Auto-generated constructor stub
	}

	
	public Camion(String marca, String modelo, int anio, double capacidadCarga) {
		super(marca, modelo, anio);
		this.capacidadCarga = capacidadCarga;
		// TODO Auto-generated constructor stub
	}


	public double getCapacidadCarga() {
		return capacidadCarga;
	}


	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	
	

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Capacidad carga: " + this.capacidadCarga + " toneladas");
	}
	
	
	@Override
	public void realizarMantenimiento() {
		System.out.println("El camión esta en mantenimiento, verificar capacidad de carga \n");
	}
	
	
	
	
	
	
}
