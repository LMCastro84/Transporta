package hospital.doentes;

import java.util.ArrayList;
import java.util.List;

public abstract class Doente {

	/**
	 * id unico do doente
	 */
	protected static int id;

	/**
	 * nome do doente
	 */
	protected String name;

	/**
	 * idade do doente
	 */
	protected int age;

	/**
	 * lista geral de todos os doentes que deram entrada no hospital
	 */
	protected List<Doente> listaGeralDoentes = new ArrayList<Doente>();

	protected String sexoDoente;

	/**
	 * enumerador que permite definir o sexo do doente
	 * 
	 * @author 04772
	 * 
	 */
	protected enum Sexo {
		MASCULINO, FEMININO
	}

	/**
	 * constructor vazio
	 */
	public Doente() {
	}

	public Doente(String name, int age, int sexo) {
		id++;
		this.name = name;
		this.age = age;
		if (sexo == 1) {
			this.sexoDoente = Sexo.MASCULINO.toString();
		} else {
			this.sexoDoente = Sexo.FEMININO.toString();
		}
	}

	/**
	 * lista geral de todos os doentes que deram entrada no hospital
	 * 
	 * @return lista de todos os doentes
	 */
	public List<Doente> getListaGeralDoentes() {
		return listaGeralDoentes;
	}

	/**
	 * adicionar doentes novos a lista geral de doentes
	 * 
	 * @param novoDoente
	 */
	public void addDSoenteListaGeralDoentes(Doente novoDoente) {
		this.listaGeralDoentes.add(novoDoente);
	}
}
