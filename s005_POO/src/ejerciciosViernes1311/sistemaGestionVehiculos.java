package ejerciciosViernes1311;

public class sistemaGestionVehiculos {
	
	public static void main(String[] args) {
		
		Vehiculo[] vehiculos = new Vehiculo[3];
		Coche c = new Coche("Toyota", "Corolla", 50);
		Moto m = new Moto("Honda", "CBR", 30);
		Furgoneta f = new Furgoneta("Ford", "Transit", 80);
		
		vehiculos[0] = c;
		vehiculos[1] = m;
		vehiculos[2] = f;
		
		System.out.println("========== ALQUILER DE VEHÍCULOS ==========");
		for (int i = 0; i < vehiculos.length; i++) {
			
			System.out.println("Vehículo: " + vehiculos[i].getClass().getSimpleName());
			System.out.println("Precio Alquiler: " + vehiculos[i].calcularAlquiler(5) + "\n");
			
		}
		System.out.println("===========================================");
		
	}

}

class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected double precioDia;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca, String modelo, double precioDia) {
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}
		
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		
		if (precioDia > 0) {
			this.precioDia = precioDia;
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
	
	public double getPrecioDia() {
		return precioDia;
	}
	
	public void setPrecioDia(double precioDia) {
		if (precioDia > 0) {
			this.precioDia = precioDia;
		}
	}
	
	public double calcularAlquiler(int dias) {
		return dias * precioDia;
	}
	
}

class Coche extends Vehiculo {
	
	public Coche() {
		
	}
	
	public Coche(String marca, String modelo, double precioDia) {
		super(marca, modelo, precioDia);
		
	}

	@Override
	public double calcularAlquiler(int dias) {
		
		return (dias * 15) * precioDia;
		
	}
	
}

class Moto extends Vehiculo {
	
	public Moto() {
		
	}
	
	public Moto(String marca, String modelo, double precioDia) {
		super(marca, modelo, precioDia);
		
	}

	@Override
	public double calcularAlquiler(int dias) {
		
		return dias * ((precioDia * (100 - 10))/100);
		
	}
	
}

class Furgoneta extends Vehiculo {
	
	public Furgoneta() {
		
	}
	
	public Furgoneta(String marca, String modelo, double precioDia) {
		super(marca, modelo, precioDia);
		
	}

	@Override
	public double calcularAlquiler(int dias) {
		
		return (dias * precioDia) + 25;
		
	}
	
}
