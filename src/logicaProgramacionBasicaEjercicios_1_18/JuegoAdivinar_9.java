package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * - Programa consistente en un juego en el que el Jugador1 introduce un número
 * entre el 1 y el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10
 * intentos Por cada intento del Jugador2 se mostrará el mensaje “Te pasaste”, o
 * “No llegaste”, según corresponda. El programa terminará cuando se agoten los
 * intentos y/o el Jugador2 acierte el número. Se ha de mostrar el mensaje
 * correspondiente.
 */
public class JuegoAdivinar_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int numAdivinar;
		final int NUM_INTENTOS = 10;
		boolean adivinado = false;

		// Se repetira, mientras el número no esté entre 1 y 100 incluidos
		do {
			System.out.println("Jugador 1. Introduce un número del 1 al 100: ");
			numAdivinar = sc.nextInt();
		} while (numAdivinar < 1 || numAdivinar > 100);

		for (int intento = 0; intento < NUM_INTENTOS && !adivinado; intento++) {
			System.out.print("Jugador2. Introduce el número que crees que es: ");
			num = sc.nextInt();
			if (num == numAdivinar) {
				adivinado = true;
			} else if (num < numAdivinar) {
				System.out.println("No llegaste.");
			} else {
				System.out.println("Te pasaste.");
			}
		}
		sc.close();
		if (adivinado) {
			System.out.println("Acertaste. ");
		} else {
			System.out.println("Perdiste. El número era el: " + numAdivinar + " .");
		}
	}

}
