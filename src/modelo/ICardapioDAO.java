package modelo;

import java.util.ArrayList;

public interface ICardapioDAO {

	public boolean inserir(Produto p);

	public boolean alterar(Produto p, long cpf);

	public boolean excluir(Produto p, long cpf);

	public ArrayList<Produto> listarPessoas();

}
