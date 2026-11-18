package ejercicios_strings;

import java.util.Scanner;

public class FuncionesStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String textoLargo = "";
		String palabraBuscar = "";
		
		System.out.println("Introduzca un texto");
		textoLargo = sc.nextLine();
		
		System.out.println("\nDatos");
		System.out.println("Longitud del texto: " + textoLargo.length());
		System.out.println("¿Está vacío?" + (textoLargo.isEmpty() ? "Sí" : "No"));
		System.out.println("¿Tiene sólo espacios?" + (textoLargo.isEmpty() ? "Sí" : "No"));
		
		System.out.println("\nIntroduzca una palabra a buscar en el texto");
		palabraBuscar = sc.nextLine();
		
		System.out.println("¿Contiene esa palabra? " + (textoLargo.contains(palabraBuscar) ? "Sí" : "No"));
		
		System.out.println("\nCadena sin espacios exteriores: " + textoLargo.trim());
		
		
	}
	
}
