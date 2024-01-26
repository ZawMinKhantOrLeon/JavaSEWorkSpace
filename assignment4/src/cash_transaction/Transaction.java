package cash_transaction;

public class Transaction {
	public Integer amount;
	public Long userId;
	public Integer to;
	public String Date;
	
	public Transaction(Integer amount, Long userId, Integer to, String date) {
		super();
		this.amount = amount;
		this.userId = userId;
		this.to = to;
		Date = date;
	}
	
	public void transaction() {
		
	}
}
