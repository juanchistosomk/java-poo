package diauno;

public class Automovil {
	
	// Pojo
	
	// Atributos(camelCase)
	
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
	
	
	// Constructor
	
	public Automovil(
					String marca,
					String modelo,
					int anio,
					double precio)
	{
		this.marca=marca;   // Asignar valores this (referencia al atributo)
		this.modelo=modelo;
		this.anio=anio;
		this.precio=precio;
	}

	
	// Setters y Getters (para que desde otras clases pueda obtener o asignar valor a los atributos)

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


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
		
	// Metodos: Comportamientos
	
	public void mostrarDetalles() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + anio);
		System.out.println("Precio: " + precio);
	}
	
	
	

}
