package assignments.assignment2;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternTwo();
	}
	
    public static void PatternTwo() {
		
		Scanner userInput = new Scanner(System.in);
		int pattern = userInput.nextInt();
		for( int i=1; i <= 5 ;i++) {
			for(int k = 1; k <= 5 ; k++) {
				System.out.print((i+k) % 2);
				
			
			
			 System.out.println(" ");
		}
		
	}
    };

}
