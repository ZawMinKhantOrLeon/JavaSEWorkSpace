package java_basic;

import java.util.Scanner;

public class LabelBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] table = {{22,45,89},{14,11,99},{78,54,41,33}};
		Scanner userInput = new Scanner(System.in );// return object which we can take data from console);
		
		while(true) {
		
			System.out.println("Enter Your Number");
			int myNumber= userInput.nextInt();
			
			
			boolean found=false;
			int rowIndex=-1;
			int colIndex=-1;
			int count=0;
			
			search:
			for(int i=0; i < table.length ; i++) {
				count++;
				for(int j=0 ; j < table[i].length ; j++ ) {
					
					if(table[i][j] == myNumber) {
						found=true;
						rowIndex=i;
						colIndex=j;
						break search;
						
					}
				}
			
				
			}
			String result = found ? myNumber + " is found at row : " + rowIndex + " and col : " +colIndex : myNumber + " is not found";
			System.out.println(result);
			System.out.println("loop" + count + "time");
			
			System.out.println("Continue ? yes-y or no-n");
			char decision =userInput.next().toLowerCase().charAt(0);	
			if(decision == 'n') {
				
				userInput.close();
				break;
			}
			}
			
			System.out.println("Programm is Terminated");
	}

}
