package ejerciciosLunes0911;

import java.util.Scanner;

public class s011_POOExcercise2 {

	static Scanner sc = new Scanner(System.in);
	static Calculadora cal = new Calculadora();

	public static void main(String[] args) {

		boolean seguir = false;
		int opc = 0;

		double res = 0;

		do {

			System.out.println("\n1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			opc = sc.nextInt();

			switch (opc) {

			case 1:
				System.out.println("Primer número a sumar: ");
				cal.setNum1(sc.nextDouble());
				
				System.out.println("Segundo número a sumar: ");
				cal.setNum2(sc.nextDouble());
				
				res = cal.sumar();
				
				System.out.println();
				break;

			case 2:
				System.out.println("Primer número a restar: ");
				cal.setNum1(sc.nextDouble());
				
				System.out.println("Segundo número a restar: ");
				cal.setNum2(sc.nextDouble());
				
				res = cal.restar();
				break;

			case 3:
				System.out.println("Primer número a multiplicar: ");
				cal.setNum1(sc.nextDouble());
				
				System.out.println("Segundo número a multiplicar: ");
				cal.setNum2(sc.nextDouble());
				
				res = cal.multiplicar();
				break;

			case 4:
				System.out.println("Primer número a dividir: ");
				cal.setNum1(sc.nextDouble());
				
				System.out.println("Segundo número a dividir: ");
				cal.setNum2(sc.nextDouble());
				
				res = cal.dividir();
				
				if (cal.getNum2() == 0) {
					System.err.println("No se puede dividir entre 0");
				}
				
				break;

			default:
				seguir = false;
				break;
			}
			
			if (opc != 4) {
				System.out.println("Resultado: " + res);
			}
			
			System.out.println("¿Quieres seguir? s/n");
			seguir = (sc.next().equals("s"));
			
		} while (seguir);
		
		sc.close();

	}

}
