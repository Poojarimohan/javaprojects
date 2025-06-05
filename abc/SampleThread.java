package abc;

//this code is for Thread implementation using thread class
/*
class Car extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
		System.out.println("BMW car moving"+i);
		
		try {
			Thread.sleep(300);
		}catch(Exception e) {
			
		}
	}}
}

class Bike extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
		System.out.println("GT bike moving"+i);
			
		try {
			Thread.sleep(300);
		}catch(Exception e) {
			
		}
		}
	}
}



public class SampleThread {

	public static void main(String[] args) {
		
		new Car().start();
		new Bike().start();

	}

}
*/



//this code is for implementation of thread 
class Car implements  Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW car moving "+i);
			try {
				Thread.sleep(300);
			}catch(Exception e) {
				
			}
		}
		
	}
}

class Bike implements  Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("GT bike moving "+i);
			try {
				Thread.sleep(300);
			}catch(Exception e) {
				
			}
		}
		
	}
}

public class SampleThread {

	public static void main(String[] args) {
		
		Thread cathread=new Thread(new Car());
		Thread bathread=new Thread(new Bike());
		System.out.println("Goo");
		cathread.run();
		bathread.run();
	}
}
