package java_basic;

public class MethodAccess {
	
	static int staticVar =50000;
	int instanceVar=10000;
	
	static void staticMethod() {
		System.out.println("Inside Static Method");
	}
	
	void instanceMethod() {
		System.out.println("Inside Instance Method");
		System.out.println(staticVar);
		staticMethod();
	}
	
	static void testReturn(int value) {
		if(value > 100) {
			return;
		}
		System.out.println("Ohter statment of this method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testReturn(10);
		
//		MethodAccess methodAccess = new MethodAccess();
//		System.out.println(methodAccess.instanceVar);
//		methodAccess.instanceMethod();
//		
//		System.out.println(staticVar);
//		staticMethod();
	}
	

}
