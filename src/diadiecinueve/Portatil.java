package diadiecinueve;



public interface Portatil {

	//Implementacion Multiple
	
	
	void encender();
	void apagar();
	
	
	default void cargar() {
		System.out.println("Cargando dispositivo...");
	}
	
	
}
