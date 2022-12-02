package controle;

import java.util.ArrayList;

import modelo.ISalgadoDAO;
import modelo.Salgado;

public class SalgadoDAO implements ISalgadoDAO {

	private static ArrayList<Salgado> salgados;
	private static SalgadoDAO instancia;

	private SalgadoDAO() {
	}

	public static SalgadoDAO getInstancia() {

		if (instancia == null) {
			instancia = new SalgadoDAO();
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
				salgado.setCalorias(salgado.getCalorias());
				salgado.setPreco(salgado.getPreco());
				salgado.setTipo(salgado.getTipo());
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
		for (Salgado salgado : salgados){
			System.out.println(salgado.getNome());
			System.out.println(salgado.getTipo());
			System.out.println(salgado.getCalorias());
			System.out.println(salgado.getCodProduto());
			System.out.println(salgado.getPreco());
		}
		return salgados;
	}

}