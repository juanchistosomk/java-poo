package diasiete;

public class Sumador {

	// VARARGS -> numuero variable de Argumentos
	// Deben ubicarse al final si esque existen ams parametros
	
	public int sumar(int... numeros) {
		int suma =0;
		for(int num: numeros) {
			suma += num;
		}
		return suma;
	}
	
	
	public int sumar(double numeros, double...valor) {
		return 0;
	}
	
}
