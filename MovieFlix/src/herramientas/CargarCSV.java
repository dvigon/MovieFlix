package herramientas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * La clase CargarCSV se encarga de subir los archivos CSV a la base de datos
 * @author David Vigón
 * Fecha: 20-5-2020
 */

public class CargarCSV {
	
	ArrayList<String> Titulos = new ArrayList<String>();
	ArrayList<String> AñoEstreno = new ArrayList<String>();
	ArrayList<Integer> Genero = new ArrayList<Integer>();
	
	// private Connection conexion = new Conexion().getConnection();							Comentado hasta que funcione la conexión con la BBDD
	
	String archivo = "src\\files\\peliculas_cat.txt";
	String archivo2 = "src\\files\\peliculas_numCat.txt";
	
	private String Titulo;
	private int idGenero, anyoEstreno;
	
	private Connection con = new Conexion().getConnection();
	
	public void readFileAsString() throws IOException {

		BufferedReader bufferLectura = new BufferedReader( new FileReader(archivo) );
		String[] stringSeparado;
		String parrafo;

		while ( ( parrafo = bufferLectura.readLine() ) != null ) {

			stringSeparado = parrafo.split(",");		// Separador
			
			Titulo = stringSeparado[0];									// Asigna el primer String a Titulo
			anyoEstreno = Integer.parseInt( stringSeparado[1] );		// Asigna el segundo String a Año de estreno
			idGenero = Integer.parseInt( stringSeparado[2] );			// Asigna el tercer String al numero de genero
			
		}
		
		bufferLectura.close();
		
	}

	public void mostrarTitulos() throws IOException {
		readFileAsString();
		System.out.println( "Titulos: "+ Titulo );
	}
	
	public void mostrarAñosEstreno() throws IOException  {
		System.out.println( "Años de estreno: "+ anyoEstreno );
	}
	
	public void mostrarGeneros() throws IOException  {
		System.out.println( "Generos: "+ idGenero );
	}

	public void cargarPeliculas() {

		try (Statement stmt = con.createStatement() ) {

			String query = "INSERT INTO Pelicula ( titulo, anyoEstreno, Genero )  VALUES (" + Titulo + "," +  anyoEstreno + ", " + idGenero + ")";
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al insertar las películas");  
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());         
		}
		
	}

}
