package diaveintiuno.biblioteca;

public class Libro {
	
	
	private String titulo;
	private String autor;
	private int anio;
	
	
	public Libro(String titulo, String autor, int anio) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
	}
	
	
	
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


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	@Override
	public String toString() {   // Se llama solo
		return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nAño publicación: " + this.anio;
	}
	
	
	/*
	public void mostrarDetalles() {  // **para Mostrar atributos de la Clase
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Año publicación: " + this.anio);
	}
	*/
	

}
