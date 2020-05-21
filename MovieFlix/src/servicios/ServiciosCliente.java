package servicios;

import datos.Cliente;
import datos.ClienteImp;
import datos.InterfazCliente;

public class ServiciosCliente implements ImplementacionCliente{
	
	//Llamada a los metodos del paquete de datos
	private InterfazCliente datos = new ClienteImp();
	
	@Override
	public void alta(Cliente cli) {
		datos.alta(cli);
	}
	
	@Override
	public void modificacion(Cliente cli) {
		datos.modificacion(cli);
	}
	
	@Override
	public void baja(int id) {
		datos.baja(id);
	}
	
	@Override
	public Cliente encontrar(int id) {
		return datos.encontrar(id);
	}
	
	@Override
	public Cliente[] listaClientes() {
		return datos.listaClientes();
	}
	
}
