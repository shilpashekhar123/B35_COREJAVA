package customerexceptiondemo;

//Custom Exception for validating login
public class LoginCredentialDemo extends Exception{
	
	private String id;
	private String password;

	

	public LoginCredentialDemo(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}



	@Override
	public String toString() {
		return "LoginCredentials [id=" + id + ", password=" + password + "]";
	}



	
	
	

}
