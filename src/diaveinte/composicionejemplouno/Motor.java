package diaveinte.composicionejemplouno;



public class Motor  {
	
	

	private int caballosDeFuerza;
	
	
	// Constructor
	public Motor(int caballosDeFuerza) {
		super();
		this.caballosDeFuerza = caballosDeFuerza;
	}
	
	
	
	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}
	
	
	public double bujias(int bujias) {
		return bujias ;
	}
	
	public static void prueba() {
		System.out.println("Prueba");
	}
	
	
	
	
	
}
