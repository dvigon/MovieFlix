package servicios;

/**
 * Implementación de los Clientes
 * @author David Vigón
 * Fecha: 20-5-2020
 */

import datos.Cliente;

public interface ImplementacionCliente {

	//Llamada a los metodos del servicio de clientes.
	public void alta(Cliente cli);
	public void modificacion(int id);
	public void baja(int id);
	public Cliente encontrar(int id);
	public Cliente[] listaClientes();
	public void darAlta();
	public void lista();	

	
}