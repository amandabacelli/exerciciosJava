package curso;

import java.util.Scanner;

public class Aula17 {

	public static void main(String[] args) { //ponto de entrada da aplicação entrypoint

		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String x, y, z;
		x = scanner.next();
		y = scanner.next();
		z = scanner.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = scanner.next();
		y = scanner.next();
		z = scanner.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		scanner.close();
		

	}

}
