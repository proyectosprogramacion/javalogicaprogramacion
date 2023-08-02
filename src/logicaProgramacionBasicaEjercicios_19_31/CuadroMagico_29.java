package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que dibuje un cuadrado mágico de orden impar introducido
 * por el usuario. Un cuadrado mágico es aquel en el que sin repetir ningún
 * número, todas las filas, columnas, y las dos diagonales suman lo mismo.
 * Ejemplo de cuadrado mágico de orden 3
 * https://cf.ltkcdn.net/es-feng-shui/images/std-xs/252393-340x340-cuadro-magico-3x3.jpg
 */
public class CuadroMagico_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado;
		do {
			System.out.print("Lado: ");
			lado = sc.nextInt();
		} while (lado % 2 == 0);

		sc.close();
		int[][] magico = new int[lado][lado];
		int fila = 0;
		int col = lado / 2;
		int num = 1;
		while (num <= lado * lado) {
			magico[fila][col] = num;
			// Detectar tipo movimiento
			if (num % lado == 0) {
				fila++;
			} else {
				// Actualizar fila
				if (fila == 0) {
					fila = lado - 1;
				} else {
					fila--;
				}

				// Actualiza la columna
				if (col == lado - 1) {
					col = 0;
				} else {
					col++;
				}
			}
			num++;
		}
		// Mostrar
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print(magico[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
	}

}
