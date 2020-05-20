package datos;

/**
 * Clase Película
 * @author David Vigón
 * Fecha: 19-5-2020
 */

public class Pelicula extends Catalogo{
	
	private int IdPelicula;
	private String Nombre;
	private String AnyoEstreno;
	
	public Pelicula() {
		super();
	}

	public Pelicula(String nombre, String anyoEstreno) {
		super();
		Nombre = nombre;
		AnyoEstreno = anyoEstreno;
	}

	public int getID() {
		return IdPelicula;
	}

	public void setID(int IdPelicula) {
		this.IdPelicula = IdPelicula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAnyoEstreno() {
		return AnyoEstreno;
	}

	public void setAnyoEstreno(String anyoEstreno) {
		AnyoEstreno = anyoEstreno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AnyoEstreno == null) ? 0 : AnyoEstreno.hashCode());
		result = prime * result + IdPelicula;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
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
		if (AnyoEstreno == null) {
			if (other.AnyoEstreno != null)
				return false;
		} else if (!AnyoEstreno.equals(other.AnyoEstreno))
			return false;
		if (IdPelicula != other.IdPelicula)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pelicula [IdPelicula=" + IdPelicula + ", Nombre=" + Nombre + ", AnyoEstreno=" + AnyoEstreno + "]";
	}

}
