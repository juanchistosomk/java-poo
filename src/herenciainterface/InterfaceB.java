package herenciainterface;


/*
 * Interface PADRE
 */

public interface InterfaceB {
	
	public abstract void detalle();  // Metodo abstracto
	
	
	public default void saludo() {  // Metodo por defecto, si tiene cuerpo
		System.out.print("Hola");
	}
	

}
