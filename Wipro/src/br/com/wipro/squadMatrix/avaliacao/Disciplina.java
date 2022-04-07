package br.com.wipro.squadMatrix.avaliacao;

import java.util.Iterator;

public class Disciplina {
	public static void main(String[] args) {
		new Disciplina();
	}

	public Disciplina() {
		Avaliacao[] list = {
				new Avaliacao(123, "Aluno1", 7.5f),
				new Avaliacao(123, "Aluno1", 5.0f),
				new Trabalho(123, "Aluno1", 7.0f)
		};
		float media = media(list);
		System.out.println("Média=" + media);
		System.out.println("Recuperação=" + recuperacao(media));
	}

	private float media(Avaliacao[] list) {
		float media = 0;
		for (Avaliacao avaliacao : list) {
			if (avaliacao instanceof Trabalho) {
				media += avaliacao.getNota() * 2.0;
			} else {
				media += avaliacao.getNota() * 1.5;
			}
		}
		return (media / 5);
	}

	private int recuperacao(float media) {
		if (media > 7) { 
			return 0;
		}
		return 1;
	}
}