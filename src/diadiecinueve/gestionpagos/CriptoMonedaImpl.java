package diadiecinueve.gestionpagos;

public class CriptoMonedaImpl implements MetodoPago {
	
	
	private String direccionBilletera;
			
	public CriptoMonedaImpl(String direccionBilletera) {	
		this.direccionBilletera = direccionBilletera;
	}

		

	// implementado metodos abstractos
	
	@Override
	public void procesarPago(double monto) {
		System.out.println("Procesando pago con Cryptomoneda BTC de " + monto );
	}
	
	
	@Override
	public String obtenerDetallesPago() {
		return "Dirección billetera: " + this.direccionBilletera;		
	}

}
