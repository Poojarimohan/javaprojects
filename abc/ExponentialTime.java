package abc;

public class ExponentialTime {

	public static int fibanocci(int n) {
		if(n<=1) {
			return n;
		}
		return fibanocci(n-1)+fibanocci(n-2);
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(fibanocci(n));
	}

}
