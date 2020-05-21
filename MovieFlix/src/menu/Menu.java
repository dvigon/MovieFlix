package menu;

/**
 * Mostrar Menú 
 * @author David Vigón
 * Fecha: 20-5-2020
 */


public class Menu {
	
	public static void MostrarMenu() {
		System.out.println("\n");
        System.out.println("************************************************");
		System.out.println("*            Bienvenido a MovieFlix            *");
        System.out.println("************************************************");
		System.out.println("  1:  Mostrar listado de películas completo.");			// Muestra todas las películas de todos los catálogos.
		System.out.println("  2:  Dar de alta un catálogo.");						// Pide al usuario dar de alta un nuevo catalogo.
		System.out.println("  3:  Dar de baja un catágolo.");						// Pide al usuario dar de baja un catálogo existente.
		System.out.println("  4:  Modificar un catálogo.");							// Pide al usuario modificar una categoria.
		System.out.println("  5:  Mostrar listado de películas contratado.");		// Muestra las películas que puede ver el usuario con su paquete contratado.
		System.out.println("  6:  Mostrar listado de clientes completo.");			// Muestra el listado de todos los clientes dados de alta.
		System.out.println("  7:  Mostrar listado de clientes por catálogo.");		// Pide al usuario el nombre del catálogo y muestra el listado los clientes que lo tienen contratado.
		System.out.println("  8:  Mostrar listado de clientes del catálogo.");		// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de clientes.
		System.out.println("  9:  Mostrar listado de catálogos.");					// Muestra todos los catálogos disponibles.
		System.out.println("  10: Dar de alta un usuario.");						// Pide al usuario el nombre completo, fecha de nacimiento y lo da de alta.
		System.out.println("  11: Dar de baja un usuario.");						// Pide al usuario el nombre completo y lo da de baja.
		System.out.println("  12: Modificar un usuario.");							// Pide al usuario el nombre completo del usuario a modificar, cuando lo encuentra, pide el nombre completo, fecha de nacimiento, lugar de residencia y el catalogo contratado.
		System.out.println("  13: Dar de alta una película.");						// Pide al usuario el nombre de la película, el año de estreno y la categoría, y la da de alta.
		System.out.println("  14: Dar de baja una película.");						// Pide al usuario el nombre de la película y la da de baja.
		System.out.println("  15: Modificar una película.");						// Pide al usuario el nombre de la película a modificar, cuando lo encuentra, pide el nombre de la película, año de estreno y categoria a la que pertenece.
		System.out.println("  16: Cerrar sesión.");	
        System.out.println("************************************************");
	}

}
