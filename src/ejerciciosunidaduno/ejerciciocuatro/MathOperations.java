package ejerciciosunidaduno.ejerciciocuatro;


public class MathOperations {
	
		
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	
	
	public int multiplicar(int a, int b, int c) {
		return a * b * c;
	}
	
	
	
	public int multiplicar(int... numeros) {
		
		int resultado = 1;
		
		for(int i=0; i<numeros.length; i++) {
			
			resultado *= numeros[i];
		}
				
		return resultado;
		
	}
	
	
		
	

}
