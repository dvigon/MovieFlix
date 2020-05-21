package servicios;

import datos.Catalogo;
import datos.Cliente;
import datos.InterfazPelicula;
import datos.Pelicula;
import datos.PeliculaImp;

public class ServiciosPelicula implements ImplementacionPelicula{
	
	//Llamada a los metodos del paquete de datos
	private InterfazPelicula datos = new PeliculaImp();
	
	@Override
	public void ListadoCompleto() {
		datos.ListadoCompleto();
	}

	@Override
	public void ListadoPorCatalogo(Catalogo categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AltaPelicula() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AltaPelicula(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BajaPelicula() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BajaPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModificarPelicula(Cliente pelicula) {
		// TODO Auto-generated method stub
		
	}


}
