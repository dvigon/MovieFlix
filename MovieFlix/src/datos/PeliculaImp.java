package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import herramientas.Conexion;

/*
 * Métodos para la gestión de peliculas: Alta, Baja, Listado
 * @author David
 * Fecha 21-05-2020
 */

public class PeliculaImp implements InterfazPelicula{

	private Connection conexionBBDD = new Conexion().getConnection();

	//metodo que recoge en un array los clientes que hay
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


	public void close() {
		try {
			conexionBBDD.close();
		} catch (SQLException e) {
			System.out.println("Excepcion al cerrar la bd: " + e.getMessage());
		}
	}
}