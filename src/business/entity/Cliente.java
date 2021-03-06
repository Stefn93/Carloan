package business.entity;

public class Cliente extends Persona {
	private String codicePatente;

	public String getCodicePatente() {
		return codicePatente;
	}

	public void setCodicePatente(String codicePatente) {
		this.codicePatente = codicePatente;
	}
	
	public String toString(){
		return "'" + nome + "', '" + cognome + "', '" + dataNascita + 
				 "', '" + numTelefono + "', '" + eMail + "', '" + codicePatente + "'";
	}
}