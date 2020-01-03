package entidades;

public class Funcionario {
	
	public String nome;
	public double taxa;
	public double salarioBruto;
	public double porcentagem;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double aumentoSalario () {
		return ((salarioBruto*porcentagem)/100);
	}

}
