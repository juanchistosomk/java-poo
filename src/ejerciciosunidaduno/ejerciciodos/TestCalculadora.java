package ejerciciosunidaduno.ejerciciodos;


public class TestCalculadora {

	public static void main(String[] args) {

		
		Calculadora calculadora = new Calculadora(34.0, 21.0);
		
		
		double suma = calculadora.suma();
		System.out.println("La suma de " 
				+ calculadora.getPrimerValor() 
				+ " + " + calculadora.getSegundoValor() 
				+ " = " + suma);
		
		
		double resta = calculadora.resta();
		System.out.println("La resta de " 
				+ calculadora.getPrimerValor() 
				+ " - " 
				+ calculadora.getSegundoValor() 
				+ " = " + resta);

		
		double mult = calculadora.multiplicacion();
		System.out.println("La multiplicación de " 
				+ calculadora.getPrimerValor() 
				+ " * " 
				+ calculadora.getSegundoValor() 
				+ " = " + mult);

		
		double div = calculadora.division();
		System.out.println("La division de " 
				+ calculadora.getPrimerValor() 
				+ " / " 
				+ calculadora.getSegundoValor() 
				+ " = " + div);

		
		
	}

}
