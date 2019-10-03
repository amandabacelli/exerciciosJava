package exerciciosPDF2;

import java.util.Scanner;

public class Ex2_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro: ");
		int n1 = sc.nextInt();
				
		if (n1>=0) {
			System.out.println("numero não negativo ");
		}
		else {
			System.out.println("numero negativo ");
		}
		sc.close();
	}
	

}
