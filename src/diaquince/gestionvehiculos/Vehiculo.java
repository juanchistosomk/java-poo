package diaquince.gestionvehiculos;


/**
 *  Superclase
 */
public class Vehiculo {
	
	
	// atributos heredables
	private String marca;
	private String modelo; 
	private int anio;
	
	// estático, (valores sensibles)
	private static int contadorVehiculo=0;
	
	
	// constructores
	
	
	public Vehiculo(String marca, String modelo, int anio) {		
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		contadorVehiculo++;   // cada que se cree un objeto se incrementa
	}
	
	
	public Vehiculo() {		
		this("desconocida","desconocido",0);   //delegación de contructor		
	}
	
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}

	

	// Método static, para implementar el atributo estático
	
	public static int obtenerContadorVehiculos() {
		return contadorVehiculo;
	}
	
	
	// Metodos comportamiento
	
	public void mostrarDetalles() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Año: " + this.anio + "\n");
		
	}
	
	public void realizarMantenimiento() {   // para sobreescribir
		System.out.println("El vehiculo esta en mantenimiento \n");
	}
	
	
	// Metodo Varargs
	
	public void registrarServicios(String... servicios) {   // para sobreescribir, varargs
		System.out.println("Servicios registrados: \n");

		for(String servicio: servicios) {
			System.out.println("-" + servicio + "\n");
		}
	}
	
	
		

}
