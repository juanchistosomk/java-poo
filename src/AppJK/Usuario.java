package AppJK;

public class Usuario {
	
	private String nombre;
	private String email;
	private String password;
	
	
	//Constructor: 	se ejecuta cuando el objeto es creado y antes de ejecutar 'new'
	public Usuario(String nombre, String email, String password) {
		this.nombre=nombre;
		this.email=email;
		this.password=password;		
	}
	
	// Sobrecarga de Constructores
	public Usuario() {
		this.nombre="";
		this.email="";
		this.password="";		
	}
	public Usuario(String nombre) {
		this.nombre=nombre;
		this.email="";
		this.password="";		
	}
	
	
	//Métodos
	
	public void mostrarUsuario() {
		System.out.println("El usuario es: "+this.nombre+", email: "+this.email+", password: "+this.password);		
	}


	//Getters
	
		public String getNombre() {
			return this.nombre;
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public String getPassword() {
			return this.password;
		}
			
	//Setters
		
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		public void setEmail(String email) {
			this.email=email;
		}
		public void setPassword(String password) {
			this.password=password;
		}
	
		
	
	

}
