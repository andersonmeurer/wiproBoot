package br.com.wipro.squadMatrix.televisao;

public class Televisao {

	private int nrVolume;
	private int nrCanal;

	public int consultarVolume() {
		return nrVolume;
	}

	public void aumentarVolume() {
		if (nrVolume < 10) {
			nrVolume++;
		}
	}

	public void diminuirVolume() {
		if (nrVolume > 0) {
			nrVolume--;
		}
	}

	public void setCanal(int i) {
		if (nrCanal > 0 && nrCanal < 10) {
			nrCanal = i;
		}
	}

	public void aumentarCanal() {
		if (nrCanal < 10) {
			nrCanal++;
		}
	}

	public void diminuirCanal() {
		if (nrCanal > 0) {
			nrCanal--;
		}
	}

	public int consultarCanal() {
		return nrCanal;
	}
}