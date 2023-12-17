package abstraction.interface_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PowerSystem ps= new PanasonicFan();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
		
		ps = new MiTV();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
		
		ps = new Lenovo();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
	}

}
