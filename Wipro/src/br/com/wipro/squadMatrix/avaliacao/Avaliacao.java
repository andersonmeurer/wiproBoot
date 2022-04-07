package br.com.wipro.squadMatrix.avaliacao;

public class Avaliacao {

	private int matricula;

	private String nome;

	private float nota;

	public Avaliacao(int i, String string, float f) {
		matricula = i;
		nome = string;
		nota = f;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public String getNome() {
		return this.nome;
	}

	public float getNota() {
		return this.nota;
	}
}
