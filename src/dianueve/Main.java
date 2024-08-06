package dianueve;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona per = new Persona(
				"Ana",
				27);
		
		
		Alumno alum = new Alumno(
				"Jk", 
				35, 
				"Once", 
				4.3);
		
		
		Profesor prof = new Profesor(
				"Camilo", 
				34, 
				10, 
				"Español",
				"Matematicas" )  ;		
		
		
		Empleado emp = new Empleado(
				"Maria", 
				29, 
				"Secretaria", 
				"Diurno");
		
		
		per.mostrarDetalle();
		alum.mostrarDetalle();
		prof.mostrarDetalle();
		emp.mostrarDetalle();

		
	}

}
