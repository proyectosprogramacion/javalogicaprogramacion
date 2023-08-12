package logicaProgramacionBasicaEjerciciosRepaso;

import java.util.Scanner;

/*
 * Leer números entre el 3 y el 37, ambos incluidos, hasta que se introduce
 * alguno 3 veces. Se mostrará un mensaje para los números fuera de rango.
 * Al terminar el programa mostrará "Fin del programa".
 */

public class ArrayDeContadores {
	public static void main(String[] args) {
		final int LIMITE_INFERIOR = 3;
		final int LIMITE_SUPERIOR = 37;
		Scanner sc = new Scanner(System.in);
		int[] contadores = new int[LIMITE_SUPERIOR - LIMITE_INFERIOR + 1];
		boolean salir = false;
		int num;
		while (!salir) {
			System.out.print("Número: ");
			num = sc.nextInt();
			if (num >= LIMITE_INFERIOR && num <= LIMITE_SUPERIOR) {
				contadores[num - 3]++;
				if (contadores[num - 3] == 3) {
					salir = true;
				}
			} else {
				System.out.println("Fuera de rango.");
			}
		}
		sc.close();
		System.out.println("Fin del programa.");

	}
}