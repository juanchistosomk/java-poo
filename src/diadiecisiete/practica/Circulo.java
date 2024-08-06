package diadiecisiete.practica;


public class Circulo extends Figura {
	
	
	
	private double radio;
	
	
	
	public Circulo(String tipoFigura, double radio) {
		super(tipoFigura);
		this.radio = radio;
	}

	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}




	@Override
	public double calcularArea() {
		
		return Math.PI * this.radio * this.radio;
		
	}
	

}
