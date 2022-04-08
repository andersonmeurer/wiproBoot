package br.com.wipro.squadMatrix.formas;

public class Retangulo implements IFormaGeometrica {
	@Override
	public String cor() {
		return "Azul";
	}

	@Override
	public String quantidadeDeLados() {
		return "3";
	}

	@Override
	public double area(double a, double b) {
		return a * b;
	}
}