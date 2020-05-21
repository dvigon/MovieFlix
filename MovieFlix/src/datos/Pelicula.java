package datos;

/**
 * Clase Película
 * @author David Vigón
 * Fecha: 19-5-2020
 */

public class Pelicula extends Catalogo{
	
	private int idPelicula;
	private String titulo;
	private int anyoEstreno;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int idPelicula, String titulo, int anyoEstreno) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.anyoEstreno = anyoEstreno;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setNombre(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyoEstreno() {
		return anyoEstreno;
	}

	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyoEstreno;
		result = prime * result + idPelicula;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Pelicula other = (Pelicula) obj;
		if (anyoEstreno != other.anyoEstreno)
			return false;
		if (idPelicula != other.idPelicula)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pelicula [IdPelicula=" + idPelicula + ", Titulo=" + titulo + ", AnyoEstreno=" + anyoEstreno + "]";
	}

}
