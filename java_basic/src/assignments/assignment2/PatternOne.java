package assignments.assignment2;

import java.util.Scanner;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			PatterOne();
	}
	
	public static void PatterOne() {
		
		Scanner userInput = new Scanner(System.in);
		int pattern = userInput.nextInt();
		for( int i=1; i <= 5 ;i++) {
			for(int k = 1; k <= 5 ; k+=1) {
				System.out.printf(" %d " , i*k);
				
			}
			
			 System.out.println(" ");
			
		}
		
	}

}
