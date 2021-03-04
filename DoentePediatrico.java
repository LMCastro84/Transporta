package hospital.doentes;

public class DoentePediatrico extends Doente {

	/**
	 * nome do pai da crianca
	 */
	private String nomePai;

	/**
	 * nome da mae da crianca
	 */
	private String nomeMae;

	public DoentePediatrico(String name, int age, int sexo, String nomePai,
			String nomeMae) {
		super(name, age, sexo);
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
	}
}
