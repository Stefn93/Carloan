package business.entity;

public class Profilo extends Persona {
	protected String username;
	protected String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toStringAsPersona() {
		return super.toString();
	}

}