package br.com.wipro.abstractClass.exemplo2;

public class ArtigoCientifico extends ADocumento {

	@Override
	public String titulo() {
		return "T�tulo do " + this.getClass().getSimpleName();
	}

	@Override
	public String introducao() {
		return "Introdu��o do " + this.getClass().getSimpleName();
	}

	@Override
	public String resultados() {
		return "Resultados do " + this.getClass().getSimpleName();
	}
}