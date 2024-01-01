package lambda;

public class BlockLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testable leapYear = y -> {
			
			if((y % 400 == 0) || (y % 4 == 0 & y % 100 != 0)) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println( leapYear.test(2024L) ?  "Yes leap " : "No leap");
		
//		Testable factorial = n -> {
//			
//			if(n <= 20) {
//				Long result = 1L;
//				
//				for(Long i =1L ; i <= n ; i++) {
//					result *=i;
//				}
//				System.out.println("n! =" + result);
//				return true;
//			}
//			else {
//				System.out.println("Cant find factorial");
//				return false;
//			}
//		};
//		
//		if(factorial.test(18L)) {
//			System.out.println("Your number is a factorial");
//		}else {
//			System.out.println("Your number is not a factorial");
//		}
	}

}
