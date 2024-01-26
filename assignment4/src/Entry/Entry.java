package Entry;

import java.util.Scanner;

import cash_transaction.Account;
import cash_transaction.User;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		User user = new User();
		Scanner input = new Scanner(System.in);
		
		if(!user.isLogin()) {
			System.out.println("You need to login");
		}
		else {
			System.out.println("1.login 2. Register");
			int operation =  input.nextInt();
			switch (operation) {
			case 1 -> {
				System.out.println("You are login , you can now use system features");
				System.out.println("1.Finance 2. Report 3.Cash Transaction 4.Staff");
				int bankOperations = input.nextInt();
				switch (bankOperations) {
				case 1 ->System.out.println("Finance Operations");
				case 2 ->System.out.println("Report Operations");
				case 3 ->System.out.println("Cash Transaction Operations");
				case 4 ->System.out.println("Staff Operations");
				default ->
				throw new IllegalArgumentException("Unexpected value: " + bankOperations);
				}
			}
			case 2 -> System.out.println("You are registered , please login");
			default ->
			throw new IllegalArgumentException("Unexpected value: " + operation);
			}
		
		}
	}

}
