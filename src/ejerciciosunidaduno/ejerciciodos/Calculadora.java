package ejerciciosunidaduno.ejerciciodos;

public class Calculadora {
	
	
	private double primerValor;
	private double segundoValor;
	
	
	
	public Calculadora(double primerValor, double segundoValor) {
		this.primerValor = primerValor;
		this.segundoValor = segundoValor;
	}
	
	
	
	public double getPrimerValor() {
		return primerValor;
	}
	
	public void setPrimerValor(double primerValor) {
		this.primerValor = primerValor;
	}
	
	public double getSegundoValor() {
		return segundoValor;
	}
	
	public void setSegundoValor(double segundoValor) {
		this.segundoValor = segundoValor;
	}
	
	
	
	// Métodos
	
	public double suma() {
		return this.primerValor + this.segundoValor;
	}
	
	
	public double resta() {
		return this.primerValor - this.segundoValor;
	}
	
	
	public double multiplicacion() {
		return this.primerValor * this.segundoValor;
	}
	
	
	public double division() {
		
		if (this.segundoValor > 0)
			return this.primerValor / this.segundoValor;		
		else 
			return 0.0;
		
	}
	
	

}
