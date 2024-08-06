package diadiecinueve.gestionpagos;

public class TarjetaCreditoImpl implements MetodoPago{
	
	

	private String numeroTarjeta;
	private String nombreTitular;
	
	
	public TarjetaCreditoImpl(String numeroTarjeta, String nombreTitular) {	
		this.numeroTarjeta = numeroTarjeta;
		this.nombreTitular = nombreTitular;
	}
	
	
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}


	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}


	public String getNumernombreTitular() {
		return nombreTitular;
	}


	public void setNumernombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	
	
	// implementado metodos abstractos
	
	@Override
	public void procesarPago(double monto) {
		System.out.println("Procesando pago con TC de $" + monto + " de " + this.nombreTitular);
	}
	
	
	@Override
	public String obtenerDetallesPago() {
		return "No. Cuenta: " + this.numeroTarjeta + ", Nombre titular: " + this.nombreTitular;		
	}
	
	
	

}
