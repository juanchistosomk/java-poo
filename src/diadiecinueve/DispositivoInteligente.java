package diadiecinueve;



public interface DispositivoInteligente {
	
	
	void conectarInternet();
	void desconectarInternet();
	
	
	default void actualizarSoftware() {
		System.out.println("...");
	}

}
