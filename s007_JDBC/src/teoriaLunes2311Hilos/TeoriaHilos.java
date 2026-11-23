package teoriaLunes2311Hilos;

public class TeoriaHilos {
	
	public static void main(String[] args) {

		// ejemploHilo1();
		// ejemplo2Hilos();
		// ejemploTareas1();
		// ejemploCohete();
		//ejemploHilosJoin();
		
		Contador contador = new Contador();
		HiloContador hiloContador1 = new HiloContador(contador);
		HiloContador hiloContador2 = new HiloContador(contador);
		
		hiloContador1.start();
		hiloContador2.start();

		try {
			
			hiloContador1.join();
			hiloContador2.join();
			
		}catch(InterruptedException e) {
			
			System.err.println("Error: " + e);
			
		}
		
		System.out.println("Valor final: " + contador.getContador());
		
	}

	public static void ejemploHilosJoin() {
		Contar hilo = new Contar(0, 5);
		Contar hilo2 = new Contar(6, 10);
		
		try {
			
			hilo.start();
			hilo.join();
			hilo2.start();
			hilo2.join();
			
		} catch (InterruptedException e) {

			System.err.println("Error: " + e);

		}

		System.out.println("TODOS LOS HILOS HAN TERMINADO");

	}

	public static void ejemploCohete() {
		Cohete cohete = new Cohete();

		cohete.start();
		System.out.println("Iniciando cuenta atrás...");
	}

	public static void ejemploTareas1() {
		Tarea1 tarea = new Tarea1();
		Thread hilo = new Thread(tarea);
		Tarea2 tarea2 = new Tarea2();
		Thread hilo2 = new Thread(tarea2);

		hilo.start();
		System.out.println("Iniciando tarea 1");

		hilo2.start();
		System.out.println("Iniciando tarea 2");
	}

	public static void ejemplo2Hilos() {
		MiHilo2 hilo2 = new MiHilo2();
		MiHilo3 hilo3 = new MiHilo3();

		hilo2.start();
		System.out.println("Hilo 2 iniciado");

		hilo3.start();
		System.out.println("Hilo 3 iniciado");
	}

	public static void ejemploHilo1() {
		MiHilo1 hilo = new MiHilo1();

		hilo.start();

		System.out.println("Hilo 1 iniciado");
	}

}

class HiloContador extends Thread {
	
	private Contador contador;
	
	public HiloContador(Contador contador) {
		if(contador != null) {
			this.contador = contador;
		}
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			
			contador.incrementar();
			
		}
	}
	
}

class Contador {
	
	private int contador = 0;
	
	public Contador() {
		
	}

	public int getContador() {
		return contador;
	}
	
	public synchronized void incrementar() {
		
		System.out.println(Thread.currentThread().getName() + " valor de contador: " + this.contador);
		contador++;
		
	}
	
}

class Contar extends Thread {

	private int desde;
	private int hasta;

	public Contar() {

	}

	public Contar(int desde, int hasta) {
		if (desde > 0) {
			this.desde = desde;
		}
		if (hasta > 0) {
			this.hasta = hasta;
		}
	}

	public int getDesde() {
		return desde;
	}

	public void setDesde(int desde) {
		if (desde > 0) {
			this.desde = desde;
		}
	}

	public int getHasta() {
		return hasta;
	}

	public void setHasta(int hasta) {
		if (hasta > 0) {
			this.hasta = hasta;
		}
	}

	@Override
	public void run() {
		for (int i = desde; i <= hasta; i++) {

			System.out.println(Thread.currentThread().getName() + ": "+ i);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}

		}

	}

}

class Cohete extends Thread {

	@Override
	public void run() {
		for (int i = 5; i >= 1; i--) {

			System.out.println(i);

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}

		}

		System.out.println("¡Despegue!");

	}

}

class MiHilo1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {

			System.out.println(i);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}

		}

	}

}

class MiHilo2 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 11; i++) {

			System.out.println("Número: " + i);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}

		}

	}

}

class MiHilo3 extends Thread {

	@Override
	public void run() {

		for (char letra = 'A'; letra <= 'J'; letra++) {

			System.out.println("Letra: " + letra);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}

		}

	}

}

class Tarea1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {

			System.out.println("Número: " + i);

			try {

				Thread.sleep(500);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}

		}

	}

}

class Tarea2 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {

			System.out.println("Ejecutando Tarea secundaria");

			try {

				Thread.sleep(500);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);

			}

		}

	}

}
