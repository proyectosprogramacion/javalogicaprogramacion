package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/*Realiza un programa que lea un número entero
 *  y nos diga si es par o impar y si es capicúa o no. */

public class NumeroCapicua_44 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.close();
		if (num % 2 == 0) {
			System.out.println("Es par.");
		} else {
			System.out.println("Es impar");
		}

		String strNum = num + "";

		boolean esCapicua = true;
		/*
		 * for (int i = 0; i < strNum.length() / 2 && esCapicua; i++) {
		 * if(strNum.charAt(i) != strNum.charAt(strNum.length() - 1 - i)) { esCapicua =
		 * false; } }
		 */
		for (int izq = 0, der = strNum.length() - 1; izq < strNum.length() / 2 && esCapicua; izq++, der--) {
			if (strNum.charAt(izq) != strNum.charAt(der)) {
				esCapicua = false;
			}
		}
		if (esCapicua) {
			System.out.println("Es capicua");
		} else {
			System.out.println("NO es capicua");
		}

	}

}