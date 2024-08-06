package diacinco.sobrecargametodos;

public class Main {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.sumar(34005, 4565, 857460));
		
		System.out.println(calculadora.sumar(4565, 857460));
		
		System.out.println(calculadora.sumar(45.65, 85.746));
		
		System.out.println(calculadora.sumar(45.65f, 85.746f));
		
	}

}
