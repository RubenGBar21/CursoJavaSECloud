package ejerciciosMartes2411BBDD;

import java.util.Scanner;

public class EjercicioHilos5 {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Scanner sc = new Scanner(System.in);
		HiloRegistro hr = new HiloRegistro(persona, sc);
		HiloComprobacion hc = new HiloComprobacion(persona);
		
		System.out.println("================================");
		System.out.println("SISTEMA DE REGISTRO DE USUARIOS");
		System.out.println("================================");
		
		try {

			hr.start();
			hr.join();
			hc.start();
			hc.join();
			
		} catch (InterruptedException e) {
			
			System.err.println("Error: " + e);
			Thread.currentThread().interrupt();
			
		}
		
		sc.close();
		System.out.println("================================");
		System.out.println("       SISTEMA FINALIZADO       ");
		System.out.println("================================");
	}
	
}

class HiloRegistro extends Thread {
	
	Persona persona;
	Scanner sc;
	
	public HiloRegistro() {
		
	}
	
	public HiloRegistro(Persona persona, Scanner sc) {
		this.persona = persona;
		this.sc = sc;
	}
	
	@Override
	public void run() {
		
		System.out.println("\nIntroduzca su nombre ");
		persona.setNombre(sc.nextLine());
		
		System.out.println("Introduzca su edad ");
		persona.setEdad(sc.nextInt());
		
		sc.nextLine();
		System.out.println("Introduzca su ciudad");
		persona.setCiudad(sc.nextLine());
		
		System.out.println("\nHilo Registro: Registrando usuario");
		
		System.out.println(persona.toString());
		
		try {
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
			System.err.println("Error: " + e);
			Thread.currentThread().interrupt();
			
		}
		
		System.out.println("\nHiloRegistro: Registro finalizado");
		
	}
	
}

class HiloComprobacion extends Thread {
	
	Persona persona;
	
	public HiloComprobacion() {
		
	}
	
	public HiloComprobacion(Persona persona) {
		this.persona = persona;
	}
	
	@Override
	public void run() {
		
		System.out.println("\nHiloComprobacion: Comprobando edad...");
		System.out.println((persona.getEdad() >= 18) ? "\nLa persona es MAYOR de edad" : "\nLa persona es MENOR de edad");
		
		try {
			
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
			System.err.println("Error: " + e);
			Thread.currentThread().interrupt();
			
		}
		
		System.out.println("\nHiloComprobacion: Comprobacion de datos finalizado");
		
	}
	
}

class Persona {
	
	String nombre;
	int edad;
	String ciudad;
	
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + 
			   "\nEdad: " + edad +
			   "\nCiudad: " + ciudad;
	}
	
}