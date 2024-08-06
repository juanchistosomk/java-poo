package diadieciocho.implementacioninterfaz;


public class CocheImp implements Vehiculo {
	
	
	private int velocidad;

	
	@Override
	public void arrancar() {
		System.out.println("El coche arrancó");
	}


	@Override
	public void detener() {
		System.out.println("El coche se detuvo");
		
	}


	@Override
	public void acelerar(int incremento) {
		this.velocidad += incremento;
		System.out.print("El coche acelero: " + this.velocidad + " km/h");
	}
	
	
		

}
