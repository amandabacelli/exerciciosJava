package exerciciosPDF;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Insira o raio do c�rculo: ");
		double raio = enter.nextDouble();
		double pi = 3.12159;
		double area = raio*raio*pi;
		System.out.println("A �rea do circulo �:");
		System.out.printf("%.4f", area);
		
		enter.close();
		

	}

}
