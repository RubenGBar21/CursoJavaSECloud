package ejerciciosViernes2011MasLambdas;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosVarios {

	public static void main(String[] args) {
		
		ejemploPedidos();
		
	}

	public static void ejemploPedidos() {
		List<Pedido> pedidos = new ArrayList<Pedido>();
		long cantidad = 0;
		
		pedidos.add(new Pedido("001", 120, "Pepe"));
		pedidos.add(new Pedido("002", 50, "Manuel"));
		pedidos.add(new Pedido("003", 200, "Sara"));
		pedidos.add(new Pedido("004", 99, "Luisa"));
		pedidos.add(new Pedido("005", 100, "Juan"));
		
		System.out.println("Todos los pedidos: ");
		for(Pedido p: pedidos) {
			System.out.println("Pedido: " + p.getCodigoPedido() + " " + p.getCliente() + " " + p.getImporte() + "€ ");
		}
		
		System.out.println("\nPedidos mayor a 100€: ");
		for(Pedido p: pedidos) {
			if(p.getImporte() >= 100) {
				System.out.println("Pedido: " + p.getCodigoPedido() + " " + p.getCliente() + " " + p.getImporte() + "€ ");
				p.setImporte((p.getImporte() * 0.85));
				//cantidad++;
			}
		}
		
		System.out.println("\nTodos los pedidos con su precio final: ");
		for(Pedido p: pedidos) {
			System.out.println("Pedido: " + p.getCodigoPedido() + " " + p.getCliente() + " " + p.getImporte() + "€ ");
		}
		
		cantidad = pedidos.stream()
				.filter(p -> p.getImporte() >= 100)
				.count();
		
		System.out.println("\nNº de pedidos de más de 100€: " + cantidad);
	}

}

class Pedido {

	String codigoPedido;
	double importe;
	String cliente;

	public Pedido() {

	}

	public Pedido(String codigoPedido, double importe, String cliente) {
		if (codigoPedido != null && !codigoPedido.equals("")) {
			this.codigoPedido = codigoPedido;
		}
		if (importe > 0) {
			this.importe = importe;
		}
		if (cliente != null && !cliente.equals("")) {
			this.cliente = cliente;
		}

	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		if (importe > 0) {
			this.importe = importe;
		}
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		if (cliente != null && !cliente.equals("")) {
			this.cliente = cliente;
		}
	}

	public String getCodigoPedido() {
		return codigoPedido;
	}

}
