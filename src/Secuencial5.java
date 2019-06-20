import java.util.Scanner;

/**
 * 
 * 5. Programa que lee por teclado el valor del radio de una circunferencia y
 * calcula y muestra por pantalla la longitud y el área de la circunferencia.
 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia =
 * PI*Radio^2
 *
 */
public class Secuencial5 {

	public static void main(String[] args) {

		System.out.println("Escribe el valor del radio");
		Scanner datoRadio = new Scanner(System.in);
		float radioCirculo = datoRadio.nextFloat();
		float longitudCirculo = (2f * 3.141592654f * radioCirculo);
		float areaCirculo = (float) (3.141562954f * Math.pow(radioCirculo, 2));

		System.out.println("Longitud de la circunferencia: " + longitudCirculo);
		System.out.println("Área de la circunferencia: " + areaCirculo);
		datoRadio.close();
	}

}
