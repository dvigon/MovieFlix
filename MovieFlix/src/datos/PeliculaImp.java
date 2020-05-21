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
	
	@Override
	public Pelicula[] ListadoCompleto(){
		
		try (Statement declaracion = conexionBBDD.createStatement()) {
			
			String query = "SELECT * FROM Pelicula";
			ResultSet resultado = declaracion.executeQuery(query);
			ArrayList<Pelicula> Peliculas = new ArrayList<>();
			
			while ( resultado.next() ) {
				Peliculas.add( new Pelicula( resultado.getInt("idPelicula"), resultado.getString("titulo"), resultado.getInt("anyoEstreno") ) );
			}
			
			return Peliculas.toArray(new Pelicula[0]);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
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