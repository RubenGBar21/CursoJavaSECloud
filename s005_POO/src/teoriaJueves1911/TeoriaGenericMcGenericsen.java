package teoriaJueves1911;

public class TeoriaGenericMcGenericsen {

	public static void main(String[] args) {
		
		//ejemploGeneric();
		lambdaMcgenericsen();
		
	}

	public static void lambdaMcgenericsen() {
		Procesador<String> texto = dato -> System.out.println("Hola " + dato);
		
		texto.procesar("Mamahuevo");
	}

	public static void ejemploGeneric() {
		Caja<String> cajaTexto = new Caja<>("Hola, Java");
		
		System.out.println(cajaTexto.getContenido());
		
		Caja<Integer> cajaNumero = new Caja<>(100);
		System.out.println(cajaNumero.getContenido());
		
		Caja<Double> cajaNumero2 = new Caja<>(100.1);
		System.out.println(cajaNumero2.getContenido());
		
		mostrar("\nJava");
		mostrar(25);
		mostrar(19.95);
		
		System.out.println("\nDato: " + mostrar2("jSON"));
		System.out.println("Dato: " + mostrar2(1));
		System.out.println("Dato: " + mostrar2(20.4));
		
		AlmacenTexto obj1 = new AlmacenTexto();
		obj1.guardar("Hola Javita");
		System.out.println(obj1.obtener());
		
		AlmacenEntero obj2 = new AlmacenEntero();
		obj2.guardar(122);
		System.out.println(obj2.obtener());
	}
	
	public static <T> void mostrar(T dato) {
		System.out.println(dato);
	}
	
	public static <T> T mostrar2(T dato) {
		return dato;
	}
	
}

class AlmacenTexto implements Almacen<String> {
	
	private String dato;

	public AlmacenTexto() {
		
	}
	
	public AlmacenTexto(String dato) {
		
		if (dato != null && !dato.equals("")) {
			this.dato = dato;
		}
		
	}
	
	@Override
	public void guardar(String dato) {
		this.dato = dato;
	}

	@Override
	public String obtener() {
		return this.dato;
	}
	
}

class AlmacenEntero implements Almacen<Integer> {
	
	private int dato;

	public AlmacenEntero() {
		
	}
	
	public AlmacenEntero(Integer dato) {
		
		if (dato > 0) {
			this.dato = dato;
		}
		
	}
	
	@Override
	public void guardar(Integer dato) {
		this.dato = dato;
	}

	@Override
	public Integer obtener() {
		return this.dato;
	}
	
}

class Caja<T> {
	
	private T contenido;
	
	public Caja(T contenido) {
		this.contenido = contenido;
	}

	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	}
	
}

interface Almacen<T> {
	void guardar(T dato);
	T obtener();
}

@FunctionalInterface
interface Procesador<T> {
	void procesar(T dato);
}
