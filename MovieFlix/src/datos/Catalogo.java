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
	

	public Catalogo(int idCatalogo, String categoria) {
		super();
		IdCatalogo = idCatalogo;
		Categoria = categoria;
	}

	public int getIdCatalogo() {
		return IdCatalogo;
	}

	public void setIdCatalogo(int idCatalogo) {
		IdCatalogo = idCatalogo;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Categoria == null) ? 0 : Categoria.hashCode());
		result = prime * result + IdCatalogo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalogo other = (Catalogo) obj;
		if (Categoria == null) {
			if (other.Categoria != null)
				return false;
		} else if (!Categoria.equals(other.Categoria))
			return false;
		if (IdCatalogo != other.IdCatalogo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Catalogo: IdCatalogo=" + IdCatalogo + ", Categoria=" + Categoria + "";
	}
	
	

}
