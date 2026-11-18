package lambdas;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Datos {

	static Path ruta = Path.of("src", "sugerencias.txt");
	
	public static void main(String[] args) {
		
		s012_datos();
		s013_datosread();
		
	}

	public static void s012_datos() {
		
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apellidos = "";
		String sugerencia = "";
		
		System.out.println("¿Cómo se llama usted?");
		nombre = sc.nextLine();
		
		System.out.println("¿Y sus apellidos?");
		apellidos = sc.nextLine();
		
		System.out.println("¿Cuál es su sugerencia o queja?");
		sugerencia = sc.nextLine();
		
		
		try (BufferedWriter bw = Files.newBufferedWriter(ruta)) {
		    
			bw.write("Sugerencias de: " + nombre + " " + apellidos);
		    bw.newLine();
		    bw.write("Sugerencias/Quejas: " + sugerencia);
		    System.out.println("Se ha escrito en el archivo: " + ruta.getFileName() + " correctamente");
		    
		    bw.flush();
		    bw.close();
		    
		} catch (IOException e) {
		    System.err.println("Error al escribir en el archivo: " + e);
		}
	}
	
	public static void s013_datosread() {
		
		try {
			
			List<String> lineas = Files.readAllLines(ruta);
			
			for (String linea : lineas) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
		
	}
	
	
}
