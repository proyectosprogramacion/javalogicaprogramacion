package logicaProgramacionBasicaEjerciciosRepaso;

/*
 * Dado un array bidimensional de orden impar, 
 * rellenar con 1s sus diagonales.
 */
public class RellenarArrayBidimensionalCon1 {
	public static void main(String[] args) {
		final int NUM_IMPAR = 7;
		int[][] numeros = new int[NUM_IMPAR][NUM_IMPAR];

		for (int fila = 0; fila < numeros.length; fila++) {
			numeros[fila][fila] = 1;
			numeros[fila][numeros.length - 1 - fila] = 1;
		}

		// Mostrar
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}
}