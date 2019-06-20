import java.util.Scanner;

/**
 * 
 * 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
 * teclado.
 *
 */
public class Secuencial6 {

	public static void main(String[] args) {

		System.out.println("Introduce la velocidad en km/h");

		Scanner velocidad = new Scanner(System.in);
		float speed = velocidad.nextFloat();

		float msegundos = ((speed * 1000) / 3600);

		System.out.println(speed + " km/h equivalen a " + msegundos + "m/s.");
		velocidad.close();

	}

}
