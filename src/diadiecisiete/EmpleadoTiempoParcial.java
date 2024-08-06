package diadiecisiete;


/**
 *  Subclase, clase derivada
 */
public class EmpleadoTiempoParcial extends Empleado {

	
	private int horasTrabajadas;
	private double tarifaPorHora;
	
	
	

	public EmpleadoTiempoParcial(int id, String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
		super(id, nombre, salarioBase);
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaPorHora = tarifaPorHora;
	}


	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


	public double getTarifaPorHora() {
		return tarifaPorHora;
	}


	public void setTarifaPorHora(double tarifaPorHora) {
		this.tarifaPorHora = tarifaPorHora;
	}
	
	
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + (this.horasTrabajadas * this.tarifaPorHora) ;
	}
	
	
	
	
	
}
