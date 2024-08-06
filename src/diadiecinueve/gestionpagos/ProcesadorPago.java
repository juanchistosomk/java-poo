package diadiecinueve.gestionpagos;

public class ProcesadorPago {
	
	
							// Objeto como parametro
	public void procesarPago(MetodoPago metodoPago, double monto) {
		metodoPago.procesarPago(monto);
		System.out.println("Detalles del pago" + metodoPago.obtenerDetallesPago());
	}

}
