package controle;

import java.util.ArrayList;

import modelo.ICardapioDAO;
import modelo.Salgado;

public class CardapioDAO implements ICardapioDAO {

	private static ArrayList<Salgado> salgados;
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
			salgados = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Salgado salgado) {
		if (salgado != null) {
			salgados.add(salgado);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Salgado salgadoAlterar) {
		for (Salgado salgado : salgados) {

			if (salgado.getCodProduto() == salgadoAlterar.getCodProduto()) {
				salgado.setNome(salgado.getNome());
				// terminar esse metodo
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Salgado salgadoExcluir) {
		for (Salgado salgado : salgados) {
			if (salgado.getCodProduto() == salgadoExcluir.getCodProduto()) {
				salgados.remove(salgado);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Salgado> listarSalgados() {
		return salgados;
	}

}