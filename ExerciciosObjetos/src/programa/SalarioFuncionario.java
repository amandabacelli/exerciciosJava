package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class SalarioFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario;
		funcionario = new Funcionario();
		
		System.out.print("insira o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("insira o salario bruto do funcionario: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("insira a taxa: ");
		funcionario.taxa = sc.nextDouble();
		double liquido = funcionario.salarioLiquido();
		
		System.out.printf("Funcionário liquido do funcionario é = %.2f%n", liquido);
		System.out.println("qual será a porcentagem de aumento do salario?");
		
		funcionario.porcentagem = sc.nextDouble();
		double aumento = funcionario.aumentoSalario() + liquido;
		
		System.out.printf("o salario com aumento será: %.2f%n ", aumento);
		
		
		
		
	}

}
