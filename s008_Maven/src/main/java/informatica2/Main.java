package informatica2;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al programa");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidad");
		EntityManager em = emf.createEntityManager();
		
        List<Alumno> alumnos = em.createQuery("SELECT a FROM Alumno a", Alumno.class).getResultList();
        
        for (Alumno a : alumnos) {

            System.out.println(a);

        }
        
        em.close();

        emf.close();
		
		
	}
	
}
