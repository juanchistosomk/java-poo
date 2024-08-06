package diadieciocho.operacionesmatematicas;

public class Main {

	public static void main(String[] args) {

		CalculadoraImpl cal = new CalculadoraImpl();
		
		System.out.println("Suma: " + cal.sumar(13, 4));
		System.out.println("Resta: " + cal.restar(10, 5));
		
		System.out.println("Mult: (default) " + cal.multiplicar(4, 8));
		System.out.println("Div: (static) " + OperacionesMatematicas.dividir(89, 4));
		
	}

}
