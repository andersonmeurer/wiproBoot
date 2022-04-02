package br.com.wipro.estrutura_de_repeticao;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/***
 * Escreva um programa Java que gera um número aleatório (randômico) entre 0 e
 * 10 (incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use um
 * laço while para registrar as tentativas feitas e, a cada tentativa, dê dicas
 * informando se o número gerado é maior ou menor que a tentativa feita.
 * Finalmente mostre a quantidade de tentativas feitas até que o número fosse
 * acertado
 * 
 * @author Anderson Meurer
 *
 */
public class Exercicio01 {

	public static void main(String[] args) {
		try {
			new Exercicio01();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Exercicio01() throws IOException {
		Scanner terminal = new Scanner(System.in);
		int nrTentativas = 0;
		do {
			int nrGerado = new Random().nextInt(11);
			nrTentativas++;

			System.out.println("Digite um valor de 0 a 10");
			int identificarValor = terminal.nextInt();
			System.out.println(identificarValor);

			if (identificarValor == nrGerado) {
				System.out.println("Você acertou! O numero gerado (" + nrGerado + ")");
				break;
			} else if (nrGerado > nrTentativas) {
				System.out.println("Novo número (" + nrGerado + ") é maior que o valor digitado (" + identificarValor + "), a tentativa (" + nrTentativas + ")");
			} else if (nrGerado < nrTentativas) {
				System.out.println("Novo número (" + nrGerado + ") é menor que o valor digitado (" + identificarValor + "), a tentativa (" + nrTentativas + ")");
			}

		} while (true);
	}
}