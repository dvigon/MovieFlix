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
	private String CiudadResidencia;
	private Date FechaNacimiento;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombreCompleto, String ciudadResidencia, Date fechaNacimiento) {
		super();
		NombreCompleto = nombreCompleto;
		CiudadResidencia = ciudadResidencia;
		FechaNacimiento = fechaNacimiento;
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

	public String getCiudadResidencia() {
		return CiudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		CiudadResidencia = ciudadResidencia;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CiudadResidencia == null) ? 0 : CiudadResidencia.hashCode());
		result = prime * result + ((FechaNacimiento == null) ? 0 : FechaNacimiento.hashCode());
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
		if (CiudadResidencia == null) {
			if (other.CiudadResidencia != null)
				return false;
		} else if (!CiudadResidencia.equals(other.CiudadResidencia))
			return false;
		if (FechaNacimiento == null) {
			if (other.FechaNacimiento != null)
				return false;
		} else if (!FechaNacimiento.equals(other.FechaNacimiento))
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
		return "Cliente [IdCliente=" + IdCliente + ", NombreCompleto=" + NombreCompleto + ", CiudadResidencia="
				+ CiudadResidencia + ", FechaNacimiento=" + FechaNacimiento + "]";
	}
	
}
