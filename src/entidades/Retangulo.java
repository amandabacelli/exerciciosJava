package entidades;

public class Retangulo {
	public double altura;
	public double comprimento;
	
	public double area() {
		return altura*comprimento;	
	}
	
	public double perimetro() {
		return 2*(altura+comprimento);
	}
	public double diagonal() {
		return Math.sqrt(altura*altura + comprimento*comprimento);
	}

}
