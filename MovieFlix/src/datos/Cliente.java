package datos;

/**
 * Clase Cliente
 * @author David Vigón
 * Fecha: 19-5-2020
 */

import java.util.Date;

public class Cliente {

	private int IdCliente;
	private String NombreCompleto;
	private Date FechaRegistro;
	
	public Cliente() {
		super();
	}	
		
	public Cliente(int idCliente, String nombreCompleto, Date FechaRegistro) {
		super();
		IdCliente = idCliente;
		NombreCompleto = nombreCompleto;
		this.FechaRegistro = FechaRegistro;
	}

	public Cliente(String nombreCompleto, Date FechaRegistro) {
		super();
		NombreCompleto = nombreCompleto;
		this.FechaRegistro = FechaRegistro;
	}
	
	public int getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}

	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date FechaRegistro) {
		this.FechaRegistro = FechaRegistro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FechaRegistro == null) ? 0 : FechaRegistro.hashCode());
		result = prime * result + IdCliente;
		result = prime * result + ((NombreCompleto == null) ? 0 : NombreCompleto.hashCode());
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
		Cliente other = (Cliente) obj;
		if (FechaRegistro == null) {
			if (other.FechaRegistro != null)
				return false;
		} else if (!FechaRegistro.equals(other.FechaRegistro))
			return false;
		if (IdCliente != other.IdCliente)
			return false;
		if (NombreCompleto == null) {
			if (other.NombreCompleto != null)
				return false;
		} else if (!NombreCompleto.equals(other.NombreCompleto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return "Cliente: IdCliente = "+IdCliente+", NombreCompleto = " + NombreCompleto + ", FechaRegistro = " + FechaRegistro + "";
	
	}
	
}
