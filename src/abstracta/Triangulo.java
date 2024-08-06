package abstracta;

/**
 * Utilización de clase Abstracta
 */

public class Triangulo extends Figura {

	
	private double base;
	private double altura;
	
	
	@Override
	public double area() {
		return (base*altura)/2 ;
	}
	
		

}
