package diadiecisiete.practica;


public class Rectangulo extends Figura {
	
	
	private double base;
	private double altura;
	
		

	public Rectangulo(String tipoFigura, double base, double altura) {
		super(tipoFigura);
		this.base = base;
		this.altura = altura;
	}


	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	@Override
	public double calcularArea() {
		
		return this.base * this.altura;
		
	}
	
	
	

}
