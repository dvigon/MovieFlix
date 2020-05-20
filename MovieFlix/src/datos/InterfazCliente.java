package datos;

/**
 * Lamada a los metodos de cliente
 * @author Alejandro
 * Fecha 20-05-2020
 */

public interface InterfazCliente {

	public void alta(Cliente cli);
	public void modificacion(Cliente cli);
	public void baja(int id);
	public Cliente encontrar(int id);
	public Cliente[] listaClientes();
}
