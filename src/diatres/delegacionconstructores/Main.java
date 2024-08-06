package diatres.delegacionconstructores;

public class Main {

	public static void main(String[] args) {

		Persona personaUno = new Persona("Carlos");
		System.out.println(personaUno.getNombre() + " " + personaUno.getEdad());
	}

}
