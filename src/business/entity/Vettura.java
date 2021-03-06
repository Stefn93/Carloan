package business.entity;

public class Vettura implements Entity {
	private int id;
	private String targa;
	private Modello modello;
	private Agenzia agenziaLocalizzazione;
	private int chilometraggio;
	private StatoVettura stato;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Modello getModello() {
		return modello;
	}

	public void setModello(Modello modello) {
		this.modello = modello;
	}

	public Agenzia getAgenziaLocalizzazione() {
		return agenziaLocalizzazione;
	}

	public void setAgenziaLocalizzazione(Agenzia agenziaLocalizzazione) {
		this.agenziaLocalizzazione = agenziaLocalizzazione;
	}

	public int getChilometraggio() {
		return chilometraggio;
	}

	public void setChilometraggio(int chilometraggio) {
		this.chilometraggio = chilometraggio;
	}

	public StatoVettura getStato() {
		return stato;
	}

	public void setStato(StatoVettura stato) {
		this.stato = stato;
	}
	
	public String toString() {
		return "'" + targa + "', '" + modello + "', " + agenziaLocalizzazione.getIdAgenzia() + ", " + chilometraggio + ", " + stato.getIndex();
	}
}