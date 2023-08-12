package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/*
 * Realiza un programa que lea una cadena y nos diga si está en mayúsculas o no. 
*/
public class TodoMayuscula_49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena: ");
		String cadena = sc.nextLine();
		sc.close();

		if (cadena.equals(cadena.toUpperCase())) {
			System.out.println("Está en mayúsculas");
		} else {
			System.out.println("No está en mayúsculas");
		}
	}

}