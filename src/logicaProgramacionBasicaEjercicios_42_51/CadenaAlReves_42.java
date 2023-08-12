package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/*Realiza un programa que lea una frase y nos la muestre al revés. 
*/
public class CadenaAlReves_42 {

	public static void main(String[] args) {
		String cadena;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena: ");
		cadena = sc.nextLine();
		sc.close();
		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
	}
}
