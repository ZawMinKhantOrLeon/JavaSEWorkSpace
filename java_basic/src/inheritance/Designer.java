package inheritance;

public class Designer {
	
	String name;
	String role;
	String email;
	String designerCode;
	
	void writeCode() {
		System.out.println(name + " is writing code");
	}
	
	void thinkALgorithm() {
		System.out.println(name+" is thinking algorithm");
	}
	
	void testing() {
		System.out.println(name+" is creating Art");
	}
}
