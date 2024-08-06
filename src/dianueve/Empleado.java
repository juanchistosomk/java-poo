package dianueve;

public class Empleado extends Persona {

	private String puesto;
	private String horario;
	
	
	
	public Empleado(String nombre, int edad, String puesto, String horario) {
		super(nombre, edad);
		this.puesto = puesto;
		this.horario = horario;
	}
	
	
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	
	@Override
	public void mostrarDetalle() {
		System.out.println("=========== Empleado ========");
		super.mostrarDetalle();				
		System.out.println("Puesto: " + this.puesto);
		System.out.println("Horario: " + this.horario);
	}
	
	
}
