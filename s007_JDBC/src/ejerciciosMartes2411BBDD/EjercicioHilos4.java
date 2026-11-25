package ejerciciosMartes2411BBDD;

public class EjercicioHilos4 {

	public static void main(String[] args) {

		int[] listaNotas = new int[10];
		HiloNotas hn = new HiloNotas(listaNotas);
		HiloAnalisis ha = new HiloAnalisis(listaNotas);
		
		System.out.println("Iniciando sistema de análisis de notas...");

		try {

			hn.start();
			hn.join();
			ha.start();
			ha.join();

		} catch (InterruptedException e) {

			System.err.println("Error: " + e);
			Thread.currentThread().interrupt();

		}

		System.out.println("\nSistema finalizado");

	}

}

class HiloNotas extends Thread {

	int[] listaNotas;

	public HiloNotas() {

	}

	public HiloNotas(int[] listaNotas) {

		this.listaNotas = listaNotas;

	}

	@Override
	public void run() {

		System.out.println("\nHiloNotas: Introduciendo notas...\n");

		for (int i = 0; i < listaNotas.length; i++) {

			listaNotas[i] = (int) Math.round(Math.random() * 10);

			System.out.println("Alumno " + (i + 1) + " : " + listaNotas[i]);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				System.err.println("Error: " + e);
				Thread.currentThread().interrupt();
				break;
			}

		}

	}

}

class HiloAnalisis extends Thread {

	int[] listaNotas;

	public HiloAnalisis() {

	}

	public HiloAnalisis(int[] listaNotas) {

		this.listaNotas = listaNotas;

	}

	@Override
	public void run() {

		int sumaNotas = 0;
		int notaAlta = -1;
		int notaBaja = 11;

		System.out.println("\nHiloAnalisis: Analizando notas...\n");

		for (int i = 0; i < listaNotas.length; i++) {

			sumaNotas += listaNotas[i];

			if (listaNotas[i] > notaAlta)
				notaAlta = listaNotas[i];
			if (listaNotas[i] < notaBaja)
				notaBaja = listaNotas[i];

		}

		System.out.println("========== RESULTADOS ==========");
		System.out.println("Suma total: " + sumaNotas);
		System.out.println("Media: " + ((double) sumaNotas / listaNotas.length));
		System.out.println("Nota más alta: " + notaAlta);
		System.out.println("Nota más baja: " + notaBaja);
		System.out.println("================================");
		
	}

}