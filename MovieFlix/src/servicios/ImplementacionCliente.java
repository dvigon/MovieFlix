package servicios;

/**
 * Implementación de los Clientes
 * @author David Vigón
 * Fecha: 20-5-2020
 */

import datos.Cliente;

public interface ImplementacionCliente {

	//Llamada a los metodos del servicio de clientes.
	public void datAlta();
	public void alta(Cliente cli);
	public void modificacion(Cliente cli);
	public void baja(int id);
	public Cliente encontrar(int id);
	public Cliente[] listaClientes();
	
}