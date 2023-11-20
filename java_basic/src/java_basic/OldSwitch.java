package java_basic;

import java.util.Scanner;

public class OldSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput =new  Scanner(System.in);
		System.out.println("Enter a number : 1 to 7 : ");
		int day =userInput.nextInt();
		userInput.close();
		
		
		switch (day) {
		case 1 : case 2 : case 3 : case 4 : case 5 : System.out.println("Sad Week day");
			  break;
		case 6 : case 7 : System.out.println("Happy weekend");
		      break;

		default:System.out.println("Invalid Data");
			break;
		}
		
	
		
		
//		switch(day) {
//			 
//		case 1 :
//			System.out.println("Sad Monday");
//			break;
//		
//		case 2:
//			System.out.println("Boring Tuesday");
//			break;
//		
//		case 3 :
//			System.out.println("Active Wednesday");
//			break;
//		
//		case 4 :
//			System.out.println("Hopeful Thurday");
//			break;
//		
//		case 5 :
//			System.out.println("Happy Friday");
//			break;
//		
//		case 6 :
//			System.out.println("Drinking Saturday");
//			break;
//		
//		case 7 :
//			System.out.println("Sleeping Sunday");
//			break;
//		
//		default :  System.out.println("Invalid Data"); break ;
//		}
//		
		
		System.out.println("Out Of Switch");
	}

}
