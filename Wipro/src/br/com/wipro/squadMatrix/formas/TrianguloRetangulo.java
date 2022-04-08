package br.com.wipro.squadMatrix.formas;

public class TrianguloRetangulo implements IFormaGeometrica {

	@Override
	public String cor() {
		return "Amarelo";
	}

	@Override
	public String quantidadeDeLados() {
		return "3";
	}

	@Override
	public double area(double a, double b) {
		return (a * b) / 2;
	}
}