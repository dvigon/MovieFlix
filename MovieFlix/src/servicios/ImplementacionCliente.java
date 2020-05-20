package servicios;

import datos.Cliente;

public interface ImplementacionCliente {

	public void alta(Cliente cli);
	public void modificacion(Cliente cli);
	public void baja(int id);
	public Cliente encontrar(int id);
	public Cliente[] listaClientes();
}
