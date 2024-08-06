package AppJK;


public class StaticClass {
	
	// La palabra Static permite implementar atributos o metodos 
	// sin la necesidad de instanciar la clase(objeto)
	
	// Final para que una constante no pueda cambiarse
	
	public static final float pi = 3.1415f;  // pi pertenece a la CLASE (Atributo de clase)
	public float radio = 0f;  // radio pertenece a la INSTANCIA (Atributo de instancia)
	
	// **No se usa THIS en el contexto de Static
	
	public StaticClass(float radio) {  // Constructor
		this.radio=radio;
	}
	
										  // en etodo Static NO podemos hacer uso de atributos o metodos que le pertenecen a la instancia
	public static float areaCirculo(float radio) {   // Metodo de Clase por ser Static
		
		// Buena practica
		return StaticClass.pi * (float)(Math.pow(radio,2));
	}
			

}
