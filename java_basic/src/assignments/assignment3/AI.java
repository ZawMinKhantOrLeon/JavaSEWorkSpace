package assignments.assignment3;

import java.util.Scanner;

public class AI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		askQuestion();
	}
	
	public static void askQuestion() {
		Scanner userInput = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("1.ask my name 2.ask about my fav novel 3.I like villain then heros do you want to know why? 4.who am i?");
			int decision = userInput.nextInt();
			
			if (decision == 1) {
				System.out.println("My name is Zaw Min Khant");
			} 
			else if (decision == 2){
				System.out.println("Lord of mystery");
			}
			
			else if (decision == 3){
				System.out.println("Because one small mistake and the hero is done for");
			}
			
			else if(decision == 4){
				System.out.println("You are no one until you  become your trueself..in summery you are you...nothing more");
			}
			
			else {
				System.out.println("Please ask valid question");
			}
			
			System.out.println("Do you want to continue? yes/y - no/n");
			char endWhile = userInput.next().charAt(0);
			
			if(endWhile == 'n') {
				userInput.close();
				break;
			}
		}
	}

}