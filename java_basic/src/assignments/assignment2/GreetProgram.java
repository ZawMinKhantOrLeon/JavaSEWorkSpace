package assignments.assignment2;

import java.util.Scanner;

public class GreetProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			greet();
	}
	public static void greet() {
		Scanner userInput = new Scanner(System.in);
		String user = userInput.nextLine();
		System.out.println(" Hello " + user);
	}
}
