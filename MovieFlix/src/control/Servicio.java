package control;

/**
 * Selección de servicios 
 * @author David Vigón
 * Fecha: 20-5-2020
 */

import herramientas.LeerDatos;
import menu.Menu;
import servicios.ImplementacionServicios;

public class Servicio {

	public void start() {

		boolean seguir = true;

		do {
			Menu.MostrarMenu();
			seguir = this.seleccionOpciones();
		} while (seguir);

		System.out.println("--- Fin de la sesion ---");

	}

	public boolean seleccionOpciones() {

		boolean continuar = true;

		switch ( LeerDatos.leerByte("Introduce una opción: ") ) {
			case 1:
				// Muestra todas las películas de todos los catálogos.
				Peliculas.ListadoCompleto();
				break;
	
			case 2:
				// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de películas.
				LeerDatos.leerString("Introduce el nombre de la categoría: ");
				Peliculas.ListadoPorCatalogo();
				break;
	
			case 3:
				// Muestra las películas más vistas de cada catálogo.
				Peliculas.ListadoMasVistas();
				break;
	
			case 4:
				// Muestra las películas más valoradas de cada catálogo.
				Peliculas.ListadoMasValoradas();
				break;
	
			case 5:
				// Pide un usuario y muestra las películas que puede ver con su paquete contratado.
				LeerDatos.leerString("Introduce el nombre completo del cliente: ");
				Peliculas.ListadoContratado();
				break;
	
			case 6:
				// Muestra el listado de todos los clientes dados de alta.
				Cliente.ListadoCompleto();
				break;
	
			case 7:
				// Pide al usuario el nombre del catálogo y muestra el listado los clientes que lo tienen contratado.
				LeerDatos.leerString("Introduce el nombre de la categoría: ");
				Catalogo.ListadoClientes();
				break;
	
			case 8:
				// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de clientes.
				continuar = salir();
				break;
			case 9:
				// Muestra todos los catálogos disponibles.
				continuar = salir();
				break;
			case 10:
				// Pide al usuario el nombre completo, fecha de nacimiento y lugar de residencia del cliente y lo da de alta.
				continuar = salir();
				break;
			case 11:
				// Pide al usuario el nombre completo y lo da de baja.
				continuar = salir();
				break;
			case 12:
			// Pide al usuario el nombre completo del usuario a modificar, cuando lo encuentra, pide el nombre completo, fecha de nacimiento, lugar de residencia y el catalogo contratado.
				continuar = salir();
				break;
			case 13:
				// Pide al usuario el nombre de la película, el año de estreno y la categoría, y la da de alta.
				continuar = salir();
				break;
			case 14:
				// Pide al usuario el nombre de la película y la da de baja.
				continuar = salir();
				break;
			case 15:
				// Pide al usuario el nombre de la película a modificar, cuando lo encuentra, pide el nombre de la película, año de estreno y categoria a la que pertenece.
				continuar = salir();
				break;
			case 16:
				// Cierra la sesión
				continuar = salir();
				break;
		}

		return continuar;
	}

	private boolean salir() {
		char Opcion = LeerDatos.leerChar("¿Realmente desea salir? (S/N)");
		return ( Opcion != 'S' || Opcion != 's' );
	}

}
