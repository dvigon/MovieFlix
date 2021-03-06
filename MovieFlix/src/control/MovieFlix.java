package control;

import herramientas.LeerDatos;
import menu.Menu;
import servicios.ImplementacionCatalogo;
import servicios.ImplementacionCliente;
import servicios.ImplementacionPelicula;
import servicios.ServiciosCatalogo;
import servicios.ServiciosCliente;
import servicios.ServiciosPelicula;

/**
 * Selección de servicios 
 * @author David Vigón
 * Fecha: 20-5-2020
 */

class MovieFlix {
	
	ImplementacionCliente impcli = new ServiciosCliente();
	ImplementacionPelicula implementacionPelicula = new ServiciosPelicula();
	ImplementacionCatalogo impCatalogo = new ServiciosCatalogo();
	
	public void iniciar() {

		boolean continuar = true;

		do{
			Menu.MostrarMenu();
			continuar = this.seleccionOpciones();
		}while (continuar);

		System.out.println("--- Fin de la sesion ---");

	}

	private boolean salir() {
		
		String decision = LeerDatos.leerString("¿Seguro que quieres cerrar la sesión? (S/N)");
		
		return decision.toUpperCase().charAt(0) != 'S';
		
	}

	public boolean seleccionOpciones() {

		boolean continuar = true;

		switch ( LeerDatos.leerInteger("Introduce una opción >> ") ) {
			case 1:
				// Muestra todas las películas de todos los catálogos.
				implementacionPelicula.listadoCompleto();
				break;
	
			case 2:
				// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de películas.
				impCatalogo.darAltaCatalogo();
				break;
	
			case 3:
				// Muestra las películas más vistas de cada catálogo.
				int bajacat = LeerDatos.leerInteger("Dime el id del catálogo a eliminar: ");
				impCatalogo.bajaCatalogo(bajacat);
				break;
	
			case 4:
				// Muestra las películas más valoradas de cada catálogo.
				int modificacat = LeerDatos.leerInteger("Dime el id del catálogo a modificar: ");
				impCatalogo.modificacionCatalogo(modificacat);
				break;
	
			case 5:
				// Pide un usuario y muestra las películas que puede ver con su paquete contratado.

				break;
	
			case 6:
				// Muestra el listado de todos los clientes dados de alta.
				impcli.lista();
				break;
	
			case 7:
				// Pide al usuario el nombre del catálogo y muestra el listado los clientes que lo tienen contratado.
				int idcli = LeerDatos.leerInteger("Dime el id del cliente a suscribir: ");
				int idcat= LeerDatos.leerInteger("Dime el id del genero: ");
				impcli.suscripcion(idcli, idcat);
				break;
	
			case 8:
				// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de clientes.
				impcli.listaCliCatalogo();
				break;
			case 9:
				// Muestra todos los catálogos disponibles.
				impCatalogo.ListadoCompleto();
				break;
			case 10:
				// Pide al usuario el nombre completo, fecha de nacimiento y lugar de residencia del cliente y lo da de alta.
				impcli.darAlta();
				break;
			case 11:
				// Pide al usuario el nombre completo y lo da de baja.
				int baja = LeerDatos.leerInteger("Dime el id del usuario a eliminar: ");
				impcli.baja(baja);
				break;
			case 12:
				// Pide al usuario el nombre completo del usuario a modificar, cuando lo encuentra, pide el nombre completo, fecha de nacimiento, lugar de residencia y el catalogo contratado.
				int modifica =  LeerDatos.leerInteger("Dime el id del usuario a modificar: ");
				impcli.modificacion(modifica);
				break;
			case 13:
				// Pide al usuario el nombre de la película, el año de estreno y la categoría, y la da de alta.
				implementacionPelicula.darAlta();

				break;
			case 14:
				// Pide al usuario el nombre de la película y la da de baja.
				implementacionPelicula.darBaja();
				break;
			case 15:
				// Pide al usuario el nombre de la película a modificar, cuando lo encuentra, pide el nombre de la película, año de estreno y categoria a la que pertenece.
				implementacionPelicula.modificacion();
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
