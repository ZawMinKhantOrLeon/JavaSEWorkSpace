package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programmer programmer = new Programmer();
		Developer programmer = new Developer();
		 programmer.email = "m@gmail.com";
		 programmer.name= "mgmg";
		 programmer.role = "junior developer";
		 programmer.developerCode= "D101";
		 
		 programmer.writeCode();
		 programmer.thinkALgorithm();
		 programmer.createClassDesign();
		 
		 System.out.println("Role is : " + programmer.role);
		 System.out.println("Email is : " + programmer.email);
		 System.out.println("Code is : " + programmer.developerCode);
	}

}