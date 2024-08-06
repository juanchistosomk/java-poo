package ejerciciosunidaduno.ejerciciocuatro;

public class TestMathOperations {

	public static void main(String[] args) {


		MathOperations mathOper = new MathOperations();
		
				
		System.out.println(mathOper.multiplicar(20, 10));		
		System.out.println(mathOper.multiplicar(10, 10, 3));
		
		
		/********** Aplicando Varargs ***************/
		
		
		System.out.println(mathOper.multiplicar(2, 5, 8, 3, 10, 7, 1));					
		System.out.println(mathOper.multiplicar(5, 8, 3, 10));
	
		
	}

}
