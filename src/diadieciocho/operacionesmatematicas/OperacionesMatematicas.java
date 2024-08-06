package diadieciocho.operacionesmatematicas;

public interface OperacionesMatematicas {
	
	
	int sumar(int a, int b);
	int restar(int a, int b);
	
	default int multiplicar(int a, int b) {
		return a * b;
	}
	
	static double dividir(int a, int b) {
		
		if(b == 0)
			throw new ArithmeticException("No se puede dividir por cero.");
		
		return a / b;
		
	}
	

}
