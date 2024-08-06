package diaveinte.composicionejemplouno;

public class Main {

	public static void main(String[] args) {

		
		Motor motorV8 = new Motor(80);
		Motor motorSCV5 = new Motor(230);
		
		
		Vehiculo chevrolet2024 = new Vehiculo("Chevi  ", motorV8);
		
		chevrolet2024.mostrarDetalles();
		
	}

}
