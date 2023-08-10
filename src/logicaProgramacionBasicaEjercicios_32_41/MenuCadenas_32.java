package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/* Realiza un programa que gestione una tabla de hasta 8 cadenas. No se permitirán cadenas repetidas, y el orden de entrada es irrelevante.
Menú: 1.- Introducir cadena. 
2.- Listar cadenas. 
3.- Eliminar cadena. 
4.- Eliminar todas las cadenas. 
5.- Salir. 
*/

public class MenuCadenas_32 {
	public static void main(String[] args) {
		final int NUM = 10;
		String[] cadenas = new String[NUM];
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		String aux;
		boolean encontrado;
		while (!opcion.equals("5")) {
			// Mostrar menú
			System.out.println("Menú:\n" + "1.­ Introducir cadena.\n" + "2.­ Listar cadenas.\n"
					+ "3.­ Eliminar cadena.\n" + "4.­ Eliminar todas las cadenas.\n" + "5.­ Salir.");
			opcion = sc.nextLine();
			switch (opcion) {
			case "1": // Introducir número
				// Si el array está lleno
				if (cont == cadenas.length) {
					System.out.println("Array lleno.");
				} else // El array no está lleno
				{
					System.out.print("Cadena: ");
					aux = sc.nextLine();
					encontrado = false;
					for (int i = 0; i < cont && !encontrado; i++) {
						if (aux.equals(cadenas[i])) {
							encontrado = true;
						}
					}
					if (!encontrado) {
						cadenas[cont] = aux;
						cont++;
					} else {
						System.out.println("Repetida.");
					}
				}
				break;
			case "2": // Listar
				for (int i = 0; i < cont; i++) {
					System.out.println(cadenas[i] + " ");
				}
				break;
			case "3": // Eliminar cadena
				if (cont == 0) {
					System.out.println("Array vacio.");
				} else {
					System.out.print("Cadena a eliminar: ");
					aux = sc.nextLine();
					encontrado = false;
					int iEliminar = 0;
					for (int i = 0; i < cont && !encontrado; i++) {
						if (aux.equals(cadenas[i])) {
							encontrado = true;
							// Guardar la posición del elemento a eliminar
							iEliminar = i;
						}
					}
					// si se encuentra hay que eliminarlo.
					if (encontrado) {
						// Eliminar la posición iEliminar
						// desplazando los elementos
						for (int i = iEliminar; i < cont - 1; i++) {
							cadenas[i] = cadenas[i + 1];
						}
						// Ajustar el contador
						cont--;
					} else {
						System.out.println("No encontrada.");
					}
				}
				break;
			case "4": // Eliminar todas
				cont = 0;
				break;
			case "5": // Salir
				// No hacer nada. Saldrá del while.
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		}
		sc.close();
	}
}