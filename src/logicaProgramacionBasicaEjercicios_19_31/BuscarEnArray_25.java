package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 9 números. A continuación nos
 * pedirá que busquemos un número entre los introducidos, y nos dirá si ha sido
 * encontrado o no. El programa nos preguntará si queremos seguir buscando más
 * números o no: “¿Desea seguir buscando números?(s/n)”.
 */
public class BuscarEnArray_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM = 9;
		int[] numeros = new int[NUM];
		int buscar;
		String respuesta;
		boolean encontrado;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número");
			numeros[i] = Integer.parseInt(sc.nextLine());

		}
		// Realizamos búsqueda mientras que nos digan que sí.
		do {
			System.out.println("Introduce el número a buscar");
			buscar = Integer.parseInt(sc.nextLine());
			encontrado = false;
			for (int i = 0; i < numeros.length && !encontrado; i++) {
				if (buscar == numeros[i]) {
					encontrado = true;
				}
			}
			if (encontrado) {
				System.out.println("Encontrado");
			} else {
				System.out.println("No encontrado");
			}
			// Le preguntamos si quiere continuar
			System.out.println("¿Quíeres seguir buscando? (s/n): ");
			respuesta = sc.nextLine();

		} while (respuesta.equalsIgnoreCase("s"));
		sc.close();

	}

}