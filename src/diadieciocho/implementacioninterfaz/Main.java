package diadieciocho.implementacioninterfaz;

public class Main {

	public static void main(String[] args) {

		// Polimorfismo dinámico **DEPENDIENDO LA SITUACION
		Vehiculo coche = new CocheImp();
		
		
		coche.arrancar();
		coche.detener();
		coche.acelerar(45);
		
		
		
	}

}
