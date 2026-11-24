package ejerciciosMartes2411BBDD;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio2Hilos {

	public static void main(String[] args) {
		
		LocalDate dia = LocalDate.now();
		HiloDiaSemana hds = new HiloDiaSemana(dia);
		HiloActividades ha = new HiloActividades(dia);
		
		System.out.println("Iniciando aplicación...");
		
		hds.start();
		ha.start();
		
		try {
			
			hds.join();
			ha.join();

		} catch (InterruptedException e) {

			System.err.println("Error: " + e);

		}
		
		System.out.println("\nAplicación finalizada");
		
	}
	
}

class HiloActividades extends Thread {
	
	DayOfWeek dia;
	
	public HiloActividades(LocalDate dia) {
		this.dia = dia.getDayOfWeek();
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i <= 5; i++) {
			
			try {
				
				Thread.sleep(100);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}
			
			System.out.println("HiloActividades: Actividad de hoy: ");
			
			switch(dia) {
			
			case MONDAY:
				System.out.println("Estudiar Java");
				break;
			
			case TUESDAY:
				System.out.println("Practicar programación");
				break;
				
			case WEDNESDAY:
				System.out.println("Realizar ejercicios");
				break;
				
			case THURSDAY:
				System.out.println("Estudiar bases de datos");
				break;
			
			case FRIDAY:
				System.out.println("Desarrollar un proyecto");
				break;
				
			case SATURDAY:
				System.out.println("Repasar contenidos");
				break;
				
			case SUNDAY:
				System.out.println("Día de descanso");
				break;
				
			default:
				System.out.println("Día no válido");
				break;
			
			}
			
			try {
				
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}
			
		}
		
	}
	
}

class HiloDiaSemana extends Thread {
	
	DayOfWeek dia;
	
	public HiloDiaSemana(LocalDate dia) {
		this.dia = dia.getDayOfWeek();
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i <= 5; i++) {
			
			System.out.println("\nHiloDiaSemana: Hoy es " + dia);
			
			try {
				
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}
			
		}
		
	}
	
}