package exerciciosPDF2;

import java.util.Scanner;

public class Ex2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o horario de inicio do jogo: ");
		int n1 = sc.nextInt();
		System.out.println("Insira o horario de fim do jogo: ");
		int n2 = sc.nextInt();
		
		int dia = 24;
		
		if (n2==n1) {
			System.out.println("O jogo durou " +dia+ " hora(s)");
		}else
			if (n1>n2) {
				int duracao = (dia-n1+n2);
				System.out.println("o jogo durou " +duracao+ " hora(s)");
		}else {
			int duracao = (n2-n1);
			System.out.println("o jogo durou " +duracao+ " hora(s)");
		}
				
	} 

 }