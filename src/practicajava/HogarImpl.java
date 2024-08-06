package practicajava;

public class HogarImpl implements AsignacionPrecio {
	
	
	
	
	@Override
	public double subTotal(double precio, int cantidad) {
		return precio * cantidad;
	}
	
	@Override
	public double Total(double subtotal, double descuento) {
		return subtotal - (descuento);
	}

}
