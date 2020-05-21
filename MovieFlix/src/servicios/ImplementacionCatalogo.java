package servicios;

import datos.Catalogo;

public interface ImplementacionCatalogo {

	public void altaCatalogo(Catalogo cat);
	public void modificacionCatalogo(int id);
	public void bajaCatalogo(int id);
	public Catalogo encontrarCatalogo(int id);
	public void darAltaCatalogo();
	public void ListadoCompleto();		// Lista todos los catálogos que hay en la base de datos
	
}