package ejerciciosJueves1211;

import java.util.Scanner;
import java.util.Stack;

public class ejerciciosPilas {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//gestionarNombres();
		//gestionarNumeros();
		gestionarWebs();
		
	}
	
	public static void gestionarNombres() {
		
		Stack<String> nombres = new Stack<>();
		int i = 0;
		
		while (i < 5) {
			System.out.println("Ingrese un nombre: ");
			String nombre = sc.nextLine();
			nombres.push(nombre);
			i++;
			
		}
		
		System.out.println();
		
		for (int j = 0; j < nombres.size(); j++) {
			System.out.println(nombres.get(j));
		}
		
		System.out.println("\nEl último nombre ingresado es: " + nombres.peek());
		System.out.println("Eliminando a: " + nombres.pop());
		
		for (int k = 0; k < nombres.size(); k++) {
			System.out.println("\n" + nombres.get(k));
		}
	}
	
	public static void gestionarNumeros() {
		
		Stack<Integer> numeros = new Stack<>();
		int suma = 0;
		int i = 0;
		
		while (i < 5) {
			System.out.println("Ingrese un número: ");
			int numero = sc.nextInt();
			numeros.push(numero);
			i++;
			
		}
		
		System.out.println();
		
		for (Integer numero : numeros) {
			System.out.println(numero);
			suma += numero;
		}
		
		System.out.println("\nSuma de los números ingresados: " + suma);
		System.out.println("El último número ingresado es: " + numeros.peek());
		System.out.println("Eliminando a: " + numeros.pop());
		System.out.println("Eliminando a: " + numeros.remove(3));
		System.out.println("Tamaño de la pila: " + numeros.size());
		
	}
	
	public static void gestionarWebs() {
		
		Stack<String> webs = new Stack<>();
		int i = 0;
		
		while (i < 4) {
			System.out.println("Ingrese una web: ");
			String web = sc.nextLine();
			webs.push(web);
			i++;
			
		}
		
		System.out.println("\nWebs visitadas: ");
		
		for (String web : webs) {
			System.out.println(web);
		}
		
		System.out.println("\nÚltima web visitada: " + webs.peek());
		webs.pop();
		System.out.println("Te encuentras en: " + webs.peek());
		
		System.out.println("¿El historial está vacío? " + webs.isEmpty());
	}
	
}
