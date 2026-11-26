package ejercicioMiercoles2511HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class EjercicioHashMap {

	public static void main(String[] args) {
		
		ejemploAlumnos();
		//ejemploInventario();
		//ejemploDiccionario();
		
	}

	public static void ejemploDiccionario() {
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
		
		sc.close();
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
		Scanner sc = new Scanner(System.in);
		double nota = 0;
		String alumnoBuscar = "";
		
		
		alumnos.put("Ana", 8.5);
		alumnos.put("Carlos", 6.0);
		alumnos.put("Maria", 9.2);
		alumnos.put("Pedro", 4.5);
		alumnos.put("Laura", 7.8);
		
		System.out.println("LISTADO DE ALUMNOS");
		
		for(Map.Entry<String, Double> alumno: alumnos.entrySet()) {
			
			System.out.println(alumno.getKey() + " - " + alumno.getValue());
			
		}
		
		System.out.println("¿De que alumno quieres ver la nota?");
		alumnoBuscar = sc.nextLine();
		
		System.out.println("\nNota de María: " + alumnos.get(alumnoBuscar));
		
		System.out.println("¿De que alumno quieres cambiar la nota?");
		alumnoBuscar = sc.nextLine();
		
		System.out.println("Introduce la nueva nota del alumno");
		nota = sc.nextDouble();
		
		alumnos.replace(alumnoBuscar, nota);
		
		sc.nextLine();
		System.out.println("¿Que alumno quieres ver si está aprobado?");
		alumnoBuscar = sc.nextLine();
		
		System.out.println(alumnos.get(alumnoBuscar) >= 5 ? "Aprobado" : "Suspenso");
		
		System.out.println("¿Que alumno quieres eliminar?");
		alumnoBuscar = sc.nextLine();
		
		alumnos.remove(alumnoBuscar);
		
		System.out.println("Total alumnos: " + alumnos.size());
		
		System.out.println("\nLISTADO DE ALUMNOS MODIFICADA");
		
		for(Map.Entry<String, Double> alumno: alumnos.entrySet()) {
			
			System.out.println(alumno.getKey() + " - " + alumno.getValue());
			
		}
		
		sc.close();
	}
	
}
