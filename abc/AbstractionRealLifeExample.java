package abc;

abstract class car{
	abstract void start();
	abstract void drive();
	abstract void stop();
	void music() {
		System.out.println("play music");
	}
}

class key extends car{


	void start() {
		System.out.println("start the engine by start button.");
		
	}
	void drive() {
		System.out.println("drive the car");
	}
	void stop() {
		System.out.println("stop the car");
	}
	
}



public class AbstractionRealLifeExample {

	public static void main(String[] args) {
		
		key e=new key();
		
		e.start();
		
		e.drive();e.music();
		e.stop();

	}

}
 