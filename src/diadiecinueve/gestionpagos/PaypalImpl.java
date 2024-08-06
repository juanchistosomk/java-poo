package diadiecinueve.gestionpagos;

public class PaypalImpl implements MetodoPago {
	
	
	private String email;
	private String contrasena;
	public PaypalImpl(String email, String contrasena) {
		this.email = email;
		this.contrasena = contrasena;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// no para password
	
	
	// implementado metodos abstractos
	
	@Override
	public void procesarPago(double monto) {
		System.out.println("Procesando pago con Paypal de $" + monto + " para " + this.email);
	}
	
	
	@Override
	public String obtenerDetallesPago() {
		return "Paypal Email: " + this.email;		
	}
	
	
	
	
	
	

}
