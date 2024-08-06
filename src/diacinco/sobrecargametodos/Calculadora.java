package diacinco.sobrecargametodos;

public class Calculadora {
	
	// Sobrecarga de Métodos
	
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public int sumar (int a, int b, int c) {
		return a + b + c;
	}
	
	
	public double sumar ( double a, double b) {
		return a + b;
	}
	
	public double sumar ( float b, double a) {
		return b + a;
	}
	

}
