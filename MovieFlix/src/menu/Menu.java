package menu;

import herramientas.LeerDatos;

// Menu

public class Menu {
	
	private int Opcion = LeerDatos.leerInteger("\nIntroduzca una opción: ");	
	
	public Menu() {
		super();
	}
	
	public Menu(int opcion) {
		super();
		Opcion = opcion;
	}

	public int getOpcion() {
		return Opcion;
	}

	public void setOpcion(int opcion) {
		Opcion = opcion;
	}
	
	public void MostrarMenu() {
		System.out.println("\n *** Bienvenido a MovieFlix *** \n");
		System.out.println("\n Opción 1:  \n");
		System.out.println("\n Opción 2:  \n");
		System.out.println("\n Opción 3:  \n");
		System.out.println("\n Opción 4:  \n");
		System.out.println("\n Opción 5:  \n");
		System.out.println("\n Opción 6:  \n");
		System.out.println("\n Opción 7:  \n");
		System.out.println("\n Opción 8:  \n");
	}

}
