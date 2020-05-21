package servicios;

import datos.Pelicula;
import datos.PeliculaImp;
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

}
