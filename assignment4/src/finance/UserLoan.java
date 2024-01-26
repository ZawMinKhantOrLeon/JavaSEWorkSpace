package finance;

public class UserLoan {
	
	private Long loan;
	private Long userId;
	
	public UserLoan() {
		
	}
	
	public UserLoan(Long loan, Long userId) {
		super();
		this.loan = loan;
		this.userId = userId;
	}
	
	public Long addLoan() {
		return 1L;
	}
	
	public String dueDate() {
		return "date";
	}

	
	
	
	
}
