package finance;

public class UserFinance {
	
	 private Long balance;
	 private String date;
	 private Long userId;
	 
	 
	 
	 public UserFinance(Long balance, String date,  Long userId) {
		super();
		this.balance = balance;
		this.date = date;
		this.userId = userId;
	}

	public Long addBalance() {
		 return 1L;
	 }
	 
	 public Long withdrawel() {
		 return 1L;
	 }
}

