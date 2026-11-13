package teoriaViernes1311;

public class TeoriaViernes {

	public static void main(String[] args) {
		
		//mostrarDatosVehiculo();
		mostrarDatosAnimal();
		
	}
	
	public static void mostrarDatosVehiculo() {
		Moto m = new Moto("Honda", "CBR");
		Vehiculo v = new Vehiculo("Toyota", "Corolla");
		
		v.arrancar();
		m.arrancar();
		m.hacerCaballito();
	}
	
	public static void mostrarDatosAnimal() {
		Perro p = new Perro("Firulais");
		Gato g = new Gato("Michi");
		Pajaro c = new Pajaro("Cuervo");
		
		p.comer();
		p.hacerSonido();
		
		System.out.println();
		
		g.comer();
		g.hacerSonido();
		
		System.out.println();
		
		c.comer();
		c.hacerSonido();
		c.volar();
		c.alimentarCrias();
		
	}
	
}

interface Volador {

	public void volar();
	
}

interface Alimentar {

	public void alimentarCrias();
	
}

class Vehiculo {
	
	protected String marca;
	protected String modelo;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca, String modelo) {
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}
		
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
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
	
	public void arrancar() {
		System.out.println("El vehículo " + marca + " " + modelo + " está arrancando");
	}
	
}

class Moto extends Vehiculo {
	
	public Moto(String marca, String modelo) {
		super(marca, modelo);
	}
	
	@Override
	public void arrancar() {
		System.out.println("La moto " + this.marca + " " + this.modelo + " está arrancando");
	}
	
	public void hacerCaballito() {
		System.out.println("La moto " + this.marca + " " + this.modelo + " está haciendo un caballito");
	}
	
}

abstract class Animal {
	
	protected String nombre;
	
	public Animal() {
		
	}
	
	public Animal(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
			
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
			
		}
	}

	public void comer() {
		System.out.println(nombre + " está comiendo");
	}
	
	abstract public void hacerSonido();
	
	
}

class Perro extends Animal {
	
	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Guau Guau");
		
	}
	
}

class Gato extends Animal {
	
	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("Meow Meow");
		
	}
	
}

class Pajaro extends Animal implements Volador, Alimentar {

	public Pajaro(String nombre) {
		super(nombre);
	}
	
	@Override
	public void volar() {
		System.out.println(nombre + " está volando");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("Caw Caw");
		
	}

	@Override
	public void alimentarCrias() {
		System.out.println(nombre + " está alimentando a sus crías");
		
	}
	
}