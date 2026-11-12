package ejerciciosJueves1211;

public class s014_POO {
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Ana", 25);
		
		persona1.saludar();
		
	}

}

class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (edad >= 0) {
			this.edad = edad;
		} 
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}
	
	public void saludar() {
		System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + " años");
	}
	
}
