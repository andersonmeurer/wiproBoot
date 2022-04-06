package br.com.wipro.abstractClass.exemplo1;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		AFuncionario f1 = new Aluno();
		f1.trabalhar();
		
		AFuncionario f2 = new Desenvolvedor();
		f2.trabalhar();
		
		AFuncionario f3 = new Professor();
		f3.trabalhar();
	}
}
