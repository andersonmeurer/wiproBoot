package br.com.wipro.squadMatrix.televisao;

import java.util.Iterator;

public class ControleRemoto {

	public static void main(String[] args) {
		new ControleRemoto();
	}

	private Televisao televisao;

	public ControleRemoto() {
		televisao = new Televisao();

		System.out.println("############# Volume #############");
		System.out.println(televisao.consultarVolume());
		televisao.aumentarVolume();
		System.out.println(televisao.consultarVolume());
		televisao.diminuirVolume();
		System.out.println(televisao.consultarVolume());
		for (int i = 0; i < 100; i++) {
			televisao.aumentarVolume();
		}
		System.out.println(televisao.consultarVolume());

		System.out.println("############# Canal #############");
		televisao.setCanal(11);
		System.out.println(televisao.consultarCanal());
		televisao.aumentarCanal();
		System.out.println(televisao.consultarCanal());
		televisao.diminuirCanal();
		System.out.println(televisao.consultarCanal());
		
		for (int i = 0; i < 100; i++) {
			televisao.aumentarCanal();
		}
		System.out.println(televisao.consultarCanal());
	}
}
