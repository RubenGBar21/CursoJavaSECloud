package s002repasoIntro;

import java.util.Scanner;

public class s002_RepasoIntro {
	
	static String nombre;
	static String apellido;
	static int edad;
	static double altura;
	static double nota;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		pedirDatos(sc);
		mostrarDatos();
		sc.close();
		
	}
	
	public static void pedirDatos(Scanner sc) {
		
		System.out.println("¿Cuál es el nombre del alumno?");
		nombre = sc.nextLine();
		
		System.out.println("\n¿Cuál es el apellido del alumno?");
		apellido = sc.nextLine();
		
		System.out.println("\n¿Cuál es la edad del alumno?");
		edad = sc.nextInt();
		
		System.out.println("\n¿Cuál es la altura del alumno?");
		altura = sc.nextDouble();
		
		System.out.println("\n¿Cuál es la nota del alumnado?");
		nota = sc.nextDouble();
		
	}
	
	public static void mostrarDatos() {
		
		System.out.println("\n| FICHA DEL ALUMNO |");
		System.out.println("| Nombre: " + nombre);
		System.out.println("| Apellidos: " + apellido);
		System.out.println("| Edad: " + edad);
		System.out.println("| Altura: " + altura);
		System.out.println("| Nota: " + nota);
		
		
		if (nota >=0 && nota < 5) {
			
			System.out.println("| El alumno ha suspendido");
			
		} else if (nota >= 5 && nota <= 10) {
			
			System.out.println("| El alumno ha aprobado");
			
		} else {
			
			System.out.println("| El alumno no se ha presentado");
		}
		
	}
	
}
