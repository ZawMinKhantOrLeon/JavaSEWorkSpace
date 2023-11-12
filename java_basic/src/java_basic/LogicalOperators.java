package java_basic;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=15;
		int y=20;
		int z=30;
		
		boolean result1 = x < y && y > z;
		System.out.println(result1);
		
		boolean result2 = x > y || y > z;
		System.out.println(result2);
		
		boolean result3 = !(x > y);
		System.out.println(result3);
	}

}
