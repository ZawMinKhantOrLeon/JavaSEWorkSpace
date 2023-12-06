package java_basic;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int instanceVar;
		Employee mgmg = new Employee(213L,"YeYe","ye@gmail.com","staffe",1200.33);
		
		//this.instanceVar=10000000;  cannot use this in main or static method;
		
		System.out.println("MgMg's Information");
		System.out.println("Id : " +mgmg.id);
		System.out.println("Name : " +mgmg.name);
		System.out.println("Email : " +mgmg.email);
		System.out.println("Role : " +mgmg.role);
		System.out.println("Salary : " +mgmg.salary);
		
//		mgmg.id =1001L;
//		mgmg.name="Mg Mg";
//		mgmg.email="M@gmail.com";
//		mgmg.role= "Manager";
//		mgmg.salary=3000.456;
//		
//		
//		System.out.println("MgMg's Information");
//		System.out.println("Id : " +mgmg.id);
//		System.out.println("Name : " +mgmg.name);
//		System.out.println("Email : " +mgmg.email);
//		System.out.println("Role : " +mgmg.role);
//		System.out.println("Salary : " +mgmg.salary);
//		
//		
//		mgmg.update(101L, "JustinMg", "J123@gmail.com","GM" , 9000.123);
//		
//		System.out.println("MgMg's Information after update");
//		System.out.println("Id : " +mgmg.id);
//		System.out.println("Name : " +mgmg.name);
//		System.out.println("Email : " +mgmg.email);
//		System.out.println("Role : " +mgmg.role);
//		System.out.println("Salary : " +mgmg.salary);
		
	}

}
