package java_basic;

public class ImplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// precision loss;
//		int val1 =2123434567;
//		float val2 =val1;
//		double val3=val1;
//		
//		System.out.println(val1);
//		System.out.println(val2);
//		System.out.println(val3);
		
		long val1=3484839109399089989L;
		float val2=val1;
		double val3 =val1;
		
		System.out.println(val1);
		System.out.println(val2);
     	System.out.println(val3);
		
//		byte val1= 127;
//		short val2 =val1; // casting // implicitCasting // no data loss
		
//		int val1 = 2_100_000_000;
//		long val2 =val1;
//		
//		System.out.printf("Original Value :  %d%n" , val1);
//      System.out.printf("Converted Value :  %d%n" , val2);
		
		
		// char can only cast to int  in ImplicitCasting
//		char smallK='k';
//		int  val3 = smallK;
//		
//		System.out.println(smallK);
//		System.out.println(val3);
		
	}

}
