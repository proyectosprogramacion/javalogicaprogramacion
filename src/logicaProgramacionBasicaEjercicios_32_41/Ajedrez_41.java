package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

public class Ajedrez_41 {

	/*
	 * Realiza un programa que lea desde consola un array de dimensiones
	 * introducidas por el usuario y el valor inicial, que deberá ser 0 ó 1 . Se
	 * creará y mostrará el array formando un dibujo en “ajedrez” con 0 y 1.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		int filas = sc.nextInt();
		System.out.print("Columnas: ");
		int cols = sc.nextInt();
		sc.close();
		int[][] numeros = new int[filas][cols];

		int num = 0;
		for (int fila = 0; fila < numeros.length; fila++) {
			for (int col = 0; col < numeros[0].length; col++) {
				numeros[fila][col] = num;
				num = num ^ 1;
			}
			if (numeros[0].length % 2 == 0) {
				num = num ^ 1;
			}
		}
		// Mostrar
		for (int fila = 0; fila < numeros.length; fila++) {
			for (int col = 0; col < numeros[0].length; col++) {
				System.out.print(numeros[fila][col] + " ");
			}
			System.out.print("\n\n");
		}
	}

}