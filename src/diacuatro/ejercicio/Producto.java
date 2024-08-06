package diacuatro.ejercicio;

public class Producto {

	
	private String nombre;
	private int codigo;
	private String categoria;
	private double precio;
	
	
	public Producto() {		
		this("Desconocido", 0, "Desconocido", 0.0);
	}
	
	public Producto(String nombre) {		
		this(nombre, 0, "Desconocido", 0.0);
	}
	
	public Producto(String nombre, int codigo) {		
		this(nombre, codigo, "Desconocido", 0.0);
	}
	
	public Producto(String nombre, int codigo, String categoria) {		
		this(nombre, codigo, categoria, 0.0);
	}
	
	public Producto(String nombre, int codigo, String categoria, double precio) {		
		this.nombre = nombre;
		this.codigo = codigo;
		this.categoria = categoria;
		this.precio = precio;
	}

	
	// Getters y Setters
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	//// Métodos
	
	
	public void calcularPrecioConImpuestos(double porcentajeImpuesto) {
		if (porcentajeImpuesto > 0)
			this.precio+=(this.precio * porcentajeImpuesto) / 100;
	}
	
	public void aplicarDescuento(double porcentajeDescuento) {
		if (porcentajeDescuento > 0)
			this.precio-=(this.precio * porcentajeDescuento) / 100;
	}
	
	public void imprimirDetalles() {
		System.out.println("======== 🧺 Producto 🧺 ========");
		System.out.println("Nombre: " + nombre);
		System.out.println("Código: " + codigo);
		System.out.println("Categoria: " + categoria);
		System.out.println("Precio: " + precio);
		
	}
	
	
	
	
	
	
	
}
