package estructuradatos;
import java.util.ArrayList;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] listaUsuarios = new String[5];  // Los arrays tienen un tamaño fijo después de su creación, por lo que no es posible agregar elementos directamente. 
		listaUsuarios[0] = "Pedro";
		listaUsuarios[1] = "Ana";
		listaUsuarios[2] = "Pablo";
		listaUsuarios[3] = "Lucia";
		listaUsuarios[4] = "Rodolfo";
		
		
		System.out.println(listaUsuarios[0]);
		
		for (int i = 0; i < listaUsuarios.length; i++) {
		    System.out.println(listaUsuarios[i]);
		}
		
		
		ArrayList<Integer> listaDinamica = new ArrayList<>();
		
		listaDinamica.add(10);
		listaDinamica.add(20);		
		listaDinamica.add(30);
		
				
		int primer =listaDinamica.get(0);		
		listaDinamica.remove(2);
		
		System.out.println();
		
		// Recorrido utilizando un bucle foreach
		for(Integer listaD: listaDinamica) {
			System.out.println(listaD);
		}
		
		
		
		
				
				
				
				
				
				
		

	}

}
