package abc;

abstract class Machine{
	abstract void ATM();
	void ATM2() {
		System.out.println("ATM using java with php");
	}
}
class Bank extends Machine{
	void ATM() {
		System.out.println("ATM using Java");
	}
}
public abstract class AbstractExample {
	

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.ATM();
		
		b.ATM2();
	}

}
