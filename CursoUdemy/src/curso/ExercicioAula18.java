package curso;


import java.util.Locale;
import java.util.Scanner;


public class ExercicioAula18 {

	public static void main(String[] args) {
		/* Fazer um programa para executar o procedimento de entrada
		 * de dados na tela
		 * Enter your full name (same line):
		 * How many bedroons are ther in you house?
		 * Enter product price:
		 * Enter your last name, age and height (same line):
		 */
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = dados.nextLine();
				
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = dados.nextInt();
		
		System.out.println("Enter product price:");
		double price = dados.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line):");
		String last = dados.next();
		int age = dados.nextInt();
		double height = dados.nextDouble();
		
		dados.close();
		
		//comandos de imprimir
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.println(price);
		System.out.println(last);
		System.out.println(age);
		System.out.println(height);
		
	}

}
