package diadiecisiete;

/**
 * Superclase
 */

abstract public class Empleado {
	
	private int id;
	private String nombre;
	private double salarioBase;

	
	public Empleado(int id, String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	public double getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	
	
	// Metodo abstracto
	
	abstract public double calcularSalario();
	
	
	// Metodo de comportamiento
	public void mostrarDetalles() {
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Salario: " + this.calcularSalario());
			
	
	}
	
	
	

}
