package diadiecinueve;

/**
 *  Multiples interfaces
 */


public class TelefonoInteligenteImpl implements Portatil, DispositivoInteligente  {
	
	
	private String marca;
	private String modelo;


	public TelefonoInteligenteImpl(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
		
	
	
	// Implementar metodos abstractos //
	
	// Interface 1
	@Override
	public void encender() {
		System.out.println(this.marca + " " + this.modelo + " esta encendido!");
	}
	
	
	@Override
	public void apagar() {
		System.out.println(this.marca + " " + this.modelo +  " esta apagado!");
	}
	
		
	// Interface 1
	
	@Override
	public void conectarInternet() {
		System.out.println(this.marca + " " + this.modelo +  " conectado a Internet!");
	}
	
	@Override
	public void desconectarInternet() {
		System.out.println(this.marca + " " + this.modelo + " no conectado a Internet!");
	}
	

}
