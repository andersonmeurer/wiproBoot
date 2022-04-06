package br.com.wipro.abstractClass.exemplo1;

public class Professor extends AFuncionario {

	public Professor() {
		cargo = ECargo.PROFESSOR;
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