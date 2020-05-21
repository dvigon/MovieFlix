package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import herramientas.Conexion;
import herramientas.LeerDatos;

public class CatalogoImp implements InterfazCatalogo{
	
	private Connection con = new Conexion().getConnection();

	@Override
	public void darAltaCatalogo() {
		String NombreCompleto = LeerDatos.leerString("Introduzca el nombre del genero: ");		
		try (Statement stmt = con.createStatement()) {
			String query = "INSERT INTO Genero VALUES (null, + '" + NombreCompleto +"')";
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al insertar nueva genero");  
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());         
		}
	}
	
	// Metodo para dar de alta un genero y añadirlo a la BD
	@Override
	public void altaCatalogo(Catalogo cat) {
		// TODO Auto-generated method stub
		try (Statement stmt = con.createStatement()) {
			String query = "INSERT INTO Genero VALUES (" + cat.getCategoria() +")";
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al insertar nuevo genero");  
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());         
		}
	}
	
	// Metodo para modificar parametros de un genero
	@Override
	public void modificacionCatalogo(int id) {
		// TODO Auto-generated method stub
		String NombreCompleto = LeerDatos.leerString("Introduzca el nuevo nombre del genero: ");
		try (Statement stmt = con.createStatement()) {
			String query = "UPDATE Genero SET tipoGenero='" + NombreCompleto + "' WHERE idGenero=" + id;
		if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al modificar el catálogo");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Metodo para dar de baja un genero y eliminarlo de la bd
	@Override
	public void bajaCatalogo(int id) {
		// TODO Auto-generated method stub
		Catalogo cat = encontrarCatalogo(id);
		if (cat == null) {
			System.out.println("El catálogo con este id: "+id+"no existe");
		}
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM Genero WHERE idGenero=" + id;
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al eliminar el Genero");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	@Override
	public Catalogo encontrarCatalogo(int id) {
		// TODO Auto-generated method stub
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM Genero WHERE idGenero=" + id;
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				return null;
			}
			return (new Catalogo(rs.getString("tipoGenero")));
		} catch (SQLException e) {
			System.out.println(e.getMessage());  
			return null;
		}
	}

	@Override
	public Catalogo[] listaCatalogos(){

		try (Statement stmt = con.createStatement()) {

			String query = "SELECT * FROM Genero";
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Catalogo> catalogos = new ArrayList<>();

			while (rs.next()) 
				catalogos.add(new Catalogo(rs.getInt("idGenero"), rs.getString("tipoGenero")));

			return catalogos.toArray(new Catalogo[0]);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	
	@Override
	public void ListadoCompleto() {
		Catalogo[] lista_catalogos = this.listaCatalogos();
		for(Catalogo catalogos : lista_catalogos) {
			System.out.println( catalogos + "\n" );
		}
	}
	
	// @Override
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Excepcion al cerrar la bd: " + e.getMessage());
		}
	}

}