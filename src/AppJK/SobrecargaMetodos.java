package AppJK;

public class SobrecargaMetodos {
	
	// Posibilidad de tener 2 o mas metodos con el mismo NOMBRE pero con parametros DIFERENTES 
	// para mayor funcionalidad.
	// 
	
	//private int numero1;
	//private int	numero2;
	
	public int suma(int... valores) {  // Múltiples parámetros - Array
		int suma = 0;
		for(int valor : valores) {
			suma+=valor;
		}
		return suma;
	}
	
	public float suma(float valor1, float valor2) {
		return valor1+valor2;
	}
	
	public double suma(double valor1, double valor2) {
		return valor1+valor2;
	}
	

}
