package ejerciciosLunes0911;

public class Calculadora {
	
	private double num1;
	private double num2;

	public Calculadora() {
		
	}
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double sumar() {
		return num1 + num2;
	}
	
	public double restar() {
		return num1 - num2;
	}
	
	public double multiplicar() {
		return num1 * num2;
	}
	
	public double dividir() {
		
		double res = 0;
		
		try {
			res = num1/ num2;
			
		} catch (ArithmeticException e) {
			System.err.println("No se puede dividir entre 0");
		}
		
		return res;
		
	}
	

}
