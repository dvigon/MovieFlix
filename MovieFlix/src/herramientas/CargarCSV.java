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
	ArrayList<String> Genero = new ArrayList<String>();
	
	// private Connection conexion = new Conexion().getConnection();
	
	String archivo = "src\\files\\peliculas_cat.txt";
	String archivo2 = "src\\files\\peliculas_numCat.txt";
	
	public void readFileAsString() throws IOException {

		BufferedReader bufferLectura = new BufferedReader( new FileReader(archivo) );
		String[] stringSeparado;
		String parrafo;

		while ( ( parrafo = bufferLectura.readLine() ) != null ) {

			stringSeparado = parrafo.split(",");		// Separador
			
			Titulos.add( stringSeparado[0] );			// Asigna el primer String a Titulos de películas
			AñoEstreno.add( stringSeparado[1] );		// Asigna el segundo String a Año de estreno de la películas
			Genero.add( stringSeparado[2] );			// Asigna el tercer String al Genero de la película
			
		}
		
		bufferLectura.close();
		
	}

	public void mostrarTitulos() throws IOException {
		readFileAsString();
		System.out.println( "Titulos: "+ Titulos );
	}
	
	public void mostrarAñosEstreno() throws IOException  {
		System.out.println( "Años de estreno: "+ AñoEstreno );
	}
	
	public void mostrarGeneros() throws IOException  {
		System.out.println( "Generos: "+ Genero );
	}

	public void cargarPeliculas() {

		try (Statement stmt = conexion.createStatement() ) {

			String query = "INSERT INTO Peliculas ( Nombre, AnyoEstreno, Genero )  VALUES (" + Titulos + "," +  AñoEstreno + ", " + Genero + ")";
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al insertar las películas");  
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());         
		}
		
	}

}
