package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class positiveOrNegative {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num = sc.nextInt();
		if ( num < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não Negativo");
		}
			
		}
	
	

}
