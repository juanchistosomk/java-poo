package diaveinte.composicionejemplouno;



public class Vehiculo {

	
	private String marca;
	private Motor motor;    // ->  COMPOSICION  "TIENE UN"
							// Referencia a una clase dentro de los ATRIBUTOS de otra clase
	
	
	
	public Vehiculo(String marca, Motor motor) {   // Tipo Motor
		
		this.marca = marca;
		this.motor = motor;
		
	}
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public Motor getMotor() {
		return motor;
	}



	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	
	
	public void mostrarDetalles() {
		System.out.println("Marca: " + this.marca  + "Caballos: " + this.motor.getCaballosDeFuerza());
		this.motor.bujias(0);

	}
		
	
	
	
}
