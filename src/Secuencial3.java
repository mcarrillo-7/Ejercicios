import java.util.Scanner;

/**
 * 
 * 3. Programa Java que lee un número entero por teclado y obtiene y muestra por
 * pantalla el doble y el triple de ese número.
 *
 */
public class Secuencial3 {
	public static void main(String[] args) {

		System.out.println("Escribe un número entero: ");

		Scanner entero = new Scanner(System.in);
		int numero_entero = entero.nextInt();

		System.out.println("El doble de este número es " + (numero_entero * 2));
		System.out.println("\n El triple de este número es " + (numero_entero * 3));
		entero.close();

	}

}
