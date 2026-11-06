package s004_teoriaViernes;

import java.util.Scanner;

public class s004_Teoria {

	static Scanner sc = new Scanner(System.in);
	enum EstadoCivil {
		SOLTERO, CASADO, DIVORCIADO, VIUDO
	}

	public static void main(String args[]) {

		//ejemploArray();
		ejemploArray2D();
		sc.close();

	}
	
	public static void ejemploEnum() {
		
		EstadoCivil estado = EstadoCivil.SOLTERO;
		int opc = 0;

		System.out.println("|====================|");
		System.out.println("|    ESTADO CIVIL    |");
		System.out.println("|====================|");
		System.out.println("| 1. SOLTERO         |");
		System.out.println("| 2. CASADO          |");
		System.out.println("| 3. DIVORCIADO      |");
		System.out.println("| 4. VIUDO           |");
		System.out.println("|====================|");

		System.out.println("Seleccione una opción: ");
		opc = sc.nextInt();

		switch (opc) {

		case 1:
			estado = EstadoCivil.SOLTERO;
			break;

		case 2:
			estado = EstadoCivil.CASADO;
			break;

		case 3:
			estado = EstadoCivil.DIVORCIADO;
			break;

		case 4:
			estado = EstadoCivil.VIUDO;
			break;

		default:
			System.out.println("Opción Incorrecta");
			break;

		}

		System.out.println("Tu estado civl es: " + estado);
		
	}
	
	public static void ejemploArray() {
		
		String[] alumnos = {"Pablo", "Gabriela", "Rafael", "Miguel", "Rubén"};
		int[] edades = {20, 25, 30, 35, 40};
		int res = 0;
		
		for (int i = 0; i < edades.length; i++) {
			
			res += edades[i];
			System.out.println("Alumno: " + alumnos[i]);
			System.out.println("Edad: " + edades[i] + "\n");
			
		}
		
		res /= edades.length;
		System.out.println("Edad Media: " + res);
		
	}
	
	public static void ejemploArray2D() {
		
		int[][] notas = { {8, 7, 9, 10, 7}, {6, 8, 7, 7, 6}, {9, 9, 10, 7, 7} };
		
		for (int i = 0; i < notas.length; i++) {
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
