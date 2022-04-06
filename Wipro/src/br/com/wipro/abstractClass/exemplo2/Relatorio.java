package br.com.wipro.abstractClass.exemplo2;

public class Relatorio extends ADocumento {

	@Override
	public String titulo() {
		return "Título do " + this.getClass().getSimpleName();
	}

	@Override
	public String introducao() {
		return "Introdução do " + this.getClass().getSimpleName();
	}

	@Override
	public String resultados() {
		return "Resultados do " + this.getClass().getSimpleName();
	}
}