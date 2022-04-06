package br.com.wipro.abstractClass.exemplo1;

public abstract class AFuncionario {

	ECargo cargo;

	public AFuncionario() {
		cargo = ECargo.INDEFINIDO;
	}

	public abstract void trabalhar();

	public abstract String toString();

}