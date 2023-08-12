package logicaProgramacionBasicaEjercicios_42_51;

/*Realiza un programa que sume todos los números pasados por línea de comando: $java Suma 4 67.6 9 2 
$La suma es 82.6 

 * */
public class SumarArgumentos_48 {

	public static void main(String[] args) {
		float suma = 0;
		for (int i = 0; i < args.length; i++) {
			suma += Float.parseFloat(args[i]);
		}
		System.out.println("La suma es " + suma);
	}
}