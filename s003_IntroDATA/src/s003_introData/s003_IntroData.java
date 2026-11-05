package s003_introData;

import java.util.Scanner;

public class s003_IntroData {

	static String nombre;
	static String asignatura;
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
		
		System.out.println("¿Cuál es su nombre?");
		nombre = sc.next();
		
		System.out.println("\n¿Cuál es su edad?");
		edad = sc.nextInt();
		
		System.out.println("\n¿Cuál es su altura?");
		altura = sc.nextDouble();
		
		System.out.println("\n¿Cuál es la asignatura?");
		sc.nextLine();
		asignatura = sc.next();
		
		System.out.println("\n¿Cuál es su nota?");
		nota = sc.nextDouble();
		
	}
	
	public static void mostrarDatos() {
		
		System.out.println("\n| FICHA DEL ALUMNO |");
		System.out.println("| Nombre: " + nombre);
		System.out.print("| Edad: " + edad);
		System.out.println((edad >= 18) ? " - El alumno es mayor de edad" : " - El alumno es menor de edad");
		System.out.print("| Altura: " + altura);
		
		if (altura >= 0.10 && altura <= 1.30) { 
			
			System.out.println(" - El alumno es bajo");
			
		} else if (altura >= 1.31 && altura <= 1.79) {
			
			System.out.println(" - El alumno es de altura media");
			
		} else if (altura >= 1.80) {
			
			System.out.println(" - El alumno es alto");
			
		} else {
			
			System.out.print(" - Altura no humana");
			
		}
		
		System.out.println("| Asigntaura: " + asignatura);
		System.out.println("| Nota: " + nota);
		
		if (nota >=0 && nota < 5) {
			
			System.out.println("| El alumno ha suspendido");
			
		} else if (nota >= 5 && nota <= 10) {
			
			System.out.println("| El alumno ha aprobado");
			
		} else {
			
			System.out.println("| Nota Incorrecta");
		}
		
	}
	
}
