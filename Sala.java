public class Sala {
	private int numSala;
	private String nomeSala;
	private String servico;

	public Sala(int numSala, String nomeSala, String servico) {
		this.numSala = numSala;
		this.nomeSala = nomeSala;
		this.servico = servico;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public int getNumSala() {
		return numSala;
	}

}
