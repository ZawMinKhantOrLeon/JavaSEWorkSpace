package inner_nested_class;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine1 = new Machine(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Machine one is starting");
			}
			
		};
		
		machine1.start();
		Machine machine2 = new Machine() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Machine Two is Starting");
			}
			
		};
		
		machine2.start();
	}

}
