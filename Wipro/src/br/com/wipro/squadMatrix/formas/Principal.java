package br.com.wipro.squadMatrix.formas;

public class Principal {
	public static void main(String[] args) {
		System.out.println(String.valueOf(EForma.CIRCULO) + " - " + EForma.CIRCULO.getForma().area(1, 1));
		System.out.println(String.valueOf(EForma.QUADRADO) + " - " + EForma.QUADRADO.getForma().area(1, 1));
		System.out.println(String.valueOf(EForma.RETANGULO) + " - " + EForma.RETANGULO.getForma().area(1, 1));
		System.out.println(String.valueOf(EForma.TRIANGULORETANGULO) + " - " + EForma.TRIANGULORETANGULO.getForma().area(1, 1));

	}
}