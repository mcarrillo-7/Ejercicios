import java.util.Scanner;

/**
 * 
 * 1. Programa Java que lea dos n�meros enteros por teclado y los muestre por
 * pantalla.
 *
 */
public class Secuencial1 {

	public static void main(String[] args) {
		System.out.println("Escribe el primer n�mero: ");

		Scanner numero1 = new Scanner(System.in);
		int n1 = numero1.nextInt();

		System.out.println("Escribe el segundo n�mero ");
		Scanner numero2 = new Scanner(System.in);
		int n2 = numero2.nextInt();

		System.out.println("Primer n�mero: " + n1 + "\n Segundo n�mero : " + n2);

		numero1.close();
		numero2.close();
	}

}
