package diaseis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Contador obj1 = new Contador();
		Contador obj2 = new Contador();
		Contador obj3 = new Contador();
		
		obj1.mostrarContador();
		// Imprime 3 porque el atributo pertenece a la Clase
		// y no a la Instancia, de lo contrario imprimiria 1,1,1
		
		Contador.contador = 100;
		System.out.println(Contador.contador);

		
		
	}

}
