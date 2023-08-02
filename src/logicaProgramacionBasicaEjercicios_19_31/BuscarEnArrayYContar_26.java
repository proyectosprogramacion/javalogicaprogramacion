package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 7 números. continuación nos pedirá
 * que busquemos un número entre los introducidos, y nos dirá si ha sido
 * encontrado o no. En el caso en el que haya sido encontrado, nos indicará
 * cuántas veces se ha introducido. El programa nos preguntará si queremos
 * seguir buscando más números o no: “ “¿Desea seguir buscando números?(s/n)”.
 * 
 */
public class BuscarEnArrayYContar_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int NUM = 7;
		int[] numeros = new int[NUM];
		int buscar;
		String respuesta;
		int contEncontrados;

		// Rellenamos el array desde teclado
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = Integer.parseInt(sc.nextLine());
		}
		// Realizamos búsqueda hasta que digamos que no queremos
		do {
			System.out.println("Numero a buscar: ");
			buscar = Integer.parseInt(sc.nextLine());
			contEncontrados = 0;
			for (int i = 0; i < numeros.length; i++) {
				if (buscar == numeros[i]) {
					contEncontrados++;
				}
			}
			if (contEncontrados == 0) {
				System.out.println("No encontrado.");
			} else {
				System.out.println("Se han encontrado: " + contEncontrados + " veces.");

			}
			// Preguntamos si quiere buscar
			System.out.println("¿Quieres seguir buscando (s/n):");
			respuesta = sc.nextLine();
		} while (respuesta.equalsIgnoreCase("s"));
		sc.close();

	}

}