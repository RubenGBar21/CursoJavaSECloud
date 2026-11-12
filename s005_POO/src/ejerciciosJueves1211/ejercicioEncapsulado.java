package ejerciciosJueves1211;

public class ejercicioEncapsulado {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria(1000);
		
		System.out.println("Saldo inicial: " + cuenta1.getSaldo() + "€");
		
		cuenta1.ingresar(500);		
		cuenta1.retirar(200);
		
		System.out.println("Saldo: " + cuenta1.getSaldo() + "€");
		
	}
	
}

class CuentaBancaria {
	
	private double saldo;
	
	public CuentaBancaria() {
		
	}
	
	public CuentaBancaria(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad > 0 && cantidad <= saldo) {
			saldo -= cantidad;
		}
	}
	
}
