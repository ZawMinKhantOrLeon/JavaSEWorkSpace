package java_basic;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Sentence : ");
		String inputTextSentence= userInput.nextLine();
		System.out.println("Enter Your Char");
		char inputTextChar= userInput.next().charAt(0);
		userInput.close();
		int count =0;
		
		for(int i = 0 ; i < inputTextSentence.length() ; i++) {
			
			if(inputTextSentence.charAt(i) != inputTextChar) {	
				continue;
			}
			count++;
			
			
		}
		
		System.out.println("Input Text Char is Found " + count + " times");
		
//		int[] numbers = {10,20,30,40,50};
//		
//		for(int number:numbers) {
//			if(number == 30) {
//				continue;
//			}
//			System.out.println(number);
//		}
	}

}
