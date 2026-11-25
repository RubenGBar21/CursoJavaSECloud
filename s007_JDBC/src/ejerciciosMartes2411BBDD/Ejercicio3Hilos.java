package ejerciciosMartes2411BBDD;

public class Ejercicio3Hilos {

	public static void main(String[] args) {
		
		HiloAcceso ha = new HiloAcceso();
		HiloVigilancia hv = new HiloVigilancia();
		
		System.out.println("Iniciando sistema de control de acceso...");
		
		ha.start();
		hv.start();
		
		try {
			
			ha.join();
			hv.join();
			
		} catch (InterruptedException e) {
			
			System.err.println("Error: " + e);
			Thread.currentThread().interrupt();
			
		}
		
		System.out.println("\nSistema de control finalizado.");
		
		
	}
	
}

class HiloAcceso extends Thread {
	
	@Override
	public void run() {
		int i = 1;
		
		do {
			
			System.out.println("\nHiloAcceso: Intento número " + i);
			System.out.println("HiloAcceso: Codigo generado: " + Math.round(Math.random() * 11));
			i++;
			
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {

				System.err.println("Error: " + e);
				Thread.currentThread().interrupt();
				break;
				
			}
			
		} while(i <= 5);
		
		System.out.println("\nHiloAcceso: Finalizados los intentos");
		
	}
	
}

class HiloVigilancia extends Thread {
	
	@Override
	public void run() {
		int i = 1;
		
		try {
			
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			
			System.err.println("Error: " + e);
			Thread.currentThread().interrupt();
			
		}
		
		System.out.println("HiloVigilancia: Sistema de vigilancia activo");
		
		do {
			
			System.out.println("HiloVigilancia: Comprobación de seguridad " + i);
			i++;
			
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {

				System.err.println("Error: " + e);
				Thread.currentThread().interrupt();
				break;
				
			}
			
		} while(i <= 5);
		
		System.out.println("\nHiloVigilancia: Vigilancia finalizada");
		
	}
	
}
