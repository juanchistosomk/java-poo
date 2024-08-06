package diaquince.zoologico;

/**
 *  Superclase
 */
public class Animal {
	
	
		private String nombre;
		private int edad;
		private static int contadorDeAnimales=0;
		
		
		// Constructores
		
		public Animal(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
			contadorDeAnimales++;
		}
		
		
		public Animal() {
			this("desconocido", 0);			
		}
		
		
		
		// Getters y Setters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getEdad() {
			return edad;
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}

		
		
		// Métodos de comportamiento
		
		
		public void mostrarDetalles() {
			System.out.println("============== Animal ==============");
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Edad: " + this.edad);
		}
		
		
		public void hacerSonido() {
			System.out.println("Los animales hacen sonidos! 😸🐶🐸🐮🐷🐔 ");
		}
		
		
		// Método Varargs
		
		public void registrarMantenimientos(String... mantenimientos) {
			System.out.println("Mantenimientos: ");
			for(String mantenimiento: mantenimientos) {
				System.out.println("- " + mantenimiento);
			}
		}
		
		
		
		// Método Estático

		public static int contadorAnimales() {
			return contadorDeAnimales;
		}
		
	
	

}
