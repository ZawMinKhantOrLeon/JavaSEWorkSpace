package java_basic;

public class ValueTypeVsReferenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Before add one to array");
		printArray(array);
		System.out.println("After add one to array");
		addArrayOne(array);
		printArray(array);

		System.out.println("After add one to x");
		addOne(x);
		System.out.println("current value of x : " + x);
	}
	
	static void addOne(int x) {
		x++;
		System.out.println(x);
	}
	
	static void addArrayOne(int[] array) {
//		for( int element : array) {
//			element = element+1;
//		}
		
		for (int i = 0; i < array.length; i++) {
			array[i] ++;
		}
	}
	
	static void printArray(int[] array) {
		for( int element : array) {
			System.out.print(element + " ");
		}
		System.out.println("");
	}

}
