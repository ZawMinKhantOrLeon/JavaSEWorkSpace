package java_basic;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput =new  Scanner(System.in);
		System.out.println("Enter Operand One : ");
		double operand1 =userInput.nextDouble();
		System.out.println("Enter Operand Two : ");
		double operand2=userInput.nextDouble();
		System.out.println("Enter Operator : + - * / %");
		char operator = userInput.next().charAt(0);
		userInput.close();
		
		double result = 0.0;
		
		switch (operator) {
		case '+': result = operand1+ operand2;
			break;
		case '-': result = operand1 - operand2;
		    break;
		case 'x': result = operand1 * operand2;
	    	break;
		case '/': result = operand1 / operand2;
	    	break;
		case '%': result = operand1 % operand2;
	    	break;
		default: result =0.0;
			break;
		}
		
		System.out.printf("Result is %.3f %c %.3f = %.3f " ,operand1,operator,operand2,result);
	}

}
