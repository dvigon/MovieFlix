package datos;

/**
 * Clase Catálogo
 * @author David Vigón
 * Fecha: 19-5-2020
 */

public class Catalogo {
	
	private int ID;
	private String Categoria;

	public Catalogo() {
		super();
	}

	public Catalogo(String categoria) {
		super();
		setCategoria(categoria);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

}
