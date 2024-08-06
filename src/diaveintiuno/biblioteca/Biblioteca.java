package diaveintiuno.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	
	
	// Tipo de datos LIBRO
	
	
	private List<Libro> libros;   // Composición: hacemos referencia a otra clase desde el atributo
								  // relación "Tiene un"
	                              // no puede quedar nulo

	
	// Ser cuidadoso al generar el constructor
	public Biblioteca() {
		this.libros = new ArrayList<>();
	}
	
	
	
	
	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	
	public void eliminarLibro(Libro libro) {
		this.libros.remove(libro);
	}
	
	
	public void mostrarLibros() {
		
		if (this.libros.isEmpty()) {
			System.out.println("Aun no hay libros.");
		} else {
			
			for(Libro libro: this.libros) {
				System.out.println("Libro: " + libro);
			}
		}
		
		
	}
	
	
	

}
