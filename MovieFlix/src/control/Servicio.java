package control;

/**
 * Selección de servicios 
 * @author David Vigón
 * Fecha: 20-5-2020
 */

import herramientas.LeerDatos;
import menu.Menu;

class Servicio {

	public void start() {

		boolean seguir = true;

		do {
			Menu.MostrarMenu();
			seguir = this.seleccionOpciones();
		} while (seguir);

		System.out.println("--- Fin de la sesion ---");

	}

	private boolean salir() {
		String sino = LeerDatos.leerString("¿Seguro que quieres cerrar la sesión? (S/N)");
		return (sino.toUpperCase().charAt(0) != 'S');
	}

	public boolean seleccionOpciones() {

		boolean continuar = true;

		switch ( LeerDatos.leerInteger("Introduce una opción >> ") ) {
			case 1:
				// Muestra todas las películas de todos los catálogos.
				//ImplementacionPelicula.ListadoCompleto();
				break;
	
			case 2:
				// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de películas.
				LeerDatos.leerString("\nIntroduce el nombre de la categoría: ");
				//ImplementacionPelicula.ListadoPorCatalogo();
				break;
	
			case 3:
				// Muestra las películas más vistas de cada catálogo.
				//ImplementacionPelicula.ListadoMasVistas();
				break;
	
			case 4:
				// Muestra las películas más valoradas de cada catálogo.
				//ImplementacionPelicula.ListadoMasValoradas();
				break;
	
			case 5:
				// Pide un usuario y muestra las películas que puede ver con su paquete contratado.
				LeerDatos.leerString("\nIntroduce el nombre completo del cliente: ");
				//ImplementacionPelicula.ListadoContratado();
				break;
	
			case 6:
				// Muestra el listado de todos los clientes dados de alta.
				//ImplementacionCliente.ListadoCompleto();
				break;
	
			case 7:
				// Pide al usuario el nombre del catálogo y muestra el listado los clientes que lo tienen contratado.
				LeerDatos.leerString("\nIntroduce el nombre de la categoría: ");
				//Catalogo.ListadoClientes();
				break;
	
			case 8:
				// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de clientes.

				break;
			case 9:
				// Muestra todos los catálogos disponibles.

				break;
			case 10:
				// Pide al usuario el nombre completo, fecha de nacimiento y lugar de residencia del cliente y lo da de alta.

				break;
			case 11:
				// Pide al usuario el nombre completo y lo da de baja.

				break;
			case 12:
			// Pide al usuario el nombre completo del usuario a modificar, cuando lo encuentra, pide el nombre completo, fecha de nacimiento, lugar de residencia y el catalogo contratado.

				break;
			case 13:
				// Pide al usuario el nombre de la película, el año de estreno y la categoría, y la da de alta.
				//ImplementacionPelicula.AltaPelicula();	
				break;
			case 14:
				// Pide al usuario el nombre de la película y la da de baja.
				LeerDatos.leerString("\nIntroduce el nombre de la película que desea dar de baja: ");
				
				break;
			case 15:
				// Pide al usuario el nombre de la película a modificar, cuando lo encuentra, pide el nombre de la película, año de estreno y categoria a la que pertenece.
				LeerDatos.leerString("\nIntroduce el nombre de la película que desea modificar: ");
				break;
			case 16:
				// Cierra la sesión y finaliza el programa
				continuar = salir();
				break;
			default: 
				System.out.println("Opción no válida.");
		}

		return continuar;
	}

}
