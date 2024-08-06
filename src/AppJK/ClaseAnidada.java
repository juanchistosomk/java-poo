package AppJK;

public class ClaseAnidada {
	
	// Comparten métodos y atributos.
	
	public String username;
	
	public ClaseAnidada(String username) {
		this.username=username;
	}	
	public void estableRol() {
		Administrador admin = new Administrador();
		admin.trabajar();
	}
	
	
	// Nueva Clase
	
	public class Administrador{		
		public void trabajar() {
			System.out.println("El Admin: " + username + " se encuentra trabajando ");
		}		
	}
	

}
