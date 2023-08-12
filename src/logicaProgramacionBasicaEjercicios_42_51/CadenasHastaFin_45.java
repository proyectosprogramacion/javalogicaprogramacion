package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/* Realiza un programa que lea cadenas hasta que se introduzca “fin”.
 *  Nos mostrará la cadena con mayor longitud, sin contar la cadena “fin”.
 *   En caso de empate se mostrará la última introducida de las que tienen esa mayor longitud. */

public class CadenasHastaFin_45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cadenaIntroducida = false;
		String maxCadena = "";
		String cadena;
		System.out.print("Cadena: ");
		cadena = sc.nextLine();
		while (!cadena.equals("fin")) {
			if (cadena.length() >= maxCadena.length()) {
				maxCadena = cadena;
				cadenaIntroducida = true;
			}
			System.out.print("Cadena: ");
			cadena = sc.nextLine();
		}
		sc.close();
		if (cadenaIntroducida) {
			System.out.println("La cadena más larga es " + maxCadena);
		} else {
			System.out.println("No se ha introducido ninguna cadena.");
		}

	}

}