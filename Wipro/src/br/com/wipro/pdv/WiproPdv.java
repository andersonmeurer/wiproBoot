package br.com.wipro.pdv;

import java.util.Scanner;

public class WiproPdv {

	private final int VL_IMPOSTO = 9;
	
	private String[] itemNomeProduto = { "Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Oleo", "Sabao", "Sal", "Açucar" };
	private int[] itemCodProduto = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private int[] itemQuantProd = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	private float[] itemPrecoProd = { 4.57f, 3.02f, 9.43f, 3.55f, 6.55f, 4.55f, 7.33f, 1.99f, 3.82f, 4.29f };

	private String[] carrinhoNomeProduto = new String[10];
	private int[] carrinhoQuantProd = new int[10];
	private float[] carrinhoPrecoProd = new float[10];

	private byte indexCarrinho = -1;
	private int codigo, quantidadeDeProduto;

	public WiproPdv() {
		Scanner sc = new Scanner(System.in);
		realizarCompra(sc, itemNomeProduto);
		mostarItensNoCarrinho(carrinhoNomeProduto, carrinhoQuantProd, carrinhoPrecoProd);
		int nrFormaPagamento = formaDePagamento(sc, carrinhoQuantProd, carrinhoPrecoProd);
		notaFiscal(sc, nrFormaPagamento, carrinhoNomeProduto, carrinhoQuantProd, carrinhoPrecoProd);
	}

	private void notaFiscal(Scanner sc, int nrFormaPagamento, String[] listNome, int[] listQuantidade, float[] listPreco) {
		System.out.println("\n\nWIPRO STORE");
		System.out.println("Rua dos Bôbos, nº0 - Mercadinho - LTDA\n");
		System.out.println("\t\tNOTA FISCAL\n");
		System.out.println("=================================================================\n");
		System.out.println("Nome\t\tQuantidade\tPreco unit (R$)\tPreco total (R$)");
		float valorTotalCompra = 0;
		for (int i = 0; i < (indexCarrinho + 1); i++) {
			valorTotalCompra += (listPreco[i] * listQuantidade[i]);
			System.out.printf("%s \t\t%d \t\t%.2f \t\t%.2f \n", listNome[i], listQuantidade[i], listPreco[i], (listPreco[i] * listQuantidade[i]));
		}
		System.out.println("=================================================================\n");
		if (nrFormaPagamento == 1) {
			print(((valorTotalCompra * 20) / 100), valorTotalCompra);
		} else if (nrFormaPagamento == 2) {
			print(((valorTotalCompra * 10) / 100), valorTotalCompra);
		} else if (nrFormaPagamento == 3 || nrFormaPagamento == 4) {
			print(0, valorTotalCompra);
		}
	}

	private void print(float valorDescontoCompra, float valorTotalPagar) {
		System.out.printf("\n\n%s%.2f\n", "Desconto na compra: R$", valorDescontoCompra);
		System.out.printf("%s%.2f\n", "Valor total a ser pago: R$", (valorTotalPagar - valorDescontoCompra));
		System.out.printf("%s%.2f\n", "Valor tributário: R$", ((valorTotalPagar * VL_IMPOSTO) / 100));
	}

	private int formaDePagamento(Scanner sc, int[] quantProd, float[] precoProd) {
		int index = -1;
		do {
			float valorTotal = 0;
			for (int i = 0; i < (indexCarrinho + 1); i++) {
				valorTotal += (precoProd[i] * carrinhoQuantProd[i]);
			}
			float valorTotalComImposto = (((valorTotal * VL_IMPOSTO) / 100) + valorTotal);
			System.out.printf("%s%.2f\n", "O valor total da compra com imposto de " + VL_IMPOSTO + "%: R$: ", valorTotalComImposto);
			System.out.println("Opções de pagamento:\n");
			System.out.println("\t[1] À vista em dinheiro, Pix ou cartão MASTERCARD, recebe 20% de desconto.");
			System.out.println("\t[2] À vista no catão de crédito, recebe 10% de desconto.");
			System.out.println("\t[3] Em duas vezes, sem desconto.");
			System.out.println("\t[4] Em trÊs vezes, sem desconto");
			System.out.println("\nQual a forma de  pagamento?");
			index = sc.nextInt();
		} while (index < 1 || index > 4);
		return index;
	}

	private void mostarItensNoCarrinho(String[] listNome, int[] listQuantidade, float[] listPreco) {
		System.out.println("ITENS NO CARRINHO:");
		System.out.println("Nome\tQuantidade\tPreco unit (R$)\tPreco total (R$)");
		for (int i = 0; i < (indexCarrinho + 1); i++) {
			System.out.printf("%s \t%d \t\t%.2f \t\t%.2f \n", listNome[i], listQuantidade[i], listPreco[i], (listPreco[i] * listQuantidade[i]));
		}
	}

	public void realizarCompra(Scanner sc, String[] itemNomeProduto) {
		int index;
		int quantidadeDeProduto;
		String continuar = "";
		do {
			imprimeItem(itemCodProduto, itemNomeProduto, itemQuantProd, itemPrecoProd);

			System.out.print("Olá! Digite o código do produto desejado:");
			index = (sc.nextInt()-1);
			System.out.print("Insira a quantidade do produto:");
			quantidadeDeProduto = sc.nextInt();

			if (itemQuantProd[index] < quantidadeDeProduto) {
				System.out.println("Produto Indisponível");
				continuar = sc.next();
				continue;
			}

			System.out.printf("\n%d un. de %s adicionado com sucesso no carrinho!!\n\n", quantidadeDeProduto, itemNomeProduto[index]);

			indexCarrinho++;
			carrinhoNomeProduto[indexCarrinho] = itemNomeProduto[index];
			carrinhoQuantProd[indexCarrinho] = quantidadeDeProduto;
			carrinhoPrecoProd[indexCarrinho] = itemPrecoProd[index];

			itemQuantProd[index] = (itemQuantProd[index] -quantidadeDeProduto);

			System.out.println("Deseja continuar a sua compra? [S/N]");
			continuar = sc.next();
		} while (!continuar.equalsIgnoreCase("N"));
	}

	public void imprimeItem(int[] codigo, String[] nome, int[] quantidade, float[] valor) {
		System.out.println("==================================================");
		System.out.printf("\t\t WIPRO STORE\n");
		System.out.println("==================================================");
		System.out.println("CODIGO\tPRODUTO\tQTD.ITENS\tPRECO UNIT");
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("%d \t%s\t\t%d\t%.2f \n", codigo[i], nome[i], quantidade[i], valor[i]);
		}
		System.out.println("==================================================");
	}

	public static void main(String[] args) {
		new WiproPdv();
	}
}