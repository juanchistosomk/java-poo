package diauno;

public class Main {
	
	public static void main(String[] args) {
		
		// Crear objeto
		// new Inicializar el constructor y reservar espacio en memoria
		Automovil autoUno = new Automovil("Toyota", "Corolla", 2020, 100000.0);  //argumentos
		
		//autoUno.setModelo("Corolla");
		//autoUno.setMarca("Toyota");
		//autoUno.setAnio(2020);
		//autoUno.setPrecio(100000);
		
		autoUno.mostrarDetalles();
		
		
	}

}
