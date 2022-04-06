package br.com.wipro.abstractClass.exemplo1;

public class Desenvolvedor extends AFuncionario {

	public Desenvolvedor() {
		cargo = ECargo.DESENVOLVEDOR;
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