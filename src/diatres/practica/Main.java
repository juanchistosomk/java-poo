package diatres.practica;

public class Main {

	public static void main(String[] args) {

		
		cuentaBancaria cuenta = new cuentaBancaria("Juan Perez");
		
		System.out.println("Titular: " + cuenta.getTitular());
		
		
		cuenta.depositar(25000.0);
		cuenta.retiro(1100.0);
		System.out.println(cuenta.getBalance());
		
		cuenta.retiro(2000.0);
		System.out.println(cuenta.getBalance());
		
		cuenta.retiro(3200.0);
		System.out.println(cuenta.getBalance());
		
		cuenta.retiro(10500.0);
		System.out.println(cuenta.getBalance());
		
	}

}
