package ejerciciosMiercoles013;

public class Matematicas {
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(10, 5);
		
		r1.mostrarDatos();
		
	}

}

class Rectangulo {
	
	private double lado;
	private double base;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(double lado, double base) {
		if (lado != 0) {
			this.lado = lado;
		}
		
		if (base != 0) {
			this.base = base;
		}
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado != 0) {
			this.lado = lado;
		}
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base != 0) {
			this.base = base;
		}
	}
	
	public double calcularArea() {
		return lado*base;
	}
	
	public double calcularPerimetro() {
		return (lado*2)+(base*2);
	}
	
	public void mostrarDatos() {
		System.out.println("Área del Rectangulo: " + calcularArea());
		System.out.println("Perímetro del Rectangulo: " + calcularPerimetro());
	}
	
}
