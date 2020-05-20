package servicios;

/**
 * Implementación de los Clientes
 * @author David Vigón
 * Fecha: 20-5-2020
 */

import datos.Cliente;
import datos.Catalogo;

public interface ImplementacionCliente {

	public void ListadoCompleto();								// Lista todos los clientes de la tabla clientes
	public void ListadoPorCatalogo( Catalogo categoria );		// Lista todos los clientes de una categoría dada
	public void AltaCliente();									// Crea un cliente y lo añade a la tabla clientes (Nombre Completo (String), Fecha de nacimiento(Date) y categoría contratada(int))
	public void AltaCliente( Cliente cliente );					// Añade el cliente a la tabla clientes
	public void BajaCliente();									// Da de baja un cliente eliminandolo de la tabla clientes (Nombre Completo (String))
	public void BajaCliente( Cliente cliente );					// Da de baja un cliente eliminandolo de la tabla clientes 
	public void ModificarCliente( Cliente cliente );			// Modifica un cliente de la tabla clientes (Nombre Completo (String), Fecha de nacimiento(Date) y categoría contratada(int) )
		
}