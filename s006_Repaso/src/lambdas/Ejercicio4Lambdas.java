package lambdas;

import java.util.List;

public class Ejercicio4Lambdas {

	public static void main(String[] args) {
		
		//saludoLambdas();
		//operarLambdas();
		//check1Lambdas();
		//check2Lambdas();
		//check3Lambdas();
		//check4Lambdas();
		//check5Lambdas();
		//check6Lambdas();
		//check7Lambdas();
		listaLambdas();
	}

	public static void saludoLambdas() {
		Saludos saludo = () -> System.out.println("Hola");
		
		saludo.saludoBienvenida();
		saludo.saludoDespedida();
	}
	
	public static void operarLambdas() {
		OperacionLambdas multiplicar = (double a, double b) -> (a * b);
		OperacionLambdas dividir = (double a, double b) -> (a / b);
		
		System.out.println("Resultado: " + multiplicar.operar(2, 3));
		System.out.println("Resultado: " + dividir.operar(8, 2));
		
	}
	
	public static void check1Lambdas() {
		Checkit divisible = (int a) -> (a % 3 == 0);
		
		System.out.println("Resultado: " + (divisible.divisible3(21) ? "Sí" : "No"));
		System.out.println("Resultado: " + (divisible.divisible5(7) ? "Sí" : "No"));
		System.out.println("Resultado: " + (divisible.divisible5(15) ? "Sí" : "No"));
		
	}
	
	public static void check2Lambdas() {
		Checkit2 comprobar = (int a) -> (a > 0);
		
		System.out.println("Resultado: " + (comprobar.mayor0(21) ? "Sí" : "No"));
		System.out.println("Resultado: " + (comprobar.menor100(7) ? "Sí" : "No"));
		System.out.println("Resultado: " + (comprobar.mayor0(-15) ? "Sí" : "No"));
		
	}
	
	public static void check3Lambdas() {
		Checkit3 comprobar = (int a) -> (Math.abs(a));
		
		System.out.println("Resultado: " + comprobar.absoluto(21));
		System.out.println("Resultado: " + comprobar.absoluto(7));
		System.out.println("Resultado: " + comprobar.absoluto(-15));
		
	}
	
	public static void check4Lambdas() {
		Checkit4 calcular = (double a, double b) -> ((a * b )/2);
		
		System.out.println("Resultado: " + calcular.calculo(2, 2));
		System.out.println("Resultado: " + calcular.calculo(2, 5));
		System.out.println("Resultado: " + calcular.calculo(3, 15));
		
	}
	
	public static void check5Lambdas() {
		Checkit5 calcular = (double a, double b) -> (a * b);
		
		System.out.println("Resultado: " + calcular.areaRectangulo(2, 2));
		System.out.println("Resultado: " + calcular.areaRectangulo(2, 5));
		System.out.println("Resultado: " + calcular.areaRectangulo(3, 15));
		
	}
	
	public static void check6Lambdas() {
		Checkit6 calcular = (double a, double b) -> ((a * (100 - b)/100));
		
		System.out.println("Resultado: " + calcular.descuento(500, 15));
		System.out.println("Resultado: " + calcular.descuento(590, 15));
		System.out.println("Resultado: " + calcular.descuento(400, 20));
		
	}
	
	public static void check7Lambdas() {
		Checkit7 calcular = (double a, double b) -> (a + (a * (b/100)));
		
		System.out.println("Resultado: " + calcular.aplicarIVA(100, 21));
		System.out.println("Resultado: " + calcular.aplicarIVA(100, 3));
		
	}
	
	public static void listaLambdas() {
		
		List<String> asignaturas = List.of(
				"Matematicas", "Lengua",
				"Inglés", "Programación");
		
		System.out.println("For Each normal: ");
		for(String asignatura: asignaturas) {
			System.out.println(asignatura);
		}
		
		System.out.println();
		
		System.out.println("For Each Lambda: ");
		asignaturas.stream().forEach(System.out::println);
		
	}
	
}

@FunctionalInterface
interface Saludos {
	void saludoBienvenida();
	default void saludoDespedida() {
		System.out.println("¡Hasta pronto!");
	}
}

@FunctionalInterface
interface OperacionLambdas {
	double operar(double a, double b);
}

@FunctionalInterface
interface Checkit {
	boolean divisible3(int a);
	default boolean divisible5(int a) {
		return (a % 5 == 0);
	}
}

@FunctionalInterface
interface Checkit2 {
	boolean mayor0(int a);
	default boolean menor100(int a) {
		return (a < 100);
	}
}

@FunctionalInterface
interface Checkit3 {
	int absoluto(int a);
}

@FunctionalInterface
interface Checkit4 {
	double calculo(double a, double b);
}

@FunctionalInterface
interface Checkit5 {
	double areaRectangulo(double a, double b);
}

@FunctionalInterface
interface Checkit6 {
	double descuento(double a, double b);
}

@FunctionalInterface
interface Checkit7 {
	double aplicarIVA(double a, double b);
}