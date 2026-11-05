package proyectos;

import java.util.Scanner;

public class s002_Ejercicio {
	
	static int nota;
	static Scanner sc = new Scanner(System.in);
	
	public int getNota() {
		return nota;
	}

	public static void main(String[] args) {
		
		pedirNota(sc);
		haAprobado();
		sc.close();
		
	}
	
	public static void pedirNota(Scanner sc) {
		
		System.out.println("¿Cuál es la nota del alumnado?");
		nota = sc.nextInt();
		
	}
	
	public static void haAprobado() {
		
		if (nota >=0 && nota < 5) {
			
			System.out.println("El alumno ha suspendido");
			
		} else if (nota >= 5 && nota <= 10) {
			
			System.out.println("El alumno ha aprobado");
			
		} else {
			
			System.out.println("El alumno no se ha presentado");
		}
		
	}

}
