package datos;

public class Catalogo {
	
	private String Categoria;

	public Catalogo() {
		super();
	}

	public Catalogo(String categoria) {
		super();
		setCategoria(categoria);
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

}
