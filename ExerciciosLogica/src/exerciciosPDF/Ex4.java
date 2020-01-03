package exerciciosPDF;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Insira o ID do funcionario");
		int id = enter.nextInt();
		System.out.println("Insira a quantidade de horas trabalhadas");
		double horas = enter.nextDouble();
		System.out.println("Insira o valor por hora");
		double valor = enter.nextDouble();
		
		double salario = horas*valor;
		System.out.println("NUMBER = " +id);
		System.out.println("SALARY = U$" + salario);
		
		enter.close();

		

	}

}
