package diaocho;

public class Main {

	public static void main(String[] args) {
		
		Persona pers = new Persona("Ana", 34);
		pers.mostrarInformacion();
		
		
		Alumno alum = new Alumno("JK", 30, "RT23","Ingenieria");
		alum.mostrarInformacion();
		
		
		Alumno alum2 = new Alumno("Manuel", "Math");
		alum2.mostrarInformacion();
		
		
		Profesor profe = new Profesor("Pez",45, "Ciencias", 5500.0);
		profe.mostrarInformacion();
		
	}

}
