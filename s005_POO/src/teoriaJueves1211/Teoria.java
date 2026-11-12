package teoriaJueves1211;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Teoria {

	public static void main(String[] args) {
		
		//manejarArrays();
		//manejarSets();
		manejarPilas();
		
	}
	
	public static void manejarArrays() {
		
		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<Integer> notas = new ArrayList<>();
		
		nombres.add("Ana");
		nombres.add("Carlos");
		nombres.add("María");
		
		notas.add(10);
		notas.add(4);
		notas.add(7);
		
		System.out.println("Primer nombre: " + nombres.get(0));
		System.out.println("Segundo nombre: " + nombres.get(1));
		System.out.println("Tercer nombre: " + nombres.get(2));
		
		System.out.println("Lista de nombres: " + nombres);
		
		nombres.add("Pedro");
		nombres.remove(1);
		
		notas.add(6);
		notas.remove(1);
		
		System.out.println("Cantidad de nombres: " + nombres.size());
		
		for(int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i) + " : " + notas.get(i));
		}
		
	}
	
	public static void manejarSets() {
		
		HashSet<String> frutas = new HashSet<>();
		HashSet<Integer> cantidadFrutas = new HashSet<>();
		Iterator<Integer> it;
		
		frutas.add("Manzana");
		frutas.add("Pera");
		cantidadFrutas.add(7);
		frutas.add("Naranja");
		cantidadFrutas.add(6);
		frutas.add("Manzana");
		frutas.add("Melon");
		cantidadFrutas.add(9);
		frutas.add("Manzana");
		cantidadFrutas.add(10);
		
		System.out.println(frutas);
		
		System.out.println("Cantidad de frutas: " + frutas.size());
		System.out.println("¿Contiene Pera?" + " " + frutas.contains("Pera"));
		
		for (String fruta: frutas) {
			System.out.println("Te he commprado: " + fruta);
		}
		
		it = cantidadFrutas.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}
	
	public static void manejarPilas() {
		
		Stack<String> pila = new Stack<>();
		
		pila.push("Plato 1");
		pila.push("Plato 2");
		pila.push("Plato 3");
		pila.addFirst("Plato 4");
		
		System.out.println("Pila: " + pila);
		System.out.println("Elemento superior: " + pila.peek());
		
		for(String nombre: pila) {
			System.out.println(nombre);
			
		}
		
		System.out.println("Retiramos: " + pila.pop());
		
	}
	
	
}
