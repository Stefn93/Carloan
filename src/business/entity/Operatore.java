package business.entity;

public class Operatore extends Profilo {
	protected Agenzia agenzia;

	public Agenzia getAgenzia() {
		return agenzia;
	}

	public void setAgenzia(Agenzia agenzia) {
		this.agenzia = agenzia;
	}
	
	public String toStringAsPersona() {
		return super.toStringAsPersona();
	}
	
	
	public String toString() {
		return super.toString() + ", " + agenzia.getIdAgenzia();
	}
}