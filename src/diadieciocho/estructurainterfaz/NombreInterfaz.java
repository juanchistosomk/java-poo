package diadieciocho.estructurainterfaz;

public interface NombreInterfaz {
	
	
	// Atributo: estatico, Public y constante
	// No es comun definir estos atributos en las interfaces
	// por SOLID
	public int CONSTANTE = 10;
	
	// Metodos abstractos, se puede agregar sin abstract
	
	public void metodoAbstracto();
	
	// Metodos sin implementacion
	
	public static void metodoEstatico() {
		
	};
	
	
	// Metodo por default: NO le pertenece a la interface
	
	public default void metodoDefault() {
		
	}
	
	
	

}
