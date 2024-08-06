package diados;

public class Libro {
	
	// Atributos
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private double precio;
	
	
	// Constructor
	public Libro(String titulo, String autor, int anioPublicacion, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.precio = precio;
	}
	
	
	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}
		
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
		
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
		
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public double getPrecio() {
		return precio;
	}
		
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	// Metodo comportamiento
	public void mostrarDetalles() {
		
		System.out.println("***** LIBRO *****");
		System.out.println("Titulo-> " + titulo);
		System.out.println("Autor-> " + autor);
		System.out.println("Año publicación-> " + anioPublicacion);
		System.out.println("Precio-> " + precio);
		System.out.println();		
	}
	
	
}