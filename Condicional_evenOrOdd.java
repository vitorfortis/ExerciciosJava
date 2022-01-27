package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_evenOrOdd {
	
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num = sc.nextInt();
		if (num  % 2 == 0) {
			System.out.println("PAR");
		}
		else {
		    System.out.println("IMPAR");
		}
		}
	}
	
	


