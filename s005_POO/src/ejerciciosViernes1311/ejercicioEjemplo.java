package ejerciciosViernes1311;

public class ejercicioEjemplo {

	public static void main(String[] args) {
		Pez p = new Pez("Nemo");
		
		p.nadar();
		p.bucear();
		p.hacerSonido();
		
	}
	
}

interface Acuatico {
	
	public void nadar();
	public void bucear();
	
}

abstract class Animal { 
	
	String nombre;
	
	public Animal() {
		
	}
	
	public Animal(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	abstract public void hacerSonido();
	
}


class Pez extends Animal implements Acuatico {

	public Pez(String nombre) {
		super(nombre);
	}
	
	@Override
	public void nadar() {
		System.out.println(nombre + " está nadando");
		
	}

	@Override
	public void bucear() {
		System.out.println(nombre + " está buceando");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("Glub Glub");
		
	}
	
}