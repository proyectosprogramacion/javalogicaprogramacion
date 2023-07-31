package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que nos informa si un número introducido es primo o no. NOTA: Un
 * número es primo si tiene dos únicos divisores que son el 1 y él mismo.
 */

public class EsPrimo_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número:");
		int num = sc.nextInt();
		sc.close();
		boolean divisorEncontrado = false;
		for (int divisor = 2; divisorEncontrado == false && divisor <= num / 2; divisor++) {

			if (num % divisor == 0) {
				divisorEncontrado = true;
			}

		}
		if (divisorEncontrado == false) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}
}