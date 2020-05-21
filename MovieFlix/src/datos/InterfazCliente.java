package datos;

/**
 * Lamada a los metodos de cliente
 * @author Alejandro
 * Fecha 20-05-2020
 */

public interface InterfazCliente {

	//Llamada a los metodos correspondientes segun las necesidades
	public void alta(Cliente cli);
	public void modificacion(int id);
	public void baja(int id);
	public Cliente encontrar(int id);
	public Cliente[] listaClientes();
	public void darAlta();
	public void lista();	
	
	public void suscripcion(int id, int idcat);
	public Catalogo encontrarCatalogo(int id);
	public void listaCliCatalogo();
	
}
