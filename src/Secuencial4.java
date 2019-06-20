import java.util.Scanner;

/**
 * 
 * 4. Programa que lea una cantidad de grados centígrados y la pase a grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 *
 */
public class Secuencial4 {
	public static void main(String[] args) {

		System.out.println("Escribe una temperatura para pasar de ºC a ºF");
		Scanner gradosCentigrados = new Scanner(System.in);
		float centigrados = gradosCentigrados.nextFloat();

		System.out.println(centigrados + "ºC    ----->   " + (32 + ((9 * centigrados) / 5)) + "ºF");
		gradosCentigrados.close();
	}

}
