package diacuatro;

public class Empleado {
	
	private String nombre;
	private int id;
	private String puesto;
	private double salarioMensual;
	
	
	public Empleado(String nombre, int id, String puesto, double salarioMensual) {
		this.nombre = nombre;
		this.id = id;
		this.puesto = puesto;
		this.salarioMensual = salarioMensual;
	}

	// Constructor por defecto
	public Empleado() {
		this("Desconocido",0,"Desconocido",0.0);
	}
	
	
	public Empleado(String nombre) {
		this(nombre, 0, "Desconocido", 0.0);
	}
	
		
	public Empleado(String nombre, int id) {
		this(nombre, id, "Desconocido", 0.0);
	}
	
	
	public Empleado(String nombre, int id, String puesto) {
		this(nombre, id, puesto, 0.0);
	}

	
	
	
	// Getters y Setters
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	
	// Metodos comportamiento
	
	
	public double calcularSalarioAnual() {
		
		//double salarioAnualTotal=0.0;
		return this.salarioMensual*12; 
				
	}
	
	public void aplicarAumento(double porcentaje) {
		if(porcentaje >0)
			this.salarioMensual += (this.salarioMensual * porcentaje)/100;
	}
	
	public void imprimirDetalles() {
		
		System.out.println("***** 👩‍🦰👦🏻 Empleado 👦🏻👩‍🦰 *****");
		System.out.println("Nombre: " + nombre);
		System.out.println("ID: " + id );
		System.out.println("Puesto: " + puesto);
		System.out.println("Salario Mensual: " + salarioMensual);
		System.out.println("Salario Anual: " + this.calcularSalarioAnual());
		
		
	}
	
	
	
	
	

}
