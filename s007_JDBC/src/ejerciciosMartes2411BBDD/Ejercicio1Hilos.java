package ejerciciosMartes2411BBDD;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Ejercicio1Hilos {

	public static void main(String[] args) {

		BlockingQueue<Integer> temperaturas = new LinkedBlockingQueue<>();
		//Temperatura temp = new Temperatura();
		HiloTemperatura ht = new HiloTemperatura(temperaturas);
		HiloAlertas ha = new HiloAlertas(temperaturas);
		
		System.out.println("Iniciando sistema de control");
		
		ht.start();
		ha.start();

		try {
			
			ht.join();
			ha.join();
			
		}catch(InterruptedException e) {
			
			System.err.println("Error: " + e);
			Thread.currentThread().interrupt();
			
		}
		
		System.out.println("\nSistema de control terminado");

	}

}

class HiloTemperatura extends Thread {

	//private Temperatura temperatura;
	private BlockingQueue<Integer> cola;

//	public HiloTemperatura(Temperatura temperatura) {
//		if (temperatura != null) {
//			this.temperatura = temperatura;
//		}
//	}
	
	public HiloTemperatura(BlockingQueue<Integer> cola) {
		if (cola != null) {
			this.cola = cola;
		}
	}

	@Override
	public void run() {
		
		int temp;
		Random r = new Random();
		
		for (int i = 0; i <= 5; i++) {

			try {
				
				temp = r.nextInt(0, 101);
				System.out.println("\nHilo Temperatura Temperatura Actual: " + temp + "ºC");
				cola.put(temp);
				//temperatura.setTemperatura(temp);
				
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);
				Thread.currentThread().interrupt();
				break;
			}

		}
	}

}

class HiloAlertas extends Thread {

	//private Temperatura temperatura;
	private BlockingQueue<Integer> cola;
	
//	public HiloAlertas(Temperatura temperatura) {
//		if (temperatura != null) {
//			this.temperatura = temperatura;
//		}
//	}
	
	public HiloAlertas(BlockingQueue<Integer> cola) {
		if (cola != null) {
			this.cola = cola;
		}
	}

	@Override
	public void run() {
		int t;
		
		for (int i = 0; i <= 5; i++) {
			
//			try {
//				
//				Thread.sleep(100);
//
//			} catch (InterruptedException e) {
//
//				System.err.println("Error: " + e);
//
//			}
			
			try {
				
				t = cola.take();
				//t = temperatura.getTemperatura();
				
				if (t  < 30) {

					System.out.println("Hilo Alertas: Temperatura Baja");

				} else if (t  >= 30 && t  < 70) {

					System.out.println("Hilo Alertas: Temperatura normal");

				} else if (t  >= 70) {

					System.err.println("Hilo Alertas: ¡Alerta! Temperatura Elevada");

				}
				
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);
				Thread.currentThread().interrupt();
				break;

			}

		}
	}

}

class Temperatura {

	private int temperatura = 0;

	public synchronized void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public synchronized int getTemperatura()  {
		return temperatura;
	}

}