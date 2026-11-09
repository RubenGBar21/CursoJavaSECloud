package ejerciciosLunes0911;

public class s010_POOExcercise3 {
	
	public static void main(String[] args) {
		
		CuentaBancaria cb1 = new CuentaBancaria("Rubén", 0.40);
		
		cb1.consultarSaldo();
		cb1.ingresar(10);
		cb1.consultarSaldo();
		cb1.retirar(5);
		cb1.ingresar(-10);
		cb1.retirar(6);
		cb1.consultarSaldo();
		
	}

}

class CuentaBancaria {
	
	String titular;
	double saldo;
	
	public CuentaBancaria() {
		
	}
	
	public CuentaBancaria(String titular, double saldo) {
		
		if(titular != null && !titular.equals("")) {
			this.titular = titular;
		}
		
		if (saldo > 0) {
			this.saldo = saldo;
		}
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(titular != null && !titular.equals("")) {
			this.titular = titular;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo + "\n");
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad > 0 && cantidad < saldo) {
			this.saldo -= cantidad;
		}
	}
	
}
