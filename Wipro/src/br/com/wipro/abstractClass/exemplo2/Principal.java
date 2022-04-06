package br.com.wipro.abstractClass.exemplo2;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		ADocumento r1 = new ArtigoCientifico();
		System.out.println(r1.imprimir() + "\n\n");

		ADocumento r2 = new Tcc();
		System.out.println(r2.imprimir() + "\n\n");

		ADocumento r3 = new Relatorio();
		System.out.println(r3.imprimir() + "\n\n");
	}
}
