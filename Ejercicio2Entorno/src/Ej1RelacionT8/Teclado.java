package Ej1RelacionT8;

import java.util.*;

public class Teclado {

	private static Scanner teclado;
	static {
		teclado = new Scanner(System.in);
	}
	
	public static int pedirInt(String mensaje) {
		int numero = 0;
		boolean seguir;
		do{
			seguir = true;
			System.out.println(mensaje);
			try {
				numero = teclado.nextInt();	
			} catch (InputMismatchException e) {
				seguir = false;
				System.out.println("Fallo la inserccion");
			}
			finally{
				teclado.nextLine();
			}
		} while (!seguir||numero<1);

		return numero;
	}

	public static String pedirCadena(String mensaje) {
		String cadena = "";
		System.out.println(mensaje);
		cadena = teclado.nextLine();
		return cadena;
	}

	public static float pedirFloat(String mensaje) {
		float numero = 0;
		boolean seguir;
		do{
			seguir = true;
			System.out.println(mensaje);
			try {
				numero = teclado.nextFloat();	
			} catch (InputMismatchException e) {
				seguir = false;
				System.out.println("Fallo la inserccion");
			}
			finally{
				teclado.nextLine();
			}
		} while (!seguir||numero<1);

		return numero;
	}
	
	public static boolean pedirBoolean(String mensaje) {
		String cadena = "";
		boolean opcion = false;
		System.out.println(mensaje);
		cadena = teclado.nextLine();
		if(cadena=="s")
			opcion = true;
		return opcion;
	}

}
