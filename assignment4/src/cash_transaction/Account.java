package cash_transaction;

public class Account {
	
	 private String name;
	 private Boolean userId;
	 private String accountNumber;
	 private String financeId;
	 
	
	
	public Account(String name, Boolean userId, String accountNumber, String financeId) {
		super();
		this.name = name;
		this.userId = userId;
		this.accountNumber = accountNumber;
		this.financeId = financeId;
	}



	public boolean transaction() {
		return true;
	}

	
}
