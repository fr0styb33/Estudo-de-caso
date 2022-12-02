package modelo;

import java.util.ArrayList;

public interface IProdutoDAO {

	public boolean inserir(Produto produto);

	public boolean alterar(Produto produto);

	public boolean excluir(Long codProdutos);

	public ArrayList<Produto> listarProduto();

}