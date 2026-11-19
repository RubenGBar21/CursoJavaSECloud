package ejercicios_excepciones;

public class ExcepcionPersonalizada {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		try {
			
			p.setEdad(150);
			
			System.out.println("Edad registrada: " + p.getEdad());
			
		} catch (EdadInvalidaException e) {
			
			System.err.println(e.getMessage());
			
		}
		
		System.out.println("HOLA");
		
	}
	
}

class EdadInvalidaException extends Exception {
	
	public EdadInvalidaException(String mensaje) {
		super(mensaje);
	}
	
}

class Persona {
	
	private int edad;
	
	public void setEdad(int edad) throws EdadInvalidaException {
		
		if (edad < 0 || edad > 120) {
			
			throw new EdadInvalidaException(
					"ERROR: La edad debe estar entre 0 y 120 años."
			);
			
		}
		
		this.edad = edad;
		
	}
	
	public int getEdad() {
		return edad;
	}
	
}