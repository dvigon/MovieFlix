package datos;

public interface InterfazCatalogo {
	
	//Llamada a los metodos correspondientes segun las necesidades
	
	public void altaCatalogo(Catalogo cat);
	public void modificacionCatalogo(int id);
	public void bajaCatalogo(int id);
	public Catalogo encontrarCatalogo(int id);
	public Catalogo[] listaCatalogo();
	public void darAltaCatalogo();
	public void ListadoCompleto();

}
