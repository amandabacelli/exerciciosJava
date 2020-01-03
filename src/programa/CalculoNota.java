package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudante;

public class CalculoNota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.print("insira o nome do aluno: ");
		estudante.nome = sc.nextLine();
		
		System.out.print("insira a nota do primeiro trimestre do aluno: ");
		estudante.nota1 = sc.nextDouble();
		
		System.out.print("insira a nota do segundo trimestre do aluno: ");
		estudante.nota2 = sc.nextDouble();
		
		System.out.print("insira a nota do segundo trimestre do aluno: ");
		estudante.nota3 = sc.nextDouble();
		double notaFinal = estudante.notaFinal();
		
		System.out.printf("Nota final: %.2f%n ", notaFinal);
		
		if(notaFinal < 60.00) {
			System.out.println("Reprovado");
			System.out.printf("Pontos faltantes: %.2f%n ", estudante.pontosFaltantes());
		} else {
			System.out.println("Aprovado");
		}

		
		
	}

}
