package ejercicios_strings;

import java.util.Scanner;

public class FuncionesStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String textoLargo = "";
		String palabraBuscar = "";
		String letraASustituir = "";
		String letraQueSustituye = "";
		String numeroRepetir = "";
		String cadenaSubstring = "";
		
		System.out.println("Introduzca un texto");
		textoLargo = sc.nextLine();
		
		System.out.println("\nDatos");
		System.out.println("Longitud del texto: " + textoLargo.length());
		System.out.println("¿Está vacío? " + (textoLargo.isEmpty() ? "Sí" : "No"));
		System.out.println("¿Tiene sólo espacios? " + (textoLargo.isEmpty() ? "Sí" : "No"));
		
		System.out.println("\nIntroduzca una palabra a buscar en el texto");
		palabraBuscar = sc.nextLine();
		
		System.out.println("¿Contiene esa palabra? " + (textoLargo.contains(palabraBuscar) ? "Sí" : "No"));
		
		System.out.println("\nCadena sin espacios exteriores: " + textoLargo.trim());
		
		System.out.println("\nDime una letra a sustituir en el texto: ");
		letraASustituir = sc.next();
		
		System.out.println("¿Con qué letra lo quieres sustituir?");
		letraQueSustituye = sc.next();
		
		System.out.println("Texto cambiado: " + textoLargo.replace(letraASustituir.charAt(0), letraQueSustituye.charAt(0)));
		System.out.println("Sólo la primera aparición cambiada: " + textoLargo.replaceFirst(letraASustituir, letraQueSustituye));
		
		System.out.println("\nDime un número a repetir: ");
		numeroRepetir = sc.next();
		
		System.out.println(numeroRepetir.repeat(Integer.valueOf(numeroRepetir)));
		
		System.out.println("\nDime una palabra a cortar: ");
		cadenaSubstring = sc.next();
		
		if (cadenaSubstring.length() >= 4) {
			System.out.println(cadenaSubstring.substring(0, 4));
		}
		
		sc.close();
		
	}
	
}
