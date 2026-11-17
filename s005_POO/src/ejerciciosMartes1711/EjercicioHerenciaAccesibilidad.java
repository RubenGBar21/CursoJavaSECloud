package ejerciciosMartes1711;

public class EjercicioHerenciaAccesibilidad {

	public static void main(String[] args) {
		
		EmpleadoInfortmatica empleadoInformatica = new EmpleadoInfortmatica(
				"12345678A", "Juan Pérez", 2500.0, "Java"
		);
		
		EmpleadoRRHH empleadoRRHH = new EmpleadoRRHH(
				"87654321B", "María López", 2200.0, 15
		);
		
		EmpleadoMarketing empleadoMarketing = new EmpleadoMarketing(
				"56781234C", "Carlos García", 2000.0, 8
		);
		
		System.out.println(" EMPLEADO 1 ");
		empleadoInformatica.mostrarDatos();
		
		System.out.println();
		System.out.println(" EMPLEADO 2 ");
		empleadoRRHH.mostrarDatos();
		
		System.out.println();
		System.out.println(" EMPLEADO 3 ");
		empleadoMarketing.mostrarDatos();
		
	}
	
}

abstract class Empleado {
	
	private String DNI;
	protected String nombre;
	protected double salario;
	public String nombreEmpresa;
	
	public Empleado () {
		
	}
	
	public Empleado(String DNI, String nombre, double salario) {
		if (DNI != null && !DNI.isEmpty()) {
			if (DNI.matches("^[0-9]{8}[A-Z]$")) {
				this.DNI = DNI;
			} 
			
		}
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (salario > 0) {
			this.salario = salario;
		}
		nombreEmpresa = "Tech Solutions";
	}

	public String getDNI() {
		return DNI;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		}
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		if (nombreEmpresa != null && !nombreEmpresa.isEmpty()) {
			this.nombreEmpresa = nombreEmpresa;
		}
	}

	abstract public void mostrarDatos();
	
}

class EmpleadoInfortmatica extends Empleado {

	public String lenguajeProgramacion;
	
	public EmpleadoInfortmatica() {
		super();
	}
	
	public EmpleadoInfortmatica(String DNI, String nombre, double salario, String lenguajeProgramacion) {
		super(DNI, nombre, salario);
		if (lenguajeProgramacion != null && !lenguajeProgramacion.isEmpty()) {
			this.lenguajeProgramacion = lenguajeProgramacion;
		}
	}
	
	public String getLenguajeProgramacion() {
		return lenguajeProgramacion;
	}

	public void setLenguajeProgramacion(String lenguajeProgramacion) {
		if (lenguajeProgramacion != null && !lenguajeProgramacion.isEmpty()) {
			this.lenguajeProgramacion = lenguajeProgramacion;
		}
	}

	@Override
	public void mostrarDatos() {
		System.out.println(" ================================");
		System.out.println("| Empleado: " + nombre);
		System.out.println("| DNI: " + getDNI());
		System.out.println("| Departamento: Informática");
		System.out.println("| Lenguaje de programación: " + lenguajeProgramacion);
		System.out.println("| Salario: " + salario + " €");
		System.out.println("| Empresa: " + nombreEmpresa);
		System.out.println(" ================================");
		
	}
	
}

class EmpleadoRRHH extends Empleado {

	public int contrataciones;
	
	public EmpleadoRRHH() {
		super();
	}
	
	public EmpleadoRRHH(String DNI, String nombre, double salario, int contrataciones) {
		super(DNI, nombre, salario);
		if (contrataciones > 0) {
			this.contrataciones = contrataciones;
		}
	}
	
	public int getContrataciones() {
		return contrataciones;
	}

	public void setContrataciones(int contrataciones) {
		if (contrataciones > 0) {
			this.contrataciones = contrataciones;
		}
	}

	@Override
	public void mostrarDatos() {
		System.out.println(" ================================");
		System.out.println("| Empleado: " + nombre);
		System.out.println("| DNI: " + getDNI());
		System.out.println("| Departamento: Informática");
		System.out.println("| Número de Contrataciones: " + contrataciones);
		System.out.println("| Salario: " + salario + " €");
		System.out.println("| Empresa: " + nombreEmpresa);
		System.out.println(" ================================");
		
	}
	
}

class EmpleadoMarketing extends Empleado {

	public int campanias;
	
	public EmpleadoMarketing() {
		super();
	}
	
	public EmpleadoMarketing(String DNI, String nombre, double salario, int contrataciones) {
		super(DNI, nombre, salario);
		if (contrataciones > 0) {
			this.campanias = contrataciones;
		}
	}
	
	public int getCampanias() {
		return campanias;
	}

	public void setCampanias(int contrataciones) {
		if (contrataciones > 0) {
			this.campanias = contrataciones;
		}
	}

	@Override
	public void mostrarDatos() {
		System.out.println(" ================================");
		System.out.println("| Empleado: " + nombre);
		System.out.println("| DNI: " + getDNI());
		System.out.println("| Departamento: Informática");
		System.out.println("| Número de Campañas: " + campanias);
		System.out.println("| Salario: " + salario + " €");
		System.out.println("| Empresa: " + nombreEmpresa);
		System.out.println(" ================================");
		
	}
	
}
