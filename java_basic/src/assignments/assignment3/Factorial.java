package assignments.assignment3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial());
	}
	
	public static int factorial() {
		
		System.out.println("Enter the number you want to find factorial");
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		int key=number;
		int result=1;
		for(int i=1; i <= number ; i++) {
			for(int k=i; k<=i ; k++) {
				result *=i;
			}
		}
		userInput.close();
		return result;
	}
	

}
