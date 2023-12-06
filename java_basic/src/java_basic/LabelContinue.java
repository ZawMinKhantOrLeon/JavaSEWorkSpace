package java_basic;

import java.util.Scanner;

public class LabelContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter The Sentence");
		String sentence = userInput.nextLine();
		System.out.println("Enter Search String");
		String searchString =userInput.nextLine();
		userInput.close();
		
		int max= sentence.length() - searchString.length();
		
	}

}
