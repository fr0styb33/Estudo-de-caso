package controle;

import java.util.ArrayList;

import modelo.IProdutoDAO;
import modelo.Produto;

public class ProdutoDAO implements IProdutoDAO {

	private static ArrayList<Produto> produtos;
	private static ProdutoDAO instancia;

	private ProdutoDAO() {

	}

	public static ProdutoDAO getInstancia() {
		if (instancia == null) {
			instancia = new ProdutoDAO();
			produtos = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean inserir(Produto produto) {
		if (produto != null) {
			produtos.add(produto);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Produto produtoAlterar) {
		for (Produto produto : produtos) {

			if (produto.getCodProduto() == produtoAlterar.getCodProduto()) {
				produto.setNome(produto.getNome());
				produto.setTipo(produto.getTipo());
				produto.setCodProduto(produto.getCodProduto());
				produto.setPreco(produto.getPreco());
			}
			return true;
		}

		return false;
	}



	@Override
	public ArrayList<Produto> listarProduto() {
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getTipo());
			System.out.println(produto.getCodProduto());
			System.out.println(produto.getPreco());
		}

		return produtos;
	}

	@Override
	public boolean excluir(Long codProdutos) {
		for(Produto produto : produtos) {
			if(produto.getCodProduto().equals(codProdutos)){
				produtos.remove(produto);
				return true;
			}
		}
		return false;
	}

}
