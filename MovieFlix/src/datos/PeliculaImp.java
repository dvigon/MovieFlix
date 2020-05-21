package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import herramientas.Conexion;
import herramientas.LeerDatos;

/*
 * Métodos para la gestión de peliculas: Alta, Baja, Listado
 * @author David
 * Fecha 21-05-2020
 */

public class PeliculaImp implements InterfazPelicula{

	private Connection conexionBBDD = new Conexion().getConnection();

	@Override
	public Pelicula[] listaPeliculas(){

		try (Statement stmt = conexionBBDD.createStatement()) {

			String query = "SELECT * FROM Pelicula";
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Pelicula> peliculas = new ArrayList<>();

			while (rs.next()) 
				peliculas.add(new Pelicula( rs.getInt("idPelicula"), rs.getString("titulo"), rs.getInt("anyoEstreno")) );

			return peliculas.toArray(new Pelicula[0]);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	@Override
	public void listadoCompleto() {
		Pelicula[] lista = this.listaPeliculas();
		for(Pelicula peliculas : lista) {
			System.out.println(peliculas + "\n");
		}
	}

	@Override
	public void darAlta() {		

		String titulo = LeerDatos.leerString("Introduzca el nombre de la película: ");
		int anyoEstreno = LeerDatos.leerInteger("Introduzca el año de estreno: ");
		int idGenero = LeerDatos.leerInteger("Introduzca el id de la categoria: ");

		try (Statement stmt = conexionBBDD.createStatement()) {

			String query = "INSERT INTO pelicula VALUES (null, '" + titulo + "','" + anyoEstreno + "','" + idGenero + "')";

			if (stmt.executeUpdate(query) != 1) 
				System.out.println("Error al insertar nuevo cliente");  

		} catch (SQLException e) {
			System.out.println(e.getMessage());         
		}

	}

	// Método para dar de baja a una película
	@Override
	public void darBaja() {
		
		int id = LeerDatos.leerInteger("Introduzca el ID de la pelicula: ");
		Pelicula pelicula = encontrar(id);

		if (pelicula == null) {
			System.out.println("La película con este id: " + id + "no existe");
		}
		try (Statement stmt = conexionBBDD.createStatement()) {
			String query = "DELETE FROM pelicula WHERE idPelicula = " + id;
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al eliminar al cliente");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	//metodo para buscar películas mediante su ID
	@Override
	public Pelicula encontrar(int id) {

		try (Statement stmt = conexionBBDD.createStatement()) {

			String query = "SELECT * FROM pelicula WHERE idPelicula = " + id;
			ResultSet rs = stmt.executeQuery(query);

			if (!rs.next()) 
				return null;

			return ( new Pelicula( rs.getInt("idPelicula"), rs.getString("titulo"), rs.getInt("anyoEstreno")) );

		} catch (SQLException e) {
			System.out.println(e.getMessage());  
			return null;
		}
	}

	//metodo para modificar parametros de una película
	@Override
	public void modificacion() {
		int idPelicula = LeerDatos.leerInteger("Introduzca el ID de la película a modificar: ");
		String titulo = LeerDatos.leerString("Introduzca el nuevo titulo de la película: ");
		int anyoEstreno = LeerDatos.leerInteger("Introduzca el nuevo año de estreno: ");
		int idGenero = LeerDatos.leerInteger("Introduzca el nuevo ID del género: ");

		try (Statement stmt = conexionBBDD.createStatement()) {			
			String query = "UPDATE pelicula SET titulo='" + titulo + "', anyoEstreno='" + anyoEstreno +  "', idGenero='" + idGenero + "' WHERE idPelicula=" + idPelicula;
		if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al modificar el cliente");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}	
	
	public void close() {
		try {
			conexionBBDD.close();
		} catch (SQLException e) {
			System.out.println("Excepcion al cerrar la bd: " + e.getMessage());
		}
	}


}