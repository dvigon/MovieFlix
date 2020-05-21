package servicios;

import datos.Pelicula;
import datos.PeliculaImp;
import datos.Cliente;
import datos.InterfazPelicula;

public class ServiciosPelicula implements ImplementacionPelicula{
	
	//Llamada a los metodos del paquete de datos
	private InterfazPelicula datos = new PeliculaImp();
	
	@Override
	public void listadoCompleto() {
		datos.listadoCompleto();
	}

	@Override
	public void darAlta() {
		datos.darAlta();
	}

	@Override
	public void darBaja() {
		datos.darBaja();
	}


	@Override
	public Pelicula encontrar(int id) {
		return datos.encontrar(id);
	}
	
	@Override
	public void modificacion() {
		datos.modificacion();
	}
}
