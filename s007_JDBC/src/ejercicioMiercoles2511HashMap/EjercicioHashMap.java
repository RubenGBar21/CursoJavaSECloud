package ejercicioMiercoles2511HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class EjercicioHashMap {

	public static void main(String[] args) {
		
		//ejemploAlumnos();
		ejemploInventario();
		
		HashMap<String, String> diccionario = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String palabra = "";
		String traduccion = "";
		
		diccionario.put("Hola", "Hello");
		diccionario.put("Adios", "Bye");
		diccionario.put("Bien", "Good");
		diccionario.put("Mal", "Bad");
		diccionario.put("Numero", "Number");
		diccionario.put("Word", "Palabra");
		diccionario.put("Computer", "Ordenador");
		diccionario.put("Cantar", "Sing");
		diccionario.put("Game", "Juego");
		diccionario.put("Color", "Color");
		
		System.out.println("Introduzca una palabra");
		palabra = sc.nextLine();
		
		if(diccionario.containsKey(palabra)) {
			
			System.out.println("Traducción de la palabra" + diccionario.get(palabra));
			
		} else {
			
			System.out.println("No existe esa palabra en el diccionario");
			
		}
		
		System.out.println("Añade una palabra");
		palabra = sc.nextLine();
		
		System.out.println("Añade su traducción");
		traduccion = sc.nextLine();
		
		diccionario.put(palabra, traduccion);
		
		
	}

	public static void ejemploInventario() {
		HashMap<String, Integer> inventario = new HashMap<>();
		
		inventario.put("Alicate", 10);
		inventario.put("Motosierra", 15);
		inventario.put("Martillo", 3);
		inventario.put("Destornillador", 5);
		inventario.put("Llave inglesa", 7);
		
		for(Map.Entry<String, Integer> producto: inventario.entrySet()) {
			
			System.out.println(producto.getKey() + " : " + producto.getValue());
			
		}
		
		System.out.println("\nMartillo: " + inventario.get("Martillo") + "\n");
		
		inventario.replace("Alicate", 5);
		inventario.remove("Motosierra");
		
		for(Map.Entry<String, Integer> producto: inventario.entrySet()) {
			
			System.out.println(producto.getKey() + " : " + producto.getValue());
			
		}
		
	}

	public static void ejemploAlumnos() {
		HashMap<String, Double> alumnos = new HashMap<>(); 
		
		alumnos.put("Antonio", 8.5);
		alumnos.put("Maria", 9.0);
		alumnos.put("Pedro", 6.5);
		alumnos.put("Lucia", 7.5);
		alumnos.put("Carlos", 5.0);
		
		System.out.println("LISTADO DE ALUMNOS");
		
		for(Map.Entry<String, Double> alumno: alumnos.entrySet()) {
			
			System.out.println(alumno.getKey() + " - " + alumno.getValue());
			
		}
		
		System.out.println("\nNota de Maria: " + alumnos.get("Maria"));
		
		System.out.println(alumnos.containsKey("Antonio") ? "Existe el alumno" : "No existe el alumno");
		
		System.out.println("Total alumnos: " + alumnos.size());
	}
	
}
