package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que cargue desde teclado una tabla bidimensional de 3x2
 * de números enteros. Posteriormente el programa mostrará la tabla introducida
 * en formato de filas y columnas y pedirá un número a buscar. En caso de
 * encontrarlo indicará el número de fila y columna donde se ha encontrado por
 * primera vez. El programa ofrecerá al usuario la opción de seguir buscando más
 * números “¿Desea seguir buscando números?(s/n)”.
 */
public class BuscarTabla2D_28 {

	public static void main(String[] args) {
		final int FILAS = 3;
		final int COLS = 2;
		int[][] numeros = new int[FILAS][COLS];
		Scanner sc = new Scanner(System.in);
		int buscar;
		String respuesta;

		for (int fila = 0; fila < numeros.length; fila++) {
			for (int col = 0; col < numeros[0].length; col++) {
				System.out.print("Número: ");
				numeros[fila][col] = Integer.parseInt(sc.nextLine());
			}
		}

		boolean encontrado;
		do {
			// Mostrar array
			for (int fila = 0; fila < numeros.length; fila++) {
				for (int col = 0; col < numeros[0].length; col++) {
					System.out.print(numeros[fila][col] + "\t");
				}
				System.out.print("\n\n");
			}
			// Pedir número a buscar
			System.out.print("Buscar: ");
			buscar = Integer.parseInt(sc.nextLine());
			// Buscar
			encontrado = false;
			for (int fila = 0; fila < numeros.length && !encontrado; fila++) {
				for (int col = 0; col < numeros[0].length && !encontrado; col++) {
					if (buscar == numeros[fila][col]) {
						encontrado = true;
						System.out.println("Encontrado [" + fila + "][" + col + "]");
					}
				}
			}
			if (!encontrado) {
				System.out.println("No encontrado.");
			}
			// Mientras no se responda s ó n seguirá pidiendo la entrada
			do {
				System.out.print("¿Desea seguir buscando números?(s/n)");
				respuesta = sc.nextLine();
			} while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

		} while (respuesta.equalsIgnoreCase("s"));
		sc.close();
	}
}
