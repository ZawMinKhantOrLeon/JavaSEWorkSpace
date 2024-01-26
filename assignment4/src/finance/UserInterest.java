package finance;

public class UserInterest {
	
	private Long interest;
	private Long userId;
	
	
	
	public UserInterest(Long interest, Long userId) {
		super();
		this.interest = interest;
		this.userId = userId;
	}

	public Long addInterest() {
		return 1L;
	}
	
	public void terminateInterest() {
		
	}
}
