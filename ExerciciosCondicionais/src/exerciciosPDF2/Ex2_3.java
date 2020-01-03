package exerciciosPDF2;

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Ex2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira dois numero inteiro: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		
		if (n1 % n2 ==0 || n2 % n1 ==0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
	
	}
}
