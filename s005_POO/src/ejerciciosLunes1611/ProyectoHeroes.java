package ejerciciosLunes1611;

public class ProyectoHeroes {

	public static void main(String[] args) {

		PoderVolar heroe1 = new PoderVolar("Superman", 1000);
		PoderDisparar heroe2 = new PoderDisparar("Ironman", 500);
		PoderNadar heroe3 = new PoderNadar("Aquaman", 200);
		PoderInvisible heroe4 = new PoderInvisible("Fantasma", 60);
		PoderLeerMentes heroe5 = new PoderLeerMentes("Profesor X", 100);

		heroe1.msg();
		System.out.println("----------------");
		heroe2.msg();
		System.out.println("----------------");
		heroe3.msg();
		System.out.println("----------------");
		heroe4.msg();
		System.out.println("----------------");
		heroe5.msg();

	}

}

class Hero {

	protected String nombre;

	public Hero(String nombre) {
		this.nombre = nombre;
	}

	public void msg() {
		System.out.println(nombre + " tiene superpoderes");

	}

}

class PoderVolar extends Hero {

	private int velocidadVuelo;

	public PoderVolar(String nombre, int velocidadVuelo) {

		super(nombre);

		this.velocidadVuelo = velocidadVuelo;
	}

	@Override
	public void msg() {

		System.out.println(nombre + " puede volar");

		System.out.println("Velocidad: " + velocidadVuelo + " km/h");
	}

}

class PoderDisparar extends Hero {

	private int potencia;

	public PoderDisparar(String nombre, int potencia) {

		super(nombre);

		this.potencia = potencia;
	}

	@Override
	public void msg() {

		System.out.println(nombre + " puede disparar");

		System.out.println("Potencia: " + potencia);

	}

}

class PoderNadar extends Hero {

	private int velocidadNado;

	public PoderNadar(String nombre, int velocidadNado) {

		super(nombre);

		this.velocidadNado = velocidadNado;
	}

	@Override
	public void msg() {

		System.out.println(nombre + " puede nadar");

		System.out.println("Velocidad de nado: " + velocidadNado);

	}

}

class PoderInvisible extends Hero {

	private int duracion;

	public PoderInvisible(String nombre, int duracion) {

		super(nombre);

		this.duracion = duracion;
	}

	@Override
	public void msg() {

		System.out.println(nombre + " puede hacerse invisible");

		System.out.println("Duración: " + duracion + " segundos");

	}

}

class PoderLeerMentes extends Hero {

	private int distancia;

	public PoderLeerMentes(String nombre, int distancia) {

		super(nombre);

		this.distancia = distancia;
	}

	@Override
	public void msg() {

		System.out.println(nombre + " puede leer mentes");

		System.out.println("Distancia: " + distancia + " metros");

	}

}
