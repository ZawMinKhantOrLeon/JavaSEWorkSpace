package cash_transaction;

public class User {
	public String name;
	public String email;
	public String phone;
	public String password;
	public String address;
	public String accountId;

	
	public User() {
		
	}
	
	public User(String name, String email, String phone, String password, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.address = address;
	}
	
	public boolean Register() {
		return true;
	}
	
     public boolean Login() {
		return true;
	}
	
	public boolean Logout() {
		return true;
	}
	
	public boolean isLogin() {
		return true;
	}
	
}
