package diaveinte.composicionejemplodos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Memoria mem64 = new Memoria(64);
		Procesador inteli7 = new Procesador("Intel");
		
		Computadora comp = new Computadora(inteli7, mem64);
		comp.mostrarDetalles();

	}

}
