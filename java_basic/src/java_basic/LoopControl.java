package java_basic;

import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] luckyNumbers = {22,45,89,14,11,99,78,54,41,33};
		Scanner userInput = new Scanner(System.in );// return object which we can take data from console);
		
		while(true) {
		
			System.out.println("Enter Your Number");
			int myNumber= userInput.nextInt();
			
			
			boolean found=false;
			int index=-1;
			int count=0;
			for(int i=0; i < luckyNumbers.length ; i++) {
				count++;
				if(luckyNumbers[i] == myNumber) {
					found=true;
					index=i;
					break;
					
				}
			
				
			}
			String result = found ? myNumber + " is found at " + index : myNumber + " is not found";
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
