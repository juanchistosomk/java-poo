package diaseis.practica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco clienteUno = new Banco("JK", 1000);
		Banco clienteDos = new Banco("Andres", 5000);
		
		clienteUno.mostrarDetalles();
		
		clienteDos.mostrarDetalles();
		
		// Aplico metodo estatico y actualiza a todos
		Banco.modificarTasaInteres(5.1);
		
		clienteUno.mostrarDetalles();
		
		clienteDos.mostrarDetalles();
		
		
		
	}

}
