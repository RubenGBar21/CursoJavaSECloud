package ejerciciosLunes0911;

import java.util.Scanner;

public class ejecutarCompra {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double res = 0;
		double dineroDescontado = 0;
		double precioCompra = 0;
		Compra comp = new Compra();
		
		System.out.println("¿Cuál es el importe de su compra?");
		precioCompra = sc.nextDouble();
		
		comp.setPrecioCompra(precioCompra);
		res = comp.comprarConDescuento();
		dineroDescontado = ((precioCompra * comp.DESCUENTO)/100);
		
		System.out.println("Precio original de su compra: " + precioCompra + "€");
		System.out.println("Importe descontado: " + dineroDescontado + "€");
		System.out.println("Precio final: " + res + "€");
		
		sc.close();

	}

}
