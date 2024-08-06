/**
 * 
 */
package AppJK;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * STRINGS 
		 **/		 
		
		System.out.println("Holaaaa!!!");		
		String mensaje = "Hola mundo";
		
		int cantidad = mensaje.length();
		boolean validaText = mensaje.contains("Hola");		
		String nuevoMensaje = mensaje.concat(" JK!");		
		
		System.out.println(mensaje);
		System.out.println(cantidad);
		System.out.println(validaText);
		System.out.println(nuevoMensaje);
				
		String nombre = "Maria ";		
		System.out.println(nombre.toLowerCase().trim());
		System.out.println(nombre.toUpperCase().trim());
		
		float valor = 10.23001f;    // %d decimales enteros %b float 
		String mensaje2;
		mensaje2=String.format("El total es: %.4f en moneda %s", valor, "pesos");
		System.out.println(mensaje2);
		System.out.printf("El total es: %.4f en moneda %s", valor, "pesos");
		
		
		int cantidad2 = 10;
		boolean mayor = cantidad2 > 5;
		System.out.printf("La cantidad es mayor a %d : %b", cantidad2, mayor);
		
		// %posición$tipo  -> ("%3$s - %2$s - %1$s")
		
		
		String cadena1 = "Rata";
		String cadena2 = "rata";
		
		boolean resp = cadena1.equals(cadena2);  // Analiza la cadea si es EXACTAMENTE igual
		System.out.println();
		System.out.println(resp);
		
		resp = cadena1.equalsIgnoreCase(cadena2); // Analiza pero ignora mayúsculas y minúsculas
		System.out.println(resp);
		
		System.out.println("Hola, esto es " + "una cadena " + " concatenada");
		
		// Obtener un caracter respecto a su indice
		String mensaje3 = "Hola Mundo";
		char lentraH = mensaje3.charAt(0);
		System.out.println(lentraH);
		
		// Saber el indice de una letra.  lastIndexOf-> que será de derecha a izquierda.
		// retorna -1 si no encuentra
		String mensaje4 = "Holas Mundos M!!!";
		int indice2 = mensaje4.indexOf("M");
		System.out.println("indexOf: " + indice2);
		System.out.println("lastIndexOf: " + mensaje4.lastIndexOf("M"));
		
		mensaje4.substring(indice2); // desde el indice hasta el final
		mensaje4.substring(indice2, indice2 + 2);
		
		String mensaje5 = "Este mensaje posee muchas letras a";
		int indicePrimeraA = mensaje5.indexOf("a");
		int indiceSegundaA = mensaje5.indexOf("a", indicePrimeraA + 1 );
		System.out.println(indiceSegundaA);
		
		// Condicionales, anidadas
		
		int var2 = 70;
		
		if(var2 == 60) {
			System.out.println("El numero es 60");
		} 
		else if(var2 < 60){
			System.out.println("El numero es  menor a 60");
		}		
		else {
			System.out.println("El numero es mayor a 60");
		}
		
		// Scope o alcance de variables
		
		// Switch
		
		String color = "Blanco";
		
		switch(color) 
		{		
			case "Azul": System.out.println("Estado iniciado!");
			break;  // break es OPCIONAL
		
			case "Verde": System.out.println("Estado ok!");
			break;
		
			case "Rojo": System.out.println("Estado detenido!");
			break;
			
			default: System.out.println("Color no valido!");
		}
		
		
		// WHILE: Se usa cuando NO conocemos el numero de iteraciones
		int cont = 0;        
		while(cont < 10) {
			System.out.printf("El contador While es: %d", cont);
			cont++;
		}
		
		System.out.println();
		
		
		
		// DO WHILE
		
		do{
			System.out.printf("El contador DoWhile es: %d", cont);
			cont++;
		}
		while(cont < 15);
		
		System.out.println();
		
		// FOR -> Sabemos el numero de iteraciones
		
		for(int i=0; i<10; i++) {
			System.out.printf("El contador For es: %d", i);
		}
		System.out.println();
		
		
		// Break Continue
		
		for(int i=0; i<10; i++) {
			if(i == 4) 
				break;
			
			System.out.printf("El contador Break es: %d", i);
		}
		
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i == 5) 
				continue;
			
			System.out.printf("El contador Continue es: %d", i);
		}
		
		
		// Arrays: longitud inmutable, solo un tipo
		
		//String empleados[];
		//empleados = new String[3];
		String[] empleados = new String[3];
		
		System.out.println(empleados[0]);
		empleados[0] = "David";
		System.out.println(empleados[0]);
		
		String nombres[] =  {"A","B","C","D","E"};
		System.out.println(nombres[0]);
		
		for(int i=0; i<nombres.length; i++) 
			System.out.println(nombres[i]);
		
		
		// FOREACH: recorrer Arreglos
		
		for(String name : nombres) {
			System.out.println(name);
		}
		
		
		// Matriz
		
		int matriz[][] = new int[4][3];
		matriz[0][0]=324;
		
		// dinamicos
		
		int matriz2[][]= new int[2][];
		matriz2[0] = new int[2];
		matriz2[1] = new int[1];
		
		matriz2[0][0] = 3;
		matriz2[0][1] = 8;
		matriz2[1][0] = 11;
				
		
		for (int []matr : matriz2) {
			for(int mat : matr) {
				System.out.println(mat);
			}
		}
		
		
		//Numero aleatorio
		
		int numeroAleatorio = (int)(Math.random() * 100);
		System.out.println("Nm. aleatorio: " + numeroAleatorio);
		
		
		
		/// POO
		
		Triangulo triangulo = new Triangulo();
		triangulo.base= 13.6f;
		triangulo.altura = 58;
		float areaTriangulo = triangulo.area();	
		System.out.println("El area del triangulo es: " + areaTriangulo);
		
		
		//
		
		Usuario usuario1 = new Usuario("Maria Lopez", "ma@lokc.com", "123456");
		//usuario.setNombre("Maria Lopez");
		//usuario.setEmail("ma@lokc.com");
		//usuario.setPassword("123456");
		System.out.println("Usuario: "+ usuario1.getNombre() + " y su Email: " + usuario1.getEmail());
		
		Usuario usuario2 = new Usuario("Yesid");  //Sobrecarga de constructores
		usuario2.mostrarUsuario();
		System.out.println();
		
		
		SobrecargaMetodos suma = new SobrecargaMetodos();
		int resultadoUno = suma.suma(123, 456, 7, 19, 74, 92, 22, 5);
		System.out.println("Suma int: "+ resultadoUno);
		float resultadoDos = suma.suma(456.78f, 755.3424f);
		System.out.println("Suma float: "+ resultadoDos);
		System.out.println();
		
		
		// Static
		StaticClass cir = new StaticClass(1f);
		System.out.println(cir.pi );   // Los objetos instanciados TAMBIEN puede usar los atributos o metodos Staticos
		System.out.println("PI: " + StaticClass.pi);		
		System.out.println("Area Circulo: " + StaticClass.areaCirculo(34.24f));
		
		
		
		// Clases anidadas
		ClaseAnidada usuAdm = new ClaseAnidada("Fer");
		usuAdm.estableRol();
		
		
		// Herencia
		Gato gato =  new Gato("Tommy","x", 1);
		gato.dormir();
		Perro perro = new Perro("Max","y",2);
		perro.dormir();
		
		
		// Principio de sustitucion: tratar una clase Hija como si fuera Padre
		Figura figuras[] = new Figura[1];
		Figura cuadrado = new Cuadrado(30.5f, 30.5f);
		figuras[0] = cuadrado;
		System.out.println( figuras[0].area() );
		
		
		
	}

}
