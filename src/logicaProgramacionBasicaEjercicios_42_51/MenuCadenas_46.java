package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/*
 * Realiza un programa con un menú de opciones que ofrezca las siguientes posibilidades: 
Menú: 
1.-Introducir nombre. 
2.-Listar nombres. 
3.-Buscar nombre. (Se mostrarán todos los nombres que contengan la cadena de búsqueda) 
4.-Eliminar nombre. 
5.-Eliminar todos los nombres. 
6.-Salir. 
NOTA: Se podrán almacenar hasta un máximo de 10 nombres. 
No se permitirán nombres repetidos.
Los nombres no son sensibles a mayúsculas. 

*/

public class MenuCadenas_46 {

	public static void main(String[] args) {
		final int NUM = 10;
		String[] nombres = new String[NUM];
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		String aux;
		String buscar;
		boolean encontrado;
		while (!opcion.equals("6")) {
			// Mostrar menú
			System.out.println("Menú:\n" + "1.­ Introducir nombre.\n" + "2.­ Listar nombre.\n" + "3. Buscar nombre.\n"
					+ "4.­ Eliminar nombre.\n" + "5.­ Eliminar todos los nombres.\n" + "6.­ Salir.");
			opcion = sc.nextLine();
			switch (opcion) {
			case "1": // Introducir número
				// Si el array está lleno
				if (cont == nombres.length) {
					System.out.println("Array lleno.");
				} else // El array no está lleno
				{
					System.out.print("Nombre: ");
					aux = sc.nextLine();
					encontrado = false;
					for (int i = 0; i < cont && !encontrado; i++) {
						if (aux.equalsIgnoreCase(nombres[i])) {
							encontrado = true;
						}
					}
					if (!encontrado) {
						nombres[cont] = aux;
						cont++;
					} else {
						System.out.println("Repetido.");
					}
				}
				break;
			case "2": // Listar
				for (int i = 0; i < cont; i++) {
					System.out.println(nombres[i] + " ");
				}
				break;
			case "3": // Buscar nombre
				if (cont == 0) {
					System.out.println("No hay nombres.");
				} else {
					System.out.print("Nombre a buscar: ");
					buscar = sc.nextLine();
					encontrado = false;
					for (int i = 0; i < cont; i++) {
						if (nombres[i].toLowerCase().contains(buscar.toLowerCase())) {
							System.out.println(nombres[i]);
							encontrado = true;
						}
					}
					if (!encontrado) {
						System.out.println("No encontrado.");
					}
				}
				break;
			case "4": // Eliminar cadena
				if (cont == 0) {
					System.out.println("Array vacio.");
				} else {
					System.out.print("Nombre a eliminar: ");
					aux = sc.nextLine();
					encontrado = false;
					int iEliminar = 0;
					for (int i = 0; i < cont && !encontrado; i++) {
						if (aux.equalsIgnoreCase(nombres[i])) {
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
							nombres[i] = nombres[i + 1];
						}
						// Ajustar el contador
						cont--;
					} else {
						System.out.println("No encontrado.");
					}
				}
				break;
			case "5": // Eliminar todos
				for (int i = 0; i < nombres.length; i++) {
					nombres[i] = null;
				}
				cont = 0;
				break;
			case "6": // Salir
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