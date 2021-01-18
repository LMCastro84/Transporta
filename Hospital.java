import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doente> doentes = new ArrayList<Doente>();
	private ArrayList<Sala> salas = new ArrayList<Sala>();

	public String getDoentes() {
		return doentes.toString();
	}

	public void setDoentes(Doente doente) {
		doentes.add(doente);
	}

	public String getSalas(){
		return salas.toString();
	}
	
	public void setSalas(Sala localizacao){
		salas.add(localizacao);
	}
}
