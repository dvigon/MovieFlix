package herramientas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * La clase CargarCSV se encarga de subir los archivos CSV a la base de datos
 * @author David Vigón
 * Fecha: 20-5-2020
 */

public class CargarCSV {
	
	private Connection conexion = new Conexion().getConnection();	// Comentado hasta que funcione la conexión con la BBDD
	
	String archivo = "src\\files\\peliculas_cat.txt";
	String archivo2 = "src\\files\\peliculas_numCat.txt";
	
	private String Titulo;
	private int idGenero, anyoEstreno;
	
	public void readFileAsString() throws IOException {

		BufferedReader bufferLectura = new BufferedReader( new FileReader(archivo2) );
		String[] stringSeparado;
		String parrafo;
		
		while ( ( parrafo = bufferLectura.readLine() ) != null ) {

			stringSeparado = parrafo.split(",");						// Separador
			
			Titulo = stringSeparado[0];									// Asigna el primer String a Titulo
			anyoEstreno = Integer.parseInt( stringSeparado[1] );		// Asigna el segundo String a Año de estreno
			idGenero = Integer.parseInt( stringSeparado[2] );			// Asigna el tercer String al numero de genero

			try (Statement stmt = conexion.createStatement()) {			// Realiza la consulta a la BBDD
				
				String query = "INSERT INTO pelicula VALUES (null, '" + Titulo + "','" + anyoEstreno + "','" + idGenero + "')";
				
				if (stmt.executeUpdate(query) != 1) 
					System.out.println("Error al insertar una nueva película");  
				else 
					System.out.println( "Cargado el título: " + mostrarPelicula() );	
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());         
			}
			
		}
		
		bufferLectura.close();
		
	}

	public void mostrarTitulos() throws IOException {
		System.out.println( "Titulos: "+ Titulo );
	}
	
	public void mostrarAñosEstreno() throws IOException  {
		System.out.println( "Años de estreno: "+ anyoEstreno );
	}
	
	public void mostrarGeneros() throws IOException  {
		System.out.println( "Generos: "+ idGenero );
	}
	
	public String mostrarPelicula() {
		return "Titulos: " + Titulo + "Años de estreno: " + anyoEstreno + "Número de genero: " + idGenero;
	}

}
