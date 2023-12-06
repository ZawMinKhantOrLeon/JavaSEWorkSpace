package java_basic;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxFinder maxFinder= new MaxFinder();
		System.out.println("Max of 40 and 30 : " +  maxFinder.max(40, 30));
		
		MaxFinder maxFinder2= new MaxFinder();
		System.out.println("Max of 23.44 , 34.55 ,15.88 : " +  maxFinder.max(23.44, 34.55,15.88));
		
		MaxFinder maxFinder3= new MaxFinder();
		System.out.println("Max of Apple and Banana : " + maxFinder.max("Apple","Banana"));
		System.out.println("max of 10,11,20,12,16 : " + maxFinder.max(new int[] {10,11,20,12,16 }));
		MaxFinder.max();
		
	}

}
