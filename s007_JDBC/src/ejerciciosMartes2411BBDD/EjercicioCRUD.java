package ejerciciosMartes2411BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EjercicioCRUD {

	static Connection miConexion;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opc;
		int idAlumno;
		String nombreAlumno;
		
		try {

			miConexion = ConexionBBDD.conectar();
			
			do {
				
				System.out.println("\n1. Crear");
				System.out.println("2. Mostrar todo");
				System.out.println("3. Modificar");
				System.out.println("4. Eliminar");
				System.out.println("0. Salir");
				
				opc = sc.nextInt();
				
				switch(opc) {
				
				case 1:
					System.out.println("\nID del alumno a crear");
					idAlumno = sc.nextInt();
					
					sc.nextLine();
					System.out.println("Nombre del alumno a crear");
					nombreAlumno = sc.nextLine();
					
					create(idAlumno, nombreAlumno);
					
					break;
				
				case 2:
					readAll();
					break;
					
				case 3:
					System.out.println("\nID del alumno a modificar");
					idAlumno = sc.nextInt();
					
					sc.nextLine();
					System.out.println("Nuevo nombre del alumno");
					nombreAlumno = sc.nextLine();
					
					update(idAlumno, nombreAlumno);
					
					break;
					
				case 4:
					System.out.println("\nID del alumno a borrar");
					idAlumno = sc.nextInt();
					
					delete(idAlumno);
					break;
					
				default:
					System.out.println("\nSaliendo del programa...");
					break;
					
				}
				
			}while(opc != 0);
			
			miConexion.close();

		} catch (SQLException e) {

			System.err.println("Error con SQL: " + e);

		}

	}

	public static void readAll() throws SQLException {
		ResultSet res;
		Statement sentencia;
		sentencia = miConexion.createStatement();
		res = sentencia.executeQuery("SELECT * FROM alumnos");
		
		System.out.println();
		while (res.next()) {

			System.out.println(res.getString("id") + ": " + res.getString("nombre"));

		}

	}
	
	public static void delete(int idBorrar) throws SQLException {
		
		PreparedStatement sentencia;
		int filas;
		
		sentencia = miConexion.prepareStatement(
		  "DELETE FROM alumnos WHERE id = ?"
		);
		
		sentencia.setInt(1, idBorrar);
		
		filas = sentencia.executeUpdate();
		
		if (filas > 0) {
			
			System.out.println("\nAlumno borrado de la BBDD");
			System.out.println("Filas afectadas: " + filas);
			
		} else {
			
			System.out.println("\nNo se encontró ningún alumno");
			
		}

	}
	
	public static void create(int idCrear, String nombreCrear) throws SQLException {
		
		PreparedStatement sentencia;
		int filas;
		
		sentencia = miConexion.prepareStatement(
		  "INSERT INTO alumnos (id, nombre) VALUES (?, ?)"
		);
		
		sentencia.setInt(1, idCrear);
		sentencia.setString(2, nombreCrear);
		
		filas = sentencia.executeUpdate();
		
		if (filas > 0) {
			
			System.out.println("\nAlumno creado correctamente");
			System.out.println("Filas afectadas: " + filas);
			
		} else {
			
			System.out.println("\nNo se pudo crear al alumno");
			
		}

	}
	
	public static void update(int idModificar, String nombreModificar) throws SQLException {
		
		PreparedStatement sentencia;
		int filas;
		
		sentencia = miConexion.prepareStatement(
		  "UPDATE alumnos SET nombre = ? WHERE id = ?"
		);
		
		sentencia.setString(1, nombreModificar);
		sentencia.setInt(2, idModificar);
		
		filas = sentencia.executeUpdate();
		
		if (filas > 0) {
			
			System.out.println("\nAlumno modificado correctamente");
			System.out.println("Filas afectadas: " + filas);
			
		} else {
			
			System.out.println("\nNo se pudo modificar al alumno");
			
		}

	}

}

class ConexionBBDD {

	public static Connection conectar() throws SQLException {

		String url = "jdbc:mysql://localhost:3307/bbdd_corenetworks";
		String usuario = "root";
		String password = "";
		Connection conexion = null;

		conexion = DriverManager.getConnection(url, usuario, password);

		return conexion;

	}

}
