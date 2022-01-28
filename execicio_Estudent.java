package orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

import entities.entitiesStudent;

public class execicio_Estudent {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		entitiesStudent student = new entitiesStudent();
		
		System.out.println("name:");
		student.name = sc.nextLine();
		System.out.println("first note:");
		student.grade1 = sc.nextDouble();
		System.out.println("second note:");
		student.grade2 = sc.nextDouble();
		System.out.println("third note:");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n",student.finalGrade());
		
		if (student.finalGrade()<60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
			
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
	}


}
