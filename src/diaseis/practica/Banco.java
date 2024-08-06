package diaseis.practica;

public class Banco {
	
	// Tasa interes le pertenece al BANCO por eso es estatico
	public static double tasaInteres = 3.1;
	
	private String nombreliente;
	private double saldo;
	 
	public Banco(String nombreCliente, double saldo) {
		this.nombreliente = nombreCliente;
		this.saldo = saldo;
	}
	
	
	// NO SE USA THIS
	public static void modificarTasaInteres(double nuevaTasa) {
		tasaInteres = nuevaTasa; 
	}
	
	
	public void mostrarDetalles() {
		System.out.println("Cliente: " + this.nombreliente);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Tasa de interes: " + tasaInteres);
		
	}
	
	

}
