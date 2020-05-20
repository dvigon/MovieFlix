package servicios;

/**
 * Implementación de las Peliculas
 * @author David Vigón
 * Fecha: 20-5-2020
 */

import datos.Catalogo;
import datos.Cliente;
import datos.Pelicula;

public interface ImplementacionPelicula {

	public void ListadoCompleto();									// Lista todas las películas de la tabla peliculas
	public void ListadoPorCatalogo( Catalogo categoria );			// Lista todas las peliculas de una categoría dada
	public void AltaPelicula();										// Crea un cliente y lo añade a la tabla clientes (Nombre Completo, Fecha de nacimiento y categoría)
	public void AltaPelicula( Cliente cliente );					// Añade el cliente a la tabla clientes
	public void BajaPelicula();										// Da de baja un cliente eliminandolo de la tabla clientes (Nombre Completo)
	public void BajaPelicula( Pelicula pelicula );					// Da de baja un cliente eliminandolo de la tabla clientes 
	public void ModificarPelicula( Cliente pelicula );				// Modifica un cliente de la tabla clientes (Nombre Completo, Fecha de nacimiento y categoría)
	
}
