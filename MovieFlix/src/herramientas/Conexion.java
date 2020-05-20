package herramientas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Conexión a base de datos.
 * @author ruben
 * Fecha: 20-5-2020
 *
 */
public class Conexion {
	// Conexion a la bbdd
	
	Connection connection = null;
    String BD = "movieflix";
    String driverClassName = "com.mysql.jdbc.Driver";
    String driverUrl = "jdbc:mysql://10.90.36.105:3306/" + BD +"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String user = "usuario";
    String password = "usuario";

    public Conexion() {
        try {
            //Aunque ya no hace falta en Java             
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException e) {
            System.out.println("Excepcion SQL: " + e.getMessage());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Codigo del Error: " + e.getErrorCode());
            System.out.println("ERROR. No se puede conectar con la Bases de Datos: " + e);
            System.exit(-1);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException se) {
            System.out.println("Exception closing Connection: " + se);
        }
    }
}
