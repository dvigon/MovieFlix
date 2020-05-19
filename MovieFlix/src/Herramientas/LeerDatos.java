package Herramientas;

import java.util.Scanner;

public class LeerDatos {
	
	@SuppressWarnings("resource")
	public static boolean leerBoolean() {
		boolean Valor = (boolean) new Scanner(System.in).nextBoolean();
        return Valor;
    }
	
	@SuppressWarnings("resource")
	public static char leerChar() {
        char Valor = (char) new Scanner(System.in).next().charAt(0);	// Sólo almacena el primer carácter
        return Valor;
    }
	
	@SuppressWarnings("resource")
	public static byte leerByte() {
        byte Valor = (byte) new Scanner(System.in).nextByte();
        return Valor;
    }

	@SuppressWarnings("resource")
	public static short leerShort() {
        short Valor = (short) new Scanner(System.in).nextShort();
        return Valor;
    }

    @SuppressWarnings("resource")
	public static int leerInteger() {
        int Valor = (int) new Scanner(System.in).nextInt();
        return Valor;
    }

	@SuppressWarnings("resource")
	public static long leerLong() {
        long Valor = (long) new Scanner(System.in).nextLong();
        return Valor;
    }

    @SuppressWarnings("resource")
	public static float leerFloat() {
    	float Valor = (float) new Scanner(System.in).nextFloat();
        return Valor;
    }

    @SuppressWarnings("resource")
	public static double leerDouble() {
        double Valor = (double) new Scanner(System.in).nextDouble();
        return Valor;
    }
    
    @SuppressWarnings("resource")
	public static String leerString() {
        String Valor = (String) new Scanner(System.in).nextLine();
        return Valor;
    }
   
    // Recibe el String mensaje para mostrarlo por consola
   
    public static boolean leerBoolean(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerBoolean();
		} catch (Exception e) {
			System.out.println("Sólo se admite True o false.");
		}
		return leerBoolean(mensaje);
    }
    
    public static char leerChar(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerChar();
		} catch (Exception e) {
			System.out.println("Algo ha ido mal...");
		}
		return leerChar(mensaje);
    }

    public static byte leerByte(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerByte();
		} catch (Exception e) {
			System.out.println("El valor debe estar dentro del rango de -127 a 128");
		}
		return leerByte(mensaje);
    }
    
    public static short leerShort(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerShort();
		} catch (Exception e) {
			System.out.println("El valor debe estar dentro del rango de -32.768 a 32.767");
		}
		return leerShort(mensaje);
    }
    
    public static int leerInteger(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerInteger();
		} catch (Exception e) {
			System.out.println("Sólo se admiten números, y el valor debe estar dentro del rango de -2.147.483.648 y 2.147.483.647");
		}
		return leerInteger(mensaje);
    }

    public static long leerLong(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerLong();
		} catch (Exception e) {
			System.out.println("Sólo se admiten números, y el valor debe estar dentro del rango de -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807");
		}
		return leerLong(mensaje);
    }

    public static float leerFloat(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerFloat();
		} catch (Exception e) {
			System.out.println("Sólo se admiten números, y el valor debe estar dentro del rango de -3.402823E38 a -1.401298E-45 y de 1.401298E-45 a 3.402823E38");
		}
        return leerFloat(mensaje);
    }

    public static double leerDouble(String mensaje) {
        try {
        	System.out.print(mensaje);
            return LeerDatos.leerDouble();
		} catch (Exception e) {
			System.out.println("Sólo se admiten números, y el valor debe estar dentro del rango de -1.79769313486232E308 a -4.94065645841247E-324 y de 4.94065645841247E-324 a 1.79769313486232E308");
		}
        return leerDouble(mensaje);
    }
    
    public static String leerString(String mensaje) {
        System.out.println(mensaje);
        return leerString();
    }
    
}