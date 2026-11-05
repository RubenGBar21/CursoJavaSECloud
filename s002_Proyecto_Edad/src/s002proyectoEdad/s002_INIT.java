package s002proyectoEdad;

import java.util.Scanner;

public class s002_INIT {

	static String nombre;
	static int edad;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		pedirDatos(sc);
		mostrarDatos();
		sc.close();
		
	}
	
	public static void pedirDatos(Scanner sc) {
		
		System.out.println("¿Cuál es su nombre?");
		nombre = sc.nextLine();

		System.out.println("\n¿Cuál es su edad?");
		edad = sc.nextInt();
		
	}
	
	public static void mostrarDatos() {
		
		System.out.println("| Nombre: " + nombre);
		System.out.println("| Edad: " + edad);
		
		if (edad >=0 && edad < 18) {
			
			System.out.println("| Usted es menor de edad");
			
		} else if (edad >= 18 && edad <= 130) {
			
			System.out.println("| Usted es mayor de edad");
			
		} else {
			
			System.out.println("| Usted no es humano");
		}
		
	}
	
}
