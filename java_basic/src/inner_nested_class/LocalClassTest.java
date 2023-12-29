package inner_nested_class;

public class LocalClassTest {
	
	static void checkPhoneNumber(String phNo1,String phNo2) {
			
		class PhoneNoChecker{
			long phNo1Length = phNo1.length();
			long phNo2Length = phNo2.length();
			
			boolean isPhNo1Valid() {
				return phNo1.startsWith("09") && phNo1.length() == 11;
			}
			
			boolean isPhNo2Valid() {
				return phNo2.startsWith("09") && phNo2.length() == 11;
			}
		}
		
		PhoneNoChecker phoneNoChecker = new PhoneNoChecker();
		if(phoneNoChecker.isPhNo1Valid()) {
			System.out.println("Phone number one is valid ") ;
		}
		else {
			System.out.println("Phone number one is not valid "); 
		}
		if(phoneNoChecker.isPhNo2Valid()) {
			System.out.println("Phone number two is valid ");
			
			}
		else {
			System.out.println("Phone number two is not valid "); ;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPhoneNumber("09234553221","894134411");
	}
	
	

}
