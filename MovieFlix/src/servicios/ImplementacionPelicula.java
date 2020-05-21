package servicios;

import datos.Pelicula;
import herramientas.LeerDatos;

/**
 * Implementación de las Peliculas
 * @author David Vigón
 * Fecha: 20-5-2020
 */


public interface ImplementacionPelicula {

	public void listadoCompleto();

	public void darAlta();

	public void darBaja();	

	public Pelicula encontrar(int id);
	
}
