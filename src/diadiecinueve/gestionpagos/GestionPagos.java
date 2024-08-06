package diadiecinueve.gestionpagos;

public class GestionPagos {

	public static void main(String[] args) {


		// Modificar comportamiento de los objetos 
		MetodoPago tarjetaC = new TarjetaCreditoImpl(
				"09390003445",
				"Maria");
		MetodoPago payPal = new PaypalImpl(
				"Edgar",
				"12345abc");
		MetodoPago cripto = new CriptoMonedaImpl("ASF345GY");
		
		
		
		ProcesadorPago proc = new ProcesadorPago();
		
		proc.procesarPago(tarjetaC, 134500);
		proc.procesarPago(payPal, 64500);
		proc.procesarPago(cripto, 95010);
		
		
	}

}
