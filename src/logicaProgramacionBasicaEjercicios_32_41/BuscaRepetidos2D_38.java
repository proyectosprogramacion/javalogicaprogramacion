package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/*Realiza un programa que cargue y muestre un array de enteros 
 * de 4 x 4 desde consola. Finalmente el programa dirá 
 * si existe algún número repetido o no (sin especificar cuál o cuáles). 

 * */

public class BuscaRepetidos2D_38 {

	public static void main(String[] args) {
		final int FILAS = 4;
		final int COLUMNAS = 4;
		int[][] numeros = new int[FILAS][COLUMNAS];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				System.out.print("Número: ");
				numeros[i][j] = sc.nextInt();
			}
		}
		sc.close();
		// Mostrar el array
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println();
		}

		boolean repetido = false;
		for (int fila = 0; fila < numeros.length && !repetido; fila++) {
			for (int col = 0; col < numeros[0].length && !repetido; col++) {
				for (int f = 0; f < numeros.length && !repetido; f++) {
					for (int c = 0; c < numeros[0].length && !repetido; c++) {
						if (numeros[fila][col] == numeros[f][c] && (fila != f || col != c)) {
							repetido = true;
						}
					}
				}
			}
		}
		if (repetido) {
			System.out.println("Hay algún repetido.");
		} else {
			System.out.println("No hay ningún repetido.");
		}
	}

}