package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que pide el número de calificaciones decimales a introducir, y una
 * nota de corte. A continuación se introducirán las calificaciones, para
 * finalmente indicar cuántas calificaciones han igualado o superado la nota de
 * corte.
 */

public class EstadisticaCalificaciones_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota;
		double notaCorte;
		int numeroNotas;
		int contSuperanCorte = 0;

		System.out.println("Introduce el número de calificaciones: ");
		numeroNotas = sc.nextInt();
		System.out.println("Introduce la Nota de corte: ");
		notaCorte = sc.nextInt();

		for (int i = 0; i < numeroNotas; i++) {
			System.out.print("Introduce una calificación: ");
			nota = sc.nextDouble();
			if (nota >= notaCorte) {
				contSuperanCorte++;
			}
		}
		sc.close();
		System.out.println("Superan la nota de corte: " + contSuperanCorte + " notas.");

	}

}