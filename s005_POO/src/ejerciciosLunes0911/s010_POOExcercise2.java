package ejerciciosLunes0911;

public class s010_POOExcercise2 {
	
	public static void main(String[] args) {
		
		Coche c1 = new Coche("Opel", "Corsa", 100);
		
		c1.mostrarDatos();
		c1.acelerar();
		c1.mostrarDatos();
		c1.desacelerar();
		c1.desacelerar();
		c1.mostrarDatos();
		
		
	}

}

class Coche {

	private String marca;
	private String modelo;
	private double velocidad;
	
	public Coche() {
		
	}
	
	public Coche(String marca, String modelo, double velocidad) {
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		if (velocidad != 0) {
			this.velocidad = velocidad;
		}
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		if (velocidad != 0) {
			this.velocidad = velocidad;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Velocidad: " + velocidad + " km/h\n");
	}
	
	public void acelerar() {
		this.velocidad += 10;
	}
	
	public void desacelerar() {
		this.velocidad -= 10;
	}
	
	
}
