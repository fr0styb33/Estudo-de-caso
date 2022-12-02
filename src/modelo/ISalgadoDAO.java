package modelo;

import java.util.ArrayList;

public interface ISalgadoDAO {

	public boolean inserir(Salgado salgado);

	public boolean alterar(Salgado salgado);

	public boolean excluir(Salgado salgado);

	public ArrayList<Salgado> listarSalgados();

}