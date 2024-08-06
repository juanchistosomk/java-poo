package diadiecisiete.practica;


/**
 *  Superclase
 */
abstract public class Figura {
	
	
	private String tipoFigura;
	
	
		
	
	public Figura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	
	
	
	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}



	// Método abstracto
	abstract public double calcularArea();
	

	
	public void mostrarAreas() {
		System.out.println("Tipo figura: " + this.tipoFigura);
		System.out.println("El área es: : " + this.calcularArea() + " cm^2 \n");
		
	}
	

}
