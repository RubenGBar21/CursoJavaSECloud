package teoriaLunes1611;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;

public class Teoria {

	public static void main(String[] args) {

		//ejemploLamba();

//		try {
//			prestar(0);
//		} catch (IllegalArgumentException e) {
//			System.err.println("Error: " + e.getMessage());
//
//		}
		
		//interfazLambda();
		
		//ifLambda();
		
		//ejemploRutas();
		
		ejemploLectura();
		
	}

	public static void ejemploLectura() {
		Path ruta = Path.of("datos.txt");
		
		try {
			
			List<String> lineas = Files.readAllLines(ruta);
			
			for (String linea : lineas) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
	}

	public static void ejemploRutas() {
		
		Path ruta = Path.of("datos.txt");
		Path ruta2 = Path.of("").toAbsolutePath().resolve("datos.txt");
		System.out.println("Nombre del archivo: " + ruta.getFileName());
		System.out.println("Ruta absoluta: " + ruta.toAbsolutePath());
		System.out.println("¿Es una ruta absoluta? " + ruta2.isAbsolute());
		
	}

	public static void ifLambda() {
		
		Predicate<Integer> esMayorDe10 = numero -> numero > 10;
		
		System.out.println("¿Es 15 mayor que 10? " + (esMayorDe10.test(15) ? "Sí" : "No"));
	}

	public static void ejemploLamba() {

		List<String> libros = List.of("Java básico", "Python práctico", "Java avanzado", "Desarrollo web");

		libros.stream().filter(titulo -> titulo.contains("Java")).forEach(System.out::println);

	}

	public static void prestar(int ejemplaresDisponibles)  {

		if (ejemplaresDisponibles <= 0) {
			throw new IllegalArgumentException("No hay ejemplares disponibles disponibles");
		}
		System.out.println("Préstamo realizado correctamente");
	}
	
	public static void interfazLambda() {
		
		Operation suma = (a, b) -> a + b;
		Operation resta = (a, b) -> a - b;
		
		System.out.println("Suma: " + suma.calculate(10, 5));
		System.out.println("Resta: " + resta.calculate(10, 5));
		
	}

}

interface Operation {
	int calculate(int a, int b);
}
