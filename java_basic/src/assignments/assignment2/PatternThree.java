package assignments.assignment2;

import java.util.Scanner;

public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternThree();
	}
	
    public static void PatternThree() {
		
		Scanner userInput = new Scanner(System.in);
		int pattern = userInput.nextInt();
		for( int i=1; i <= pattern ;i++) {
			 
            for( int key = i; key <= pattern ; key++) {
				
				System.out.print(" ");	
			}
			for(int k = 1; k <= i ; k++) {
				
				System.out.printf(" %s" , " *");
				
			}
			
			 System.out.println(" ");
			
		}
		
	}

}
