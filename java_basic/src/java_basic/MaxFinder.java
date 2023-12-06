package java_basic;

public class MaxFinder {
	
	int max(int number1 , int number2) {
		
		System.out.println("Inside two int argus method");
		int result = number1 > number2 ? number1:number2;
		
		return result;
	}
	
	int max (int...numbers) {
		
		System.out.println("Inside int varargs method");
		int max = numbers[0];
		
		for(int number : numbers) {
			if(number > max) {
				max = number;
			}
		}
		
		return max;
	}
	


	
	static void max() {
		System.out.println("MaxFinder is to find maximum value with many versions");
	}
	
//	double max(int a , int b) {
//		return 0.0;
//	}
//	  // duplicate
	double max (double number1, double number2, double number3) {
		
		System.out.println("Inside three int argus method");
		double max =number1;
		
		if(number2 > max) {
			max =number2;
		}
		if(number3 > max) {
			max =number3;
		}
		
		return max;
		
	}
	
	String max (String str1,String str2) {
		
		System.out.println("Inside two string argus method");
		String maxStr="";
		
		for(int i =0 ; i < str1.length() ; i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
				continue;
			}
			
			if(str1.charAt(i) > str2.charAt(i)) {
				maxStr= str1;
				break;
			}else {
				maxStr= str2;
				break;
			}
		}
		return maxStr;
		
	}
	
}

