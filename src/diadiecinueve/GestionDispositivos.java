package diadiecinueve;

public class GestionDispositivos {

	public static void main(String[] args) {

		
		// no polimorfismo dinamico
		
		TelefonoInteligenteImpl telInt = new TelefonoInteligenteImpl("Iphone", "15pro");
		//Portatil telInt = new TelefonoInteligenteImpl("Iphone", "15pro");
		//DispositivoInteligente telInt = new TelefonoInteligenteImpl("Iphone", "15pro");

		
		telInt.encender();
		telInt.conectarInternet();
		telInt.actualizarSoftware();
		telInt.cargar();
		telInt.desconectarInternet();
		telInt.apagar();
		
		
	}

}
