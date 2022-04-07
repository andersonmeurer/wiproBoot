package br.com.wipro.squadMatrix.funcionario;

public class BackEnd extends Funcionario {

	public BackEnd(String nome, String cpf, float salario) {
		super(nome, cpf, salario);
	}

	@Override
	public void bonus(double valor) {
		System.out.println(getClass().getSimpleName() + ".bonus: " + (salario + valor));
	}
}