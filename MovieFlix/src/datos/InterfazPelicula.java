package datos;

public interface InterfazPelicula {

	public void listadoCompleto();	
	public Pelicula[] listaPeliculas();
	public void darAlta();
	public void darBaja();
	public Pelicula encontrar(int id);
	void modificacion();

}

