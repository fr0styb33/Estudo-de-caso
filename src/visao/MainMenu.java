package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.CardapioDAO;
import modelo.Produto;
import modelo.Salgado;

public class MainMenu {

	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		CardapioDAO bancoProduto = CardapioDAO.getInstancia();
		while (opcaoSelecionada != 0) {

			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRAR");
			System.out.println("2 ALTERAR");
			System.out.println("3 EXCLUIR");
			System.out.println("4 LISTAR SALGADOS");
			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				Salgado salgado = new Salgado();
				System.out.println("Nome:");
				String nome = leitura.nextLine();
				System.out.println("Tipo:");
				String tipo = leitura.nextLine();

				if (!nome.isEmpty()) {
					salgado.setNome(nome);
				} else {
					System.out.println("Erro");
				}

				if (!tipo.isEmpty()) {
					salgado.setPreco(null);
				} else {
					System.out.println("Erro");
				}
				
				/**
				 * Finalizar o cadastro colocando os sets e validando
				 */

				boolean valida = bancoProduto.inserir(salgado);
				if (valida == true) {
					System.out.println("Produto cadastrado com sucesso!");
				} else {
					System.out.println("Erro ao cadastrar produto!");
				}

			}
			case 2: {
				System.out.println("Digite o codigo da pessoa que deseja alterar:");
				// finalizar codigo
			}
			case 3: {
				System.out.println("Digite o codigo da pessoa que deseja excluir:");
				// finalizar codigo
			}
			case 4: {
				ArrayList<Salgado> salgados = bancoProduto.listarSalgados();
				if (salgados.size() == 0) {
					System.out.println("Nenhum salgado cadastrado!");
				} else {
					for (Produto produto : salgados) {
						System.out.println("Nome: " + produto.getNome());
						System.out.println("Preco: " + produto.getPreco());

						// completar
					}
				}
			}

			}

		}

		leitura.close();
	}
}