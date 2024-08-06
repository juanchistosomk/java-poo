package diaveintiuno.biblioteca;

public class Main {

	public static void main(String[] args) {


		
		Biblioteca biblioteca = new Biblioteca();
		Libro libro = new Libro("sqd", "dewd", 1990);
		Libro libro2 = new Libro("aaddwqd", "dewd", 1990);
		
		
		biblioteca.agregarLibro(libro);
		biblioteca.agregarLibro(libro2);	
		
		
		biblioteca.mostrarLibros();
		
		System.out.println();
		
		biblioteca.eliminarLibro(libro2);
		biblioteca.mostrarLibros();
		
		
	}

}
