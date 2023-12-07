package inheritance;

public class Developer {
	
	String name;
	String role;
	String email;
	String developerCode;
	
	void writeCode() {
		System.out.println(name+" is writing code");
	}
	
	void thinkALgorithm() {
		System.out.println(name+" is thinking algorithm");
	}
	
	void createClassDesign() {
		System.out.println(name+" is creating class design");
	}
}
