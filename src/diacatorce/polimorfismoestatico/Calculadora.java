package diacatorce.polimorfismoestatico;

/**
 *  Polimorfismo estatico en tiempo de compilación
 *  con sobrecarga de metodos
 */
public class Calculadora {
	
	// el diferenciador unicamente es por el numero	 de argumentos 
	
	public int sumar(int a , int b) {
		return a + b;
	}
	
	
	public int sumar(int a , int b, int c) {
		return a + b + c;
	}
	
	public double sumar(double a, double b) {
		return a + b;
	}
	
	

}
