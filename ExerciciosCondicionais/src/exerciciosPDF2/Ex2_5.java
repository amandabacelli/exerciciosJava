package exerciciosPDF2;

import java.util.Scanner;

public class Ex2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o código do item: ");
		int codigo = sc.nextInt();
		System.out.println("Insira a quantidade do item: ");
		int quantidade = sc.nextInt();
		
//		ArrayList<String> cardapio = new ArrayList<>();
//		cardapio.add("1; CachorroQuente ;4");
//		cardapio.add("2;X-Salada;4.5");
//		cardapio.add("3;x-bacon;5");
//		cardapio.add("4;torradaSimples;2");
//		cardapio.add("5;refrigerante;1.50");
//		
		double conta;
		if (codigo==1) {
			conta = quantidade*4;
			System.out.printf("O total da conta é R$ %.2f%n", conta);
		}
		if (codigo==2) {
			conta = quantidade*4.5;
			System.out.printf("O total da conta é R$ %.2f%n", conta);
		}
		if (codigo==3) {
			conta = quantidade*5;
			System.out.printf("O total da conta é R$ %.2f%n", conta);
		}
		if (codigo==4) {
			conta = quantidade*2;
			System.out.printf("O total da conta é R$ %.2f%n", conta);
		}
		if (codigo==5) {
			conta = quantidade*1.5;
			System.out.printf("O total da conta é R$ %.2f%n", conta);
		}
		
	}

}
