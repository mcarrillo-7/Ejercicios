import java.util.Scanner;

/**
 * 7. Programa lea la longitud de los catetos de un triángulo rectángulo y 
 * 		calcule la longitud de la hipotenusa según el teorema de Pitágoras.
 * @author Curso
 *
 */
public class Secuencial7 {

	public static void main(String[] args) {
		System.out.println("Longitud del primer cateto");
		Scanner c1 = new Scanner(System.in);
		float cateto1 = c1.nextFloat();
		System.out.println("Longitud del segundo cateto");
		Scanner c2 = new Scanner(System.in);
		float cateto2 = c2.nextFloat();
		
		float hipotenusa = (float) (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("La hipotenusa del triángulo tiene una longitud de " + Math.sqrt(hipotenusa));
		
		c1.close();
		c2.close();

	}

}
