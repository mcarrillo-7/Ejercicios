import java.util.Scanner;

/**
 * 
 * 4. Programa que lea una cantidad de grados cent�grados y la pase a grados
 * Fahrenheit. La f�rmula correspondiente es: F = 32 + ( 9 * C / 5)
 *
 */
public class Secuencial4 {
	public static void main(String[] args) {

		System.out.println("Escribe una temperatura para pasar de �C a �F");
		Scanner gradosCentigrados = new Scanner(System.in);
		float centigrados = gradosCentigrados.nextFloat();

		System.out.println(centigrados + "�C    ----->   " + (32 + ((9 * centigrados) / 5)) + "�F");
		gradosCentigrados.close();
	}

}
