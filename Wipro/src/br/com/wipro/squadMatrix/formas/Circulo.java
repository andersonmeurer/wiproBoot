package br.com.wipro.squadMatrix.formas;

public class Circulo implements IFormaGeometrica {

	@Override
	public String cor() {
		return "Vermelho";
	}

	@Override
	public String quantidadeDeLados() {
		return "0";
	}

	@Override
	public double area(double a, double b) {
		return ((a * a) * Math.PI) / 2;
	}
}