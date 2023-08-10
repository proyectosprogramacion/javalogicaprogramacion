package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/*Realiza un programa que lea y muestre desde consola un array 
 * de 3 x 3 y nos diga si todas sus filas suman lo mismo. 
 * */
public class FilasSumanIgual_40 {

	public static void main(String[] args) {
		final int FILAS = 3;
		final int COLUMNAS = 3;
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
		// Calcular la suma de la primera fila
		int sumaPrimera = 0;
		for (int col = 0; col < numeros[0].length; col++) {
			sumaPrimera += numeros[0][col];
		}
		int sumaFila = 0;
		boolean sumanIgual = true;
		for (int fila = 1; fila < numeros.length && sumanIgual; fila++) {
			sumaFila = 0;
			for (int col = 0; col < numeros[0].length && sumanIgual; col++) {
				sumaFila += numeros[fila][col];
			}
			if (sumaFila != sumaPrimera) {
				sumanIgual = false;
			}
		}
		if (sumanIgual) {
			System.out.println("Todas las filas suman lo mismo.");
		} else {
			System.out.println("Todas las filas NO suman lo mismo.");
		}

	}

}