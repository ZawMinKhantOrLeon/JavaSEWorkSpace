package lambda;

public class SimpleLambda {
	
	static void generateKey(int key , Randomizer random) {
		System.out.print(key* random.random());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculateable add = (n1,n2) -> n1+n2;
		double result = add.calculate(1, 2);
		
		
		Calculateable sub = (n1,n2) -> n1-n2;
		double subResult = sub.calculate(1, 2);
		System.out.println(subResult);
		
		Randomizer rand = () -> (int) (Math.random()*1000)+1;
		System.out.println("rand : " +rand.random());
		
		
		generateKey(31,rand);
	}

}
