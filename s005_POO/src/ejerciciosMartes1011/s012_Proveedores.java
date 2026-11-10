package ejerciciosMartes1011;

public class s012_Proveedores {
	
	public static void main(String[] args) {
		
		Proveedor p1 = new Proveedor("Proveedor Patatas", "Patatas", 100);
		double res = 0;
		double precioConDescuento = 0;
		
		p1.mostrarDatos();
		res = p1.calcularPrecio(5);
		precioConDescuento = p1.calcularDescuento(res);
		
		System.out.println("Precio del pedido: " + res);
		System.out.println("Precio con descuento: " + precioConDescuento);
		
	}
	
}

class Proveedor {
	
	private String nombre;
	private String producto;
	private double precio;
	private final double DESCUENTO = 10;
	
	public Proveedor() {
		
	}
	
	public Proveedor(String nombre, String producto, double precio) {
		
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (producto != null && !producto.equals("")) {
			this.producto = producto;
		}

		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		if (producto != null && !producto.equals("")) {
			this.producto = producto;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Proveedor: " + nombre);
		System.out.println("Producto: " + producto);
		System.out.println("Precio por lote: " + precio);
	}
	
	public double calcularPrecio(int cantidad) {
		return precio*cantidad;
	}
	
	public double calcularDescuento(double precio) {
		return (precio * (100-DESCUENTO))/100;
	}
	
}
