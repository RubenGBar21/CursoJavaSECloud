package teoríaMartes1711;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Teoria implements AutoCloseable {

	public static void main(String[] args) {
		
		//ejemploEscribirEnArchivo(); 
		//ejemploLambaInterfacesFuncionales();
		ejemploLambdaArrayList();
		
	}

	public static void ejemploLambdaArrayList() {
		List<String> nombres = List.of("Ruben", "Juan", "Pepe", "Maria", "Laura");
		
		nombres.stream().filter(nombre -> (nombre.length() > 4)).forEach(System.out::println);
	}
	
	public static void ejemploLambaInterfacesFuncionales() {
		Operaciones opera = (a) -> (a % 2 == 0);
		Operacion suma = (a, b) -> a + b;		
		Saludo saludo = () -> System.out.println("Resultado: " + suma.calcular(10, 20));
		Mayor mayoria = (a) -> (a > 17);
		Pasar pasador = (a) -> (a.toUpperCase());
		saludo.saludar();
		System.out.println("¿Es par? " + (opera.esPar(15) ? "Sí" : "No" ));
		System.out.println("¿Es mayor de edad? " + (mayoria.esMayorDeEdad(17) ? "Sí" : "No" ));
		System.out.println("¿Es mayor de edad? " + (mayoria.esMayorDeEdad(18) ? "Sí" : "No" ));
		System.out.println("Mensaje a mayúsculas: " + pasador.pasarAMayus("hola"));
		System.out.println(capitalize("hola"));
		
	}

	public static void ejemploEscribirEnArchivo() {
		Path ruta = Path.of("src", "datos.txt");
		
		try (BufferedWriter bw = Files.newBufferedWriter(ruta)) {
		    
			bw.write("Primera línea");
		    bw.newLine();
		    bw.write("Segunda línea");
		    System.out.println("Se ha escrito en el archivo: " + ruta.getFileName() + " correctamente");
		    
		    bw.flush();
		    bw.close();
		    
		} catch (IOException e) {
		    System.err.println("Error al escribir en el archivo: " + e);
		}
	}
	
	public static String capitalize(String texto) {
		
		String textoModificado = "";
		
		if (texto != null || !texto.equals("")) {
			textoModificado = texto.substring(0, 1).toUpperCase() + texto.substring(1);
		}
		
		return textoModificado;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Se ha cerrado el escritor de archivos");
		
	}
	
}

@FunctionalInterface
interface Saludo{
	void saludar();
}

@FunctionalInterface
interface Operacion {
	int calcular(int a, int b);
}

@FunctionalInterface
interface Operaciones {
	boolean esPar(int a);
}

@FunctionalInterface
interface Mayor {
	boolean esMayorDeEdad(int a);
}

@FunctionalInterface
interface Pasar {
	String pasarAMayus(String a);
}
