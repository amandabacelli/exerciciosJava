package exerciciosPDF2;

import java.util.Scanner;

public class Ex2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double n1 = sc.nextDouble();
		
		if (n1>=0.00 && n1<=25.00) {
			System.out.println("Intervalo [0,25]");
		}
		if (n1>25.00 && n1<=50.00) {
			System.out.println("Intervalo [25,50]");
		}
		if (n1>50.00 && n1<=75.00) {
			System.out.println("Intervalo [50,75]");
		}
		if (n1>75.00 && n1<=100.00) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Numero fora do intervalo");
		}
	}

}
