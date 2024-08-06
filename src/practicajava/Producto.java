package practicajava;

public class Producto {
	
		
	private int id;
	private String nombre;
	private String[] categoria;
	private static int contador = 0;
	 
	
	
	public Producto(int id, String nombre, String... categoria) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		contador++;
	}
	
	
	public Producto() {
		this(0, "desconocido", "desconocido");
	}
	
	
	public Producto(int id, String nombre) {
		this(id, nombre, "desconocido");
	}
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String[] getCategoria() {
		return categoria;
	}


	public void setCategoria(String[] categoria) {
		this.categoria = categoria;
	}
	
	
	@Override
	public String toString() {
		return "Id: " + this.id + " Nombre: " + this.nombre + " Categorias: " + String.join(", ", this.categoria);
	}
	
	
	public static int contadorProductos() {
		return contador;
	}
	
	
	public void colorProducto(String... colores) {   // para sobreescribir, varargs, param en plural
		System.out.println("Colores producto: \n");

		for(String color: colores) {
			System.out.println("-" + color + "\n");
		}
	}
	
	

}
