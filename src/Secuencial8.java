import java.util.Scanner;

/**
 * 8. Programa que calcula el volumen de una esfera.
 * 
 * @author Curso
 *
 */
public class Secuencial8 {

	public static void main(String[] args) {

		System.out.println("Escribe el radio de la esfera.");

		Scanner radius = new Scanner(System.in);
		float radio = radius.nextFloat();

		System.out
				.println("El volumen de la esfera es: " + ((4 / 3) * Math.PI * Math.pow(radio, 3)) + " metros cúbicos");

	}
}
