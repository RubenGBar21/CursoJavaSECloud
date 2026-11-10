package ejerciciosMartes1011;

public class s011_HorasExtras {
	
	public static void main(String[] args) {
		
		double res1 = 0;
		double res2 = 0;
		
		Empleado em1 = new Empleado("Rubén", 20, 10);
		Empleado em2 = new Empleado("Pepe", 15, 5);
		
		em1.mostrarDatos();
		res1 = em1.calcularSueldo();
		System.out.println("Sueldo: " + res1 + "\n");
		
		em2.mostrarDatos();
		res2 = em2.calcularSueldo();
		System.out.println("Sueldo: " + res2 + "\n");
		
	}

}

class Empleado {

	private String nombre;
	private int horas;
	private double precio;

	public Empleado() {

	}

	public Empleado(String nombre, int horas, double precio) {

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (horas > 0) {
			this.horas = horas;
		}

		if (precio > 0) {
			this.precio = precio;
		}

	}

	public String getEmpleado() {
		return nombre;
	}

	public void setEmpleado(String empleado) {
		if (empleado != null && !empleado.equals("")) {
			this.nombre = empleado;
		}
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas > 0) {
			this.horas = horas;
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
		System.out.println("Empleado: " + nombre);
		System.out.println("Horas Extras Trabajadas: " + horas);
		System.out.println("Precio por horas: " + precio);
	}
	
	public double calcularSueldo() {
		return ((horas >= 20) ? (horas*precio)+10  : horas*precio);
	}
	

}