package common_features;

abstract public class StudentFeatures {
	
	public String name;
	public String email;
	public String phone;
	public String address;
	public String year;
	
	
	
	public StudentFeatures(String name, String email, String phone, String address, String year) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.year = year;
	}
	abstract protected void studyTime();
	abstract protected void lunchBreak();
	abstract protected void studyBreakTime();
	abstract protected void holiday();
	abstract protected void studentDetail();
	
}
