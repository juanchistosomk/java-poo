package diacuatro.ejercicio;

public class Main {
	
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    
	public static void main(String[] args) {

		
		Producto productoUno = new Producto("Jabón Líquido", 10011, "Limpieza", 45.0);
		productoUno.imprimirDetalles();
		
		productoUno.calcularPrecioConImpuestos(19);
		System.out.println("Precio + impuesto(19)%: " + productoUno.getPrecio() );
		
		productoUno.aplicarDescuento(8);
		System.out.println(ANSI_GREEN + "Precio - descuento(8)%: " + productoUno.getPrecio() + ANSI_RESET);
		
		System.out.println();
		
		
		Producto productoDos = new Producto("Huevos");
		productoDos.imprimirDetalles();
		
		productoDos.calcularPrecioConImpuestos(19);
		System.out.println("Precio + impuesto(19)%: " + productoDos.getPrecio() );
		
		productoDos.aplicarDescuento(8);
		System.out.println(ANSI_GREEN + "Precio - descuento(8)%: " + productoDos.getPrecio()  + ANSI_RESET);
		
		System.out.println();
		
		
		Producto productoTres = new Producto("Leche entera", 3401, "Lacteos");
		productoTres.imprimirDetalles();
		
		productoTres.calcularPrecioConImpuestos(19);
		System.out.println("Precio + impuesto(19)%: " + productoTres.getPrecio() );
		
		productoTres.aplicarDescuento(8);
		System.out.println(ANSI_GREEN + "Precio - descuento(8)%: " + productoTres.getPrecio()  + ANSI_RESET);
		
		System.out.println();
		
		
	}

}
