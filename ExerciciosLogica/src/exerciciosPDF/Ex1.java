package exerciciosPDF;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Insira dois numeros inteiros: ");
		int n1 = entradas.nextInt();
		int n2 = entradas.nextInt();
		
		int soma = n1+n2;
		System.out.println("A soma é: ");
		System.out.println(soma);
		
		entradas.close();
		
		
	}

}
