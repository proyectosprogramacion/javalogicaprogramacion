package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/*Realiza un programa que lea 10 palabras, 
 * para posteriormente mostrarlas en orden alfabético ascendente. 
*/
public class OrdenarCadenas_43 {
	public static void main(String[] args) {
		final int NUM = 10;
		String[] cadenas = new String[NUM];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < cadenas.length; i++) {
			System.out.print("Cadena: ");
			cadenas[i] = sc.nextLine();
		}
		sc.close();

		int iMenor;
		String aux;
		for (int i = 0; i < cadenas.length - 1; i++) {
			iMenor = i;
			for (int j = i; j < cadenas.length; j++) {
				if (cadenas[j].compareToIgnoreCase(cadenas[iMenor]) < 0) {
					iMenor = j;
				}
			}
			aux = cadenas[i];
			cadenas[i] = cadenas[iMenor];
			cadenas[iMenor] = aux;
		}

		for (String cadena : cadenas) {
			System.out.println(cadena);
		}

	}

}