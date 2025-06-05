package abc;

public class OverloadingExample {
	int calculator(int a,int b) {
		return a+b;
		
	}
	
	double calculator(double a,double b) {
		return a+b;
	}
	
	int calculator(int a,int b,int c) {
		return a+b+c;
	}

	public static  void main(String[] args) {
		
		
		OverloadingExample c=new OverloadingExample();
		System.out.println(c.calculator(10, 30));
		System.out.println(c.calculator(45.4, 2.98));
		System.out.println(c.calculator(2,3,5 ));
		//System.out.println(this.c.calculator(3.4,4.5));
	}

}
