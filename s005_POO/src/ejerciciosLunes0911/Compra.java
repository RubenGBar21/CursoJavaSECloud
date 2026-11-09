package ejerciciosLunes0911;

public class Compra {

	public double precioCompra;
	public final double DESCUENTO = 15;

	public Compra() {
		
	}
	
	public double getDESCUENTO() {
		return DESCUENTO;
	}
	
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}
	
	public double comprarConDescuento() {
		
		double res = 0;
		
		res = ((precioCompra * (100 - DESCUENTO))/100);
		
		return res;
		
	}
	
}
