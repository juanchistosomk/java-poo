package diasiete.practica;

public class Calculadora {
	
	
	public int operaciones(String operador, int... numeros) {
		
		int resultado = 0;
		
		if(operador.equalsIgnoreCase("suma")) {
			for(int num : numeros) {
				resultado+=num;
			}
		}
		
		else if(operador.equalsIgnoreCase("resta")) {
			for(int num : numeros) {
				resultado=num-resultado;
			}
		}
		
		else if(operador.equalsIgnoreCase("multiplica")) {
			resultado = 1;
			for(int i=0; i<numeros.length; i++) {
				resultado *= numeros[i];
			}
		}
			
						
		return resultado;
		
	}
	

}
