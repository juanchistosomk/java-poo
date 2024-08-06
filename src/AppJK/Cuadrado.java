package AppJK;

public class Cuadrado extends Figura {
	
	private float base;
	private float altura;
	
	public Cuadrado(float base, float altura) {
		this.base=base;
		this.altura=altura;
	}
	
	
	// Heredar de clase ABSTRACTA, se deben implementar todos sus metodos abstractos
	
	// *Se sobre-escribe el Metodo de la clase Abstracta
	
	@Override
	public float area() {
		
		return base * altura;
		
	}

	
}
