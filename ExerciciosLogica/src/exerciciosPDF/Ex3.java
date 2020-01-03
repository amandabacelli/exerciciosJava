package exerciciosPDF;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Ex3 {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Insira 4 valores inteiros");
		System.out.println("A= ");
		int A = enter.nextInt();
		System.out.println("B= ");
		int B = enter.nextInt();
		System.out.println("C= ");
		int C = enter.nextInt();
		System.out.println("D= ");
		int D = enter.nextInt();
		
		int diferenca = (A*B-C*D);
		
		System.out.print("A diferença é = " + diferenca);
		
		enter.close();
		

	}

}
