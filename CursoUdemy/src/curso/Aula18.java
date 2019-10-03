package curso;

import java.util.Locale;
import java.util.Scanner;

public class Aula18 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //para transformar o separador , em .
		Scanner sc = new Scanner(System.in);
		//digitar numero qualquer (29)
		int n1 = sc.nextInt();
		sc.nextLine(); //ele vai dar uma quebra de linha sem encerrar a digitação
		//Digitar nome
		String name = sc.nextLine();
		//digitar genero F ou M
		char gender = sc.next().charAt(0); //serve para pegar o primeiro caractere inserido
		// digitar uma letra e um numero e armazenar em 2 variaveis (B3)
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1)); //substring vai cortar o string na posição que eu queira
		//para converter a string em inteiro, usa o integer.paserint
		// digitar numero decimal com separador . (1.75)
		double n2 = sc.nextDouble();
		//imprimir Amanda F 29 1.75 e salvar em várias variaveis
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
				
		sc.close();
	}

}
