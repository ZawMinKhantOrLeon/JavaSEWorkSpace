package java_basic;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String [] fruits= {"Apple","Orange","Banana","Papaya","Kiwi"};
		
		
		// good practice;
		for(String tempVar:fruits) {
			System.out.println(tempVar);
		}
		
		//bad practice
		
//		for (int i = 0; i < fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
		//nested loop
		
//		System.out.println("Pattern Program");
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter A Pattern : ");
//		int pattern= userInput.nextInt();
//		userInput.close();
//		
//		for(int i=1 ; i <= pattern ; i++) {
//			for( int k=1 ; k <= pattern ; k++) {
//				System.out.printf("%d ", i);
//			}
//			System.out.println("");
//		}
//		
		
//		
//		for(int i=0; i < 4 ; i++) {
//			System.out.printf("%s ", " * ");
//			
//		}
//		System.out.println("");
//		for(int i=0; i < 4 ; i++) {
//			System.out.printf("%s ", " * ");
//			
//		}
//		System.out.println("");
//		for(int i=0; i < 4 ; i++) {
//			System.out.printf("%s ", " * ");
//			
//		}
//		System.out.println("");
//		for(int i=0; i < 4 ; i++) {
//			System.out.printf("%s ", " * ");
//			
//		}
		
		// infinity loop
		
//		int i=1;
//		for(;;) {
//			System.out.println(i++);
//			
//		}
		
//		for(int i = 10000 ; i >=10 ; i-=10) {
//			System.out.println(i);
//		}
		
//		System.out.println("Prime Finder");
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter A Integer Number");
//		int number= userInput.nextInt();
//		userInput.close();
//		
//		int count=0;
//		int loopTime=0;
//		for(int i = 1 ; i <= number ; i++) {
//			loopTime++;
//			if(number % i == 0) {
//				count++;
//			}
//			
//		}
//		
//		System.out.println( count == 2 ? "It is prime number" :"It is not prime number");
//		System.out.printf("Loop Time :  %d%n " , loopTime);
		
//		int i=1;
//		for(; i <=1000 ;i++,System.out.println("Current I value : " + i)) System.out.println(i);
//		
//		System.out.printf("Final Value of i = %d%n",i);
//		
	//	for(int i=1; i <=1500 ;i++) System.out.println(i+ " I Love You");
	}

}
