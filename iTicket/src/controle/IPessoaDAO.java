package controle;

import java.util.ArrayList;

import modelo.Pessoa;

public interface IPessoaDAO {
	
	public boolean inserir(Pessoa p);
	
	public boolean alterar(Pessoa p, int id);
	
	public boolean excluir(Pessoa p, int id);
	
	public ArrayList<Pessoa> listarPessoas();

}
