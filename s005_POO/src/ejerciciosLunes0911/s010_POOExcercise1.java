package ejerciciosLunes0911;

public class s010_POOExcercise1 {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Rubén", 22, 10);
		
		e1.mostrarInformacion();
		System.out.println("¿El Alumno ha aprobado?\n" + (e1.haAprobado() ? "Sí" : "No"));
		
	}
	
}

class Estudiante {

	String nombre;
	int edad;
	int nota;

	public Estudiante() {

	}

	public Estudiante(String nombre, int edad, int nota) {

		if (nombre != null && !nombre.equals("")) {

			this.nombre = nombre;

		}

		if (edad > 0) {

			this.edad = edad;

		}

		if (nota > 0) {

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
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad > 0) {

			this.edad = edad;

		}
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		if (nota > 0) {

			this.nota = nota;

		}
	}
	
	public void mostrarInformacion() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Nota: " + nota);
		
	}
	
	public boolean haAprobado() {
		
		return nota >= 5;
		
	}

}
