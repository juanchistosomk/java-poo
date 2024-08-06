package diasiete.strings;

public class Concatenar {
	
	
	
	public String concatenar(String... cadenas) {
		
		// Manipular cadenas
		StringBuilder resultado = new StringBuilder();
		
		for(String cad : cadenas) {
			resultado.append(cad);
		}
		
		
		return resultado.toString();		
		
	}

}
