package br.com.wipro.abstractClass.exemplo2;

//Template Method
public abstract class ADocumento {

	public String imprimir() {
		String titulo = titulo();
		String introducao = introducao();
		String resultados = resultados();
		return titulo + "\n" + introducao + "\n" + resultados;
	}

	public abstract String titulo();

	public abstract String introducao();

	public abstract String resultados();

}