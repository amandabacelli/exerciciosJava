package entidades;

import java.io.Console;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
		
	}
	
	public double pontosFaltantes() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
	
}
