package datos;

/**
 * Clase Catálogo
 * @author David Vigón
 * Fecha: 19-5-2020
 */

public class Catalogo {
	
	private int IdCatalogo;
	private String Categoria;

	public Catalogo() {
		super();
	}

	public Catalogo(String categoria) {
		super();
		setCategoria(categoria);
	}

	public int getID() {
		return IdCatalogo;
	}

	public void setID(int IdCatalogo) {
		this.IdCatalogo = IdCatalogo;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

}
