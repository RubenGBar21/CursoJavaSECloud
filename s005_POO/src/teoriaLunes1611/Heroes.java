package teoriaLunes1611;

public class Heroes {

	public static void main(String[] args) {
		
		SuperMan sm = new SuperMan("Clark Kent");
		sm.msg();
		sm.volar();
		sm.nadar();
		sm.leerMentes();
		
		System.out.println();
		
		Aquaman aq = new Aquaman("Arthur Curry");
		aq.msg();
		aq.nadar();
		aq.leerMentes();
	}
	
}

interface Volar {
	
	public void volar();
}

interface Nadar {
	
	public void nadar();
}

interface LeerMentes {
	
	public void leerMentes();
}


class Heroe {
	
	protected String nombre;
	
	public Heroe() {
		
	}
	
	public Heroe(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	public void msg() {
		System.out.println(nombre + "tiene superpoderes");
	}
	
}

class SuperMan extends Heroe implements Volar, Nadar, LeerMentes {

	public SuperMan(String nombre) {
		super(nombre);
	}
	
	@Override
	public void volar() {
		System.out.println(nombre + " puede volar");
		
	}

	@Override
	public void leerMentes() {
		System.out.println(nombre + " puede leer mentes");
		
	}

	@Override
	public void nadar() {
		System.out.println(nombre + " puede nadar");
		
	}
	
}

class Aquaman extends Heroe implements Nadar, LeerMentes {

	public Aquaman(String nombre) {
		super(nombre);
	}
	
	@Override
	public void nadar() {
		System.out.println(nombre + " puede nadar");
		
	}

	@Override
	public void leerMentes() {
		System.out.println(nombre + " puede leer mentes");
		
	}
	
}
