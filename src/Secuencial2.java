import java.util.Scanner;

/**
 * 
 * 2. Programa Java que lea un nombre y muestre por pantalla: 
 *   			“Buenos dias nombre_introducido”.
 *
 */
public class Secuencial2 {
	public static void main(String[] args) {
		
		System.out.println("Bienvenido ");
		
		Scanner nombre = new Scanner(System.in);
		String nombrePersona = nombre.next();
		
		System.out.println("Buenos días " + nombrePersona + "! :D");
		
		nombre.close();
	}

}
