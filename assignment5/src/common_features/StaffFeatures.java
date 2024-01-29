package common_features;

abstract public class StaffFeatures {
	
	public String name;
	public String phone;
	public String address;
	public String role;
	public String year;
	
	public StaffFeatures(String name, String phone, String address, String role,String year) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.role = role;
		this.year = year;
	}
	abstract public void breakTime();
	abstract public void meetingTime();
	abstract public void holidayTime();
	abstract public void teachingTime();
	abstract public void payCheck();
	abstract public void staffDetail();
}
