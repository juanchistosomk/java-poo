package practicajava;

public class Main {

	public static void main(String[] args) {

		
		Producto producto = new Producto(1234, "Mueble", "Oficina", "Hogar");

		
		System.out.println(producto.toString());
		
		
		System.out.println(Producto.contadorProductos());
		
		
		producto.colorProducto("Marron", "Verde", "Azul");
		
		
	}

}
