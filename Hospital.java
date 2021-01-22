import java.util.ArrayList;

public class Hospital {

	private String nome;
	private String cidade;
	private String regiao;
	private Sala admissaoAdultos;
	private Sala admissaoPediatria;
	private Sala triagemAdultos;
	private Sala triagemPediatria;
	private Sala clinicaGeral;
	private Sala areaCirurgicaAdultos;
	private Sala areaCirurgicaPediatria;
	private Sala rx;
	private Sala tac;
	private ArrayList<Sala> salas;
	private ArrayList<Doente> listaGeralDoentes;
	private ArrayList<Doente> listaAdmissaoAdultos;
	private ArrayList<Doente> listaAdmissaoPediatria;
	private ArrayList<Doente> listaTriagemAdultos;
	private ArrayList<Doente> listaTriagemPediatria;
	private ArrayList<Doente> listaClinicaGeral;
	private ArrayList<Doente> listaAreaCirurgicaAdultos;
	private ArrayList<Doente> listaAreaCirurgicaPediatria;
	private ArrayList<Doente> listaRx;
	private ArrayList<Doente> listaTAC;

	public Hospital() {
	}

	public Hospital(String nome, String cidade, String regiao) {
		this.nome = nome;
		this.cidade = cidade;
		this.regiao = regiao;
		criaSalas();
		salas = null;
		listaGeralDoentes = null;
		listaAdmissaoAdultos = null;
		listaAdmissaoPediatria = null;
		listaTriagemAdultos = null;
		listaTriagemPediatria = null;
		listaClinicaGeral = null;
		listaAreaCirurgicaAdultos = null;
		listaAreaCirurgicaPediatria = null;
		listaRx = null;
		listaTAC = null;
		System.out.println("Hospital "+nome+" da cidade "+cidade+" da Região "+regiao+".\n");
		System.out.println("Salas criadas.");
	}

	public void criaSalas() {
		admissaoAdultos = new Sala(1, "Admissao Adultos", "Urgencia");
		admissaoPediatria = new Sala(2, "Admissao Pediatria", "Urgencia");
		triagemAdultos = new Sala(3, "Triagem Adultos", "Urgencia");
		triagemPediatria = new Sala(4, "Triagem Pediatria", "Urgencia");
		clinicaGeral = new Sala(5, "Clinica Geral", "Urgencia");
		areaCirurgicaAdultos = new Sala(6, "Area Cirurgica Adultos", "Urgencia");
		areaCirurgicaPediatria = new Sala(7, "Area Cirurgica Pediatria",
				"Urgencia");
		rx = new Sala(8, "Raio X", "Radiologia");
		tac = new Sala(9, "TAC", "Radiologia");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	String getSalas() {
		return salas.toString();
	}

	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public String getListaGeralDoentes() {
		return listaGeralDoentes.toString();
	}

	public void setListaGeralDoentes(Doente doente) {
		listaGeralDoentes.add(doente);
	}

	public String getListaAdmissaoAdultos() {
		return listaAdmissaoAdultos.toString();
	}

	public void setListaAdmissaoAdultos(Doente doente) {
		listaAdmissaoAdultos.add(doente);
	}

	public String getListaAdmissaoPediatria() {
		return listaAdmissaoPediatria.toString();
	}

	public void setListaAdmissaoPediatria(
			ArrayList<Doente> listaAdmissaoPediatria) {
		this.listaAdmissaoPediatria = listaAdmissaoPediatria;
	}

	public String getListaTriagemAdultos() {
		return listaTriagemAdultos.toString();
	}

	public void setListaTriagemAdultos(ArrayList<Doente> listaTriagemAdultos) {
		this.listaTriagemAdultos = listaTriagemAdultos;
	}

	public String getListaTriagemPediatria() {
		return listaTriagemPediatria.toString();
	}

	public void setListaTriagemPediatria(ArrayList<Doente> listaTriagemPediatria) {
		this.listaTriagemPediatria = listaTriagemPediatria;
	}

	public String getListaClinicaGeral() {
		return listaClinicaGeral.toString();
	}

	public void setListaClinicaGeral(ArrayList<Doente> listaClinicaGeral) {
		this.listaClinicaGeral = listaClinicaGeral;
	}

	public String getListaAreaCirurgicaAdultos() {
		return listaAreaCirurgicaAdultos.toString();
	}

	public void setListaAreaCirurgicaAdultos(
			ArrayList<Doente> listaAreaCirurgicaAdultos) {
		this.listaAreaCirurgicaAdultos = listaAreaCirurgicaAdultos;
	}

	public String getListaAreaCirurgicaPediatria() {
		return listaAreaCirurgicaPediatria.toString();
	}

	public void setListaAreaCirurgicaPediatria(
			ArrayList<Doente> listaAreaCirurgicaPediatria) {
		this.listaAreaCirurgicaPediatria = listaAreaCirurgicaPediatria;
	}

	public String getListaRx() {
		return listaRx.toString();
	}

	public void setListaRx() {
		this.listaRx = listaRx;
	}

	public String getListTAC() {
		return listaTAC.toString();
	}

	public void setListTAC(ArrayList<Doente> listTAC) {
		this.listaTAC = listTAC;
	}

}
