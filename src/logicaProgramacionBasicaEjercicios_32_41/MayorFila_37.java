package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Random;

/*Realiza un programa que cargue y muestre un array de 6 x 4 con números enteros aleatorios de entre el 1 y el 10, ambos inclusive. 
Además se ha de mostrar el número de fila cuya suma de sus elementos es la mayor. 
En caso de empate se mostrará la primera fila. 
 * */
public class MayorFila_37 {

	public static void main(String[] args) {
		final int FILAS = 6;
		final int COLS = 4;
		int[][] numeros = new int[FILAS][COLS];
		Random random = new Random();
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = random.nextInt(10) + 1;
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.print("\n\n");
		}

		int sumaFila = 0;
		int sumaMaxFila = Integer.MIN_VALUE;
		int iMaxFila = 0;
		for (int fila = 0; fila < numeros.length; fila++) {
			sumaFila = 0;
			for (int col = 0; col < numeros[0].length; col++) {
				sumaFila += numeros[fila][col];
			}
			if (sumaFila > sumaMaxFila) {
				sumaMaxFila = sumaFila;
				iMaxFila = fila;
			}
		}

		System.out.println("La fila mayor es:");
		for (int col = 0; col < numeros[0].length; col++) {
			System.out.print(numeros[iMaxFila][col] + "\t");
		}
	}
}