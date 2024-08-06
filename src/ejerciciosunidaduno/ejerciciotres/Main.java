package ejerciciosunidaduno.ejerciciotres;


public class Main {

	public static void main(String[] args) {

		
		Persona persona = new Persona("Ana Pérez", 32);
		
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());
		
		System.out.println();
		
		
		Persona personaDos = new Persona("Pedro Gonzales");
		
		System.out.println("Nombre: " + personaDos.getNombre());
		System.out.println("Edad: " + personaDos.getEdad());
		
		System.out.println();
		
		/**********************/
		
		Persona personaTres = new Persona("Manuel Gómez", 46);
		personaTres.presentarse();
		
		
		Persona personaCuatro = new Persona("Mari Perdomo", 29);
		personaCuatro.presentarse();
		
		
		Persona personaCinco = new Persona("Andrés Cota", 33);
		personaCinco.presentarse();
		

		
	}

}
