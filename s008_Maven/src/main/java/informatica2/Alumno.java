package informatica2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {

	@Id
	private int id_Alumno;
	private String nombre;
	private int edad;
	
	public Alumno() {
		
	}

	public Alumno(int id_Alumno, String nombre, int edad) {
		if (id_Alumno > 0) {
			this.id_Alumno = id_Alumno;
		}
		if (nombre != null & !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null & !nombre.equals("")) {
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

	public int getid_Alumno() {
		return id_Alumno;
	}
	
	@Override
	public String toString() {
		return "\nid: " + id_Alumno + 
			   "\nnombre: " + nombre +
			   "\nedad: " + edad;
	}
	
	
}
