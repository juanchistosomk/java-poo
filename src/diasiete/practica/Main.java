package diasiete.practica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calculadora = new Calculadora();
		
		
		int suma = calculadora.operaciones("suma", 23, 8, 10);
		int resta = calculadora.operaciones("resta", 23, 9, 1);
		int mult = calculadora.operaciones("multiplica", 2, 8, 1);
		
		System.out.println(suma + " " + resta + " " + mult);
		

	}

}
