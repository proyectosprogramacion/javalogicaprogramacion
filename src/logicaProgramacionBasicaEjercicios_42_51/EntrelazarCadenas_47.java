package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/*Realiza un programa que lea dos cadenas de caracteres. Se mostrarán entrelazadas, empezando por la primera. 
Ejemplo: 
Cadena 1: abcdefg
 Cadena 2: 1234 
Resultado: a1b2c3d4efg 
*/

public class EntrelazarCadenas_47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena 1: ");
		String cadena1 = sc.nextLine();
		System.out.print("Cadena 2: ");
		String cadena2 = sc.nextLine();
		sc.close();
		int i = 0;
		while (i < cadena1.length() && i < cadena2.length()) {
			System.out.print(cadena1.charAt(i));
			System.out.print(cadena2.charAt(i));
			i++;
		}

		while (i < cadena1.length()) {
			System.out.print(cadena1.charAt(i));
			i++;
		}

		while (i < cadena2.length()) {
			System.out.print(cadena2.charAt(i));
			i++;
		}

	}
}