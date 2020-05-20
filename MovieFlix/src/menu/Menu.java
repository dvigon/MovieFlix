package menu;

/**
 * Mostrar Menú 
 * @author David Vigón
 * Fecha: 20-5-2020
 */

import herramientas.LeerDatos;

public class Menu {
	
	public static void MostrarMenu() {
		
		System.out.println("Bienvenido a MovieFlix");
		
        System.out.println("************************************************");
		System.out.println("  Opción 1: Mostrar listado de películas completo.");			// Muestra todas las películas de todos los catálogos.
		System.out.println("  Opción 2: Mostrar listado de películas por catálogo.");		// Pide al usuario el catálogo que desea consultar y muestra el listado de películas que contiene.
		System.out.println("  Opción 3: Mostrar listado de películas más vistas.");			// Muestra las películas más vistas de cada catálogo.
		System.out.println("  Opción 4: Mostrar listado de películas más valoradas.");		// Muestra las películas más valoradas de cada catálogo.
		System.out.println("  Opción 5: Mostrar listado de películas contratado.");			// Muestra las películas que puede ver el usuario con su paquete contratado.
		System.out.println("  Opción 6: Mostrar listado de clientes completo.");			// Muestra el listado de todos los clientes dados de alta
		System.out.println("  Opción 7: Mostrar listado de clientes por catálogo.");		// 
		System.out.println("  Opción 8: Mostrar listado de clientes del catálogo.");		// 
		System.out.println("  Opción 9: Mostrar listado de catálogos.");					// 
		System.out.println("  Opción 10: Dar de alta un usuario.");							// 
		System.out.println("  Opción 11: Dar de baja un usuario.");							// 
		System.out.println("  Opción 12: Modificar un usuario.");							// 
		System.out.println("  Opción 13: Dar de alta una película.");						// 
		System.out.println("  Opción 14: Dar de baja una película.");						// 
		System.out.println("  Opción 15: Modificar una película.");							// 
		System.out.println("  Opción 16: Cerrar sesión.");
        System.out.println("************************************************");
        
        LeerDatos.leerByte("Introduce una opción >> ");
        
	}

}
