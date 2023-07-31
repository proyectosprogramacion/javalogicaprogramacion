package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que lee 8 números. Al finalizar mostrará el máximo introducido, y
 * cuántas veces se repite dicho máximo.
 */
public class ContadorMaximo_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int CANTIDAD = 8;
		int maximo = Integer.MIN_VALUE;
		int num;
		int contMaximo = 0;
		for (int i = 0; i < CANTIDAD; i++) {
			System.out.print("Numero: ");
			num = sc.nextInt();
			// Si se introduce otra vez el vigente máximo
			if (num == maximo) {
				contMaximo++;
			}
			// Si hay un nuevo máximo, se actualiza y el contador empieza desde 1
			if (num > maximo) {
				maximo = num;
				contMaximo = 1;
			}
		}
		sc.close();
		System.out.println("El máximo es: " + maximo + " y se repite: " + contMaximo + " veces.");
	}
}