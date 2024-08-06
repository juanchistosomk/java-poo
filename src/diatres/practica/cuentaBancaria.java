package diatres.practica;

public class cuentaBancaria {
	
	private String titular;
	private double balance;
	
	
	public cuentaBancaria() {
		this("Desconocido", 0.0);
	}
	
	public cuentaBancaria(String titular) {
		this(titular, 0.0);
	}
	
	public cuentaBancaria(String titular, double balance) {
		this.titular = titular;
		this.balance = balance;
	}

	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	public void depositar(double monto) {
		if (monto>0) {
			this.balance += monto;
		}
	}
		
	public boolean retiro(double monto) {
		if (monto>0 && monto <= this.balance) {
	
			this.balance -= monto;
			return true;
		}
		
		return false;		
			
	}
	

}
