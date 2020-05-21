package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import herramientas.Conexion;
import herramientas.LeerDatos;

/*
 * Metodos relacionados a cliente, tales como alta, baja, modificacion...
 * @author Alejandro
 * Fecha 20-05-2020
 */

public class ClienteImp implements InterfazCliente{

	private Connection con = new Conexion().getConnection();

	
	@Override
	public void darAlta() {		
		String NombreCompleto = LeerDatos.leerString("Introduzca el nombre del cliente: ");
		Date fecha = new Date();			
		try (Statement stmt = con.createStatement()) {
			String query = "INSERT INTO Cliente VALUES (null, '" + NombreCompleto + "','" + new java.sql.Date(fecha.getTime()) +"')";
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al insertar nuevo cliente");  
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());         
		}
		
	}

	// Método para dar de alta a un cliente y añadirlo a la BBDD
	@Override
	public void alta(Cliente cli) {
		
		try (Statement stmt = con.createStatement()) {
			String query = "INSERT INTO Cliente VALUES (" + cli.getNombreCompleto() + ","
					+ "'" + new java.sql.Date(cli.getFechaRegistro().getTime()) +")";
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al insertar nuevo cliente");  
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());         
		}
		
	}
	
	//metodo para modificar parametros de un cliente
	@Override
	public void modificacion(int id) {
		String NombreCompleto = LeerDatos.leerString("Introduzca el nuevo nombre del cliente: ");
		Date fecha = new Date();
		try (Statement stmt = con.createStatement()) {
			String query = "UPDATE Cliente SET nombre='" + NombreCompleto + "', fechaRegistro='" + new java.sql.Date(fecha.getTime())+"' WHERE idCliente=" + id;
		if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al modificar el cliente");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}	

	//metodo para dar de baja a un cliente y eliminarlo de la bd
	@Override
	public void baja(int id) {
		Cliente cli = encontrar(id);
		if (cli == null) {
			System.out.println("El cliente con este id: "+id+"no existe");
		}
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM Cliente WHERE idCliente=" + id;
			if (stmt.executeUpdate(query) != 1) {
				System.out.println("Error al eliminar al cliente");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	//metodo para buscar clientes mediante su identificador
	@Override
	public Cliente encontrar(int id) {
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM Cliente WHERE idCliente=" + id;
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				return null;
			}
			return (new Cliente(rs.getString("nombre"), rs.getDate("fechaRegistro")));
		} catch (SQLException e) {
			System.out.println(e.getMessage());  
			return null;
		}
	}

	//metodo que recoge en un array los clientes que hay
	@Override
	public Cliente[] listaClientes(){
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM Cliente";
			ResultSet rs = stmt.executeQuery(query);
			ArrayList<Cliente> clientes = new ArrayList<>();
			while (rs.next()) {
				clientes.add(new Cliente(rs.getInt("idCliente"), rs.getString("nombre"), rs.getDate("fechaRegistro")));
			}
			return clientes.toArray(new Cliente[0]);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@Override
	public void lista() {
		Cliente[] lista = this.listaClientes();
		for(Cliente cli:lista) {
			System.out.println(cli+"\n");
		}
	}
	
	@Override
	public void suscripcion(int id, int idcat){
		Cliente cli=encontrar(id);
		Catalogo cat = encontrarCatalogo(idcat);
		if(cli==null){
			System.out.println("El cliente con este id: "+id+"no existe");
		}
		if(cat==null){
			System.out.println("El genero con este id: "+cat+"no existe");
		}
		try (Statement stmt = con.createStatement()) {
			String query = "insert into Suscripcion values(null,'"+id+"','"+ idcat +"')";
			
		if (stmt.executeUpdate(query) != 1) {
			System.out.println("Error al suscribir al cliente");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public Catalogo encontrarCatalogo(int id){
		try(Statement stmt=con.createStatement()){
			String query ="select * from Genero where idGenero ='"+id+"'";
					ResultSet rs =stmt.executeQuery(query);
		if (!rs.next()) {
			return null;
		}
			return (new Catalogo(rs.getInt("idGenero")));
		}
		catch(Exception e){
			System.out.println(e.getMessage());  
			return null;
		}
	}
	
	@Override
	public void listaCliCatalogo() {
		try (Statement stmt = con.createStatement()) {
			String query = "select c.nombre, g.tipoGenero from Cliente c, Genero g, Suscripcion s where c.idCliente=s.idCliente and s.idGenero=g.idGenero";
			ResultSet rs = stmt.executeQuery(query);
			ArrayList <String> lista = new ArrayList<>();
		while (rs.next()) {
			//lista.add(rs.getString("nombre"));
			//lista.add(rs.getString("tipoGenero"));
			System.out.println("Cliente: "+rs.getString("nombre")+", genero al que esta suscrito: "+rs.getString("tipoGenero"));
			//System.out.println(lista);
		}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	//@Override
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Excepcion al cerrar la bd: " + e.getMessage());
		}
	}

}