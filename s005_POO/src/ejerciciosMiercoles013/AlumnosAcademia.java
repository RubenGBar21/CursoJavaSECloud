package ejerciciosMiercoles013;

public class AlumnosAcademia {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Pepe", 7);
		a1.mostrarResultado();
		
	}
	
}

class Alumno {

	private String nombre;
	private int nota;

	public Alumno() {

	}

	public Alumno(String nombre, int nota) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (nota > -1 && nota <= 10) {
			this.nota = nota;
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

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		if (nota > -1 && nota <= 10) {
			this.nota = nota;
		}
	}
	
	public void mostrarResultado() {
		System.out.println("Alumno: " + nombre);
		System.out.println("Nota: " + nota);
		System.out.println("¿Ha aprobado?\n" + ((nota >= 5) ? "Sí" : "No"));
	}
	

}
