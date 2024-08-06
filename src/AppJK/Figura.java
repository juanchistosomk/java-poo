package AppJK;

public abstract class Figura {
	
	// Estructura MUY GENERAL y son las clases HIJAS las que se encargan de definir los detalles
	
	// CLASE ABSTRACTA: Define que hacer pero NO el COMO hacerlo.
	
	private int numeroLados;
	
	public Figura() {
		this.numeroLados=0;
	}
	
	
	// **Debe haber por lo menos una Clase Abstracta
	// Pueden ser HEREDADAS por otras clases, pero NO INSTANCIADAS
	
	public abstract float area(); // Abstracto, No Retorna nada
	

}
