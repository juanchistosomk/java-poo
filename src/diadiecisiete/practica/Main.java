package diadiecisiete.practica;


public class Main {

	public static void main(String[] args) {

		
		
		Figura triangulo = new Triangulo("Triangulo equilatero", 30.5, 30.5);
		Figura circulo = new Circulo("Circunferencia", 65);
		Figura rectangulo = new Rectangulo("Rectangulo", 85, 34.5);
		
		
		
		triangulo.mostrarAreas();
		circulo.mostrarAreas();
		rectangulo.mostrarAreas();
		
		
		
	}

}
