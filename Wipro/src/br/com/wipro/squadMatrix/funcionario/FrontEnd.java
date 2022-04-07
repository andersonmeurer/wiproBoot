package br.com.wipro.squadMatrix.funcionario;

public class FrontEnd extends Funcionario {

	public FrontEnd(String nome, String cpf, float salario) {
		super(nome, cpf, salario);
	}

	@Override
	public void bonus(double valor) {
		System.out.println(getClass().getSimpleName() + ".bonus: " + (salario + valor));
	}
}
