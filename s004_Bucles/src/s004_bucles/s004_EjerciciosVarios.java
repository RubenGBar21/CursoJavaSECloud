package s004_bucles;

import java.util.Scanner;

public class s004_EjerciciosVarios {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//tarea01();
		//tarea02();
		//tarea03();
		//tarea04();
		//tarea05();
		//tarea06();
		//tarea07();
		//tarea08();
		//tarea09();
		tarea10();
		sc.close();
		
	}
	
	public static void tarea01() {
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca un número: ");
		num2 = sc.nextInt();
		
		System.out.println("La suma de esos números es: " + (num1 + num2));
		
	}
	
	public static void tarea02() {
		
		int num1 = 0;
		
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		
		if (num1 < 0) {
			
			System.out.println("El número es negativo");
			
		} else if (num1 > 0) {
			
			System.out.println("El número es positivo");
			
		} else {
			
			System.out.println("El número es 0");
			
		}
		
	}
	
	public static void tarea03() {
		
		int num1 = 0;
		int numseguir = 0;
		boolean seguir = false;
		
		do {
			
			System.out.println("Introduzca un número: ");
			num1 = sc.nextInt();
			
			System.out.println((num1 % 2 == 0) ? "El número es par" : "El número es impar");
			
			System.out.println("Pulsa 1 para seguir");
			numseguir = sc.nextInt();
			seguir = numseguir == 1;
			
		} while (seguir);
		
	}
	
	public static void tarea04() {

		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				Thread.interrupted();
				
			}
		}

	}
	
	public static void tarea05() {

		System.out.println(" | Tabla del 5");
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(" | 5 x " + i + " = " + (5*i));
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				Thread.interrupted();
				
			}
		}

	}
	
	public static void tarea06() {
		
		int res = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			res += i;
			
		}
		
		System.out.println(" La suma de todos los números del 1 al 10 es: " + res);

	}
	
	public static void tarea07() {
		
		int num1 = 0;
		
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.println("El número es: " + num1);
		
	}
	
	public static void tarea08() {
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce un número: ");
		num2 = sc.nextInt();
		
		System.out.println("La suma de esos números es: " + (num1 + num2));
		System.out.println("La resta de esos números es: " + (num1 - num2));
		System.out.println("La mutiplicación de esos números es: " + (num1 * num2));
		
		try {
			
			System.out.println("La división de esos números es: " + (num1 / num2));
			
		} catch (ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0");
			
		}
		
	}
	
	public static void tarea09() {
		
		int num1 = 0;
		
		System.out.println("Introduzca la longitud de un lado de un cuadrado: ");
		num1 = sc.nextInt();
		
		System.out.println("Su área es: " + (Math.pow(num1, 2)));
		
	}
	
	public static void tarea10() {
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Introduzca la base del rectángulo: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca el lado del rectángulo: ");
		num2 = sc.nextInt();
		
		System.out.println("Su área es: " + (num1 * num2));
		
	}

}
