package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo;
		retangulo = new Retangulo();
		System.out.println("insira a altura e o comprimento do retangulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.comprimento = sc.nextDouble();
		
		double arearetangulo = retangulo.area();
		double perimetroretangulo = retangulo.perimetro();
		double diagonalretangulo = retangulo.diagonal();
		System.out.printf("Area do retangulo = %.2f%n", arearetangulo);
		System.out.printf("Perimetro do retangulo = %.2f%n", perimetroretangulo);
		System.out.printf("Diagonal do retangulo = %.2f%n", diagonalretangulo);

	}

}
