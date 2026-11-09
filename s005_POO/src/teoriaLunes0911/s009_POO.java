package teoriaLunes0911;

import java.util.Scanner;

public class s009_POO {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String deporte = "";
		Estudiante estudiante1 = new Estudiante("Rubén", 22, 'M', 1.85);
		Estudiante estudiante2 = new Estudiante();
		Estudiante estudiante3 = new Estudiante("Alex", 20, 'N', 1.70);
		estudiante2.setNombre("María");
		estudiante2.setEdad(20);
		estudiante2.setGenero('F');
		estudiante2.setAltura(1.55);
		
		estudiante1.saludo();
		estudiante1.mostrarDatos();
		System.out.println();
		estudiante2.saludo();
		estudiante2.mostrarDatos();
		System.out.println();
		estudiante3.saludo();
		estudiante3.mostrarDatos();
		System.out.println("Altura : " + estudiante3.getAltura());
		System.out.println("¿Qué deporte practicas?");
		deporte = sc.next();
		estudiante3.mostrarDeporte(deporte);
		
	}
	
}

class Estudiante {

	// Atributos
	private String nombre;
	private int edad;
	private char genero;
	private double altura;

	// Constructores
	public Estudiante() {

	}
	
	public Estudiante(String nombre, int edad, char genero, double altura) {

		if (edad != 0) {

			this.edad = edad;

		}
		
		if (altura != 0) {
			
			this.altura = altura;
			
		}

		if (nombre != null && !nombre.equals("")) {

			this.nombre = nombre;

		}
		
		if (genero == 'F' || genero == 'M' || genero == 'N') {
			
			this.genero = genero;
			
		}

	}

	// Getters y Setters
	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		if (!nombre.equals(null) && !nombre.equals("")) {

			this.nombre = nombre;

		}

	}
	
	public int getEdad() {
		
		return edad;
		
	}

	public void setEdad(int edad) {
		if (edad != 0) {

			this.edad = edad;

		}
	}

	public char getGenero() {

		return genero;

	}

	public void setGenero(char genero) {

		if (genero == 'F' || genero == 'M' || genero == 'N') {

			this.genero = genero;

		}

	}
	
	public double getAltura() {
		
		return altura;
		
	}

	public void setAltura(double altura) {
		
		if (altura != 0) {

			this.altura = altura;

		}
		
	}
	
	
	// Procedimientos
	public void saludo() {
		
		if (genero == 'M') {
			
			System.out.println("Hola soy un estudiante");
			
		} else if (genero == 'F') {
			
			System.out.println("Hola soy una estudiante");
			
		} else if (genero == 'N') {
			
			System.out.println("Hola soy une estudiante");
			
		}
		
	}
	
	public void mostrarDatos() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		
	}
	
	public void mostrarDeporte (String deporte) {
		
		System.out.println("Deporte: " + deporte);
		
	}

}