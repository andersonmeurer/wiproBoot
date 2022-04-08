package br.com.wipro.squadMatrix.formas;

public enum EForma {
	CIRCULO(new Circulo()),
	QUADRADO(new Quadrado()),
	RETANGULO(new Retangulo()),
	TRIANGULORETANGULO(new TrianguloRetangulo());

	private IFormaGeometrica forma;

	private EForma(IFormaGeometrica forma) {
		this.forma = forma;
	}

	public IFormaGeometrica getForma() {
		return this.forma;
	}
}