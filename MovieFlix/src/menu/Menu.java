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
		System.out.println("  Opción 1: Mostrar listado de películas completo.");			// Muestra todas las películas de todos los catálogos.
		System.out.println("  Opción 2: Mostrar listado de películas por catálogo.");		// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de películas.
		System.out.println("  Opción 3: Mostrar listado de películas más vistas.");			// Muestra las películas más vistas de cada catálogo.
		System.out.println("  Opción 4: Mostrar listado de películas más valoradas.");		// Muestra las películas más valoradas de cada catálogo.
		System.out.println("  Opción 5: Mostrar listado de películas contratado.");			// Muestra las películas que puede ver el usuario con su paquete contratado.
		System.out.println("  Opción 6: Mostrar listado de clientes completo.");			// Muestra el listado de todos los clientes dados de alta.
		System.out.println("  Opción 7: Mostrar listado de clientes por catálogo.");		// Pide al usuario el nombre del catálogo y muestra el listado los clientes que lo tienen contratado.
		System.out.println("  Opción 8: Mostrar listado de clientes del catálogo.");		// Pide al usuario el nombre del catálogo que desea consultar y muestra su listado de clientes.
		System.out.println("  Opción 9: Mostrar listado de catálogos.");					// Muestra todos los catálogos disponibles.
		System.out.println("  Opción 10: Dar de alta un usuario.");							// Pide al usuario el nombre completo, fecha de nacimiento y lo da de alta.
		System.out.println("  Opción 11: Dar de baja un usuario.");							// Pide al usuario el nombre completo y lo da de baja.
		System.out.println("  Opción 12: Modificar un usuario.");							// Pide al usuario el nombre completo del usuario a modificar, cuando lo encuentra, pide el nombre completo, fecha de nacimiento, lugar de residencia y el catalogo contratado.
		System.out.println("  Opción 13: Dar de alta una película.");						// Pide al usuario el nombre de la película, el año de estreno y la categoría, y la da de alta.
		System.out.println("  Opción 14: Dar de baja una película.");						// Pide al usuario el nombre de la película y la da de baja.
		System.out.println("  Opción 15: Modificar una película.");							// Pide al usuario el nombre de la película a modificar, cuando lo encuentra, pide el nombre de la película, año de estreno y categoria a la que pertenece.
		System.out.println("  Opción 16: Cerrar sesión.");	
        System.out.println("************************************************");
        
	}

}
