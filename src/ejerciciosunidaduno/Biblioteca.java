package ejerciciosunidaduno;


public class Biblioteca {

	public static void main(String[] args) {

		
		Libro libroUno = new Libro(
				"Lo que el viento se llevo", 
				"Arturo", 
				5400);
		
		System.out.println("Titulo: " + libroUno.getTitulo());
		System.out.println("Autor: " + libroUno.getAutor());
		System.out.println("No. de páginas: " + libroUno.getNumeroDePaginas());
		System.out.println();
		
		
		
		Libro libroDos = new Libro(
				"La novela", 
				"Rdost.", 
				3000);
		
		System.out.println("Titulo: " + libroDos.getTitulo());
		System.out.println("Autor: " + libroDos.getAutor());
		System.out.println("No. de páginas: " + libroDos.getNumeroDePaginas());
		System.out.println();
		
		
		
		Libro libroTres = new Libro(
				"Aprende Java", 
				"MHill", 
				2800);
		
		System.out.println("Titulo: " + libroTres.getTitulo());
		System.out.println("Autor: " + libroTres.getAutor());
		System.out.println("No. de páginas: " + libroTres.getNumeroDePaginas());
		System.out.println();
		
		
		
	}

}
