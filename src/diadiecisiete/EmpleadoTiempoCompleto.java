package diadiecisiete;


/**
 *  Subclase
 */
public class EmpleadoTiempoCompleto extends Empleado {
	
	
	private double bono;

	public EmpleadoTiempoCompleto(int id, String nombre, double salarioBase, double bono) {
		super(id, nombre, salarioBase);
		this.bono = bono;
	}

	
	
	
	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}
	
	
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() * this.bono;
	}
	
	
	
	
	
	

}
