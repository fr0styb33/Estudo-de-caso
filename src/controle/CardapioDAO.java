package controle;

import java.util.ArrayList;

import modelo.ICardapioDAO;
import modelo.Pessoa;
import modelo.Produto;

public class CardapioDAO implements ICardapioDAO {

	private static ArrayList<Produto> produtos;
	private static CardapioDAO instancia;

	/**
	 * Torna o construtor da classe privado Para impedir que a classe seja
	 * instanciada
	 */
	private CardapioDAO() {
	}

	/**
	 * Metodo utilizando padrao Singleton impossibilitando que se criem diversos
	 * objetos em memoria RAM apenas se crie um uma unica vez e se manipule o mesmo
	 * 
	 * 
	 * @return
	 */
	public static CardapioDAO getInstancia() {

		if (instancia == null) {
			instancia = new CardapioDAO();
			produtos = new ArrayList<>();
			
			// adicionar uns produtos aqui
			
			produtos.add(null);
		}

		return instancia;
	}

	@Override
	public boolean inserir(Pessoa p) {
		if (p != null) {
			produtos.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Pessoa p, long cpf) {
		for (Pessoa pessoa : produtos) {

			if (pessoa.getCpf() == cpf) {
				pessoa.setNome(p.getNome());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Pessoa p, long cpf) {
		for (Pessoa pessoa : produtos) {
			if (pessoa.getCpf() == cpf) {
				produtos.remove(pessoa);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Pessoa> listarPessoas() {
		return produtos;
	}

}
