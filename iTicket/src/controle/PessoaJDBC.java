package controle;

import java.util.ArrayList;


public class PessoaJDBC implements IPessoaDAO {

	private ArrayList<Pessoa> pessoas;

	public PessoaJDBC() {
		this.pessoas = new ArrayList<>();
	}

	@Override
	public boolean inserir(Pessoa p) {
		if (p != null) {
			this.pessoas.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Pessoa p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Pessoa p, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Pessoa> listarPessoas() {
		// TODO Auto-generated method stub
		return null;
	}

}
