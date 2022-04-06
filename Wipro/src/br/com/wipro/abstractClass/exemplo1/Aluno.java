package br.com.wipro.abstractClass.exemplo1;

public class Aluno extends AFuncionario {

	public Aluno() {
		cargo = ECargo.ALUNO;
	}

	@Override
	public void trabalhar() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " - " + cargo.name() + " trabalhando...";
	}
}