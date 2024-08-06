package diaseis;

public class Contador {
	
	// Atributo pertenece a la Instancia
	public int contadorUno;
	
	// Atributos Estaticos pertenecen a la CLASE
	
	public static int contador=0;  // Compartidos por TODOS los objetos
	
	
	public Contador() {
		contador++;
	}
	
	public void mostrarContador() {
		System.out.println("Instancias totales: " + contador);
	}
	
	

	

}
