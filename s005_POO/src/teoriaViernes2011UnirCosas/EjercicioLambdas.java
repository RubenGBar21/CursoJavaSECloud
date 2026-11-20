package teoriaViernes2011UnirCosas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class EjercicioLambdas {
	
	public static void main(String[] args) {
		
		//ejemploLambdas();
		//ejemploContar();
		ejemploLeerLineas();
		
		
	}

	public static void ejemploLeerLineas() {
		Path archivo = Path.of("src/frases.txt");
		long cantidad = 0;
		
		try {
			
			cantidad = Files.lines(archivo).count();
			
		} catch (IOException e) {
			
			System.err.println("Error leyendo el archivo");
			
		}
		
		System.out.println("Nº de líneas: " + cantidad);
	}

	public static void ejemploContar() {
		List<Integer> numeros = Arrays.asList(
				10, 50, 60, 80, 90, 35, 
				85, 95, 105, 40, 70
				);
		long cantidad = 0;
		
		cantidad = numeros.stream()
				.filter(n -> n > 75)
				.count();
		
		System.out.println("Residentes mayores de 75: " + cantidad);
	}

	public static void ejemploLambdas() {
		List<Producto> productos = Arrays.asList(
				new Producto("Auriculares", 50),
				new Producto("Raton", 15),
				new Producto("Teclado", 30),
				new Producto("Monitor", 150),
				new Producto("Alfombrilla", 10)
				);
		
		for (Producto p: productos) {
			
			System.out.println("Producto: " + p.getNombre() + " " + p.getPrecio() + "€" + " | Descuento del 10%: " + (p.getPrecio() * 0.90) + "€ ");
		}
	}
	
}


class Producto {
	
	private String nombre;
	private double precio;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, double precio) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	
	
	
}
