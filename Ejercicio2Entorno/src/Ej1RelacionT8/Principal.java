package Ej1RelacionT8;

public class Principal{
	public static void main(String[] args) {
		
		String mensaje = "Dime cuatos numeros quiere insertar";
		int numeros = Teclado.pedirInt(mensaje);
		int [] array = new int[numeros];
		
		for (int i = 0; i < array.length; i++) {
			mensaje = "Dime un numero";
			array[i] = Teclado.pedirInt(mensaje);
		}
		for (int i =  array.length-1; i >-1; i--) {
			System.out.println(array[i]);
		}
	}
}