package estructuradatos.hashmap;

import java.util.HashMap;
import java.util.Map;


public class HashMapPruebas {

	public static void main(String[] args) {


		Map<String, Integer> elemHash = new HashMap<>();
		
		
		// Agregar elementos
		
		elemHash.put("ID", 90032);
		elemHash.put("cod_cliente", 1032);
		elemHash.put("cod_compra", 3032);
		elemHash.put("cod_empresa", 60032);
		
		
		int valor = elemHash.get("cod_cliente");
		System.out.println(valor);
		
		
		// Recorrer
		for( String clave: elemHash.keySet() ) {
			System.out.println("Clave: " + clave + "  valor: " + elemHash.get(clave));
		}
		
		// elimina  y modifica
		
		elemHash.remove("cod_empresa");
		elemHash.put("ID", 11110);
		
		
		
		// HashMap con distintos tipos de datos
		
		Map<String, Object> hasMmap = new HashMap<>();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
