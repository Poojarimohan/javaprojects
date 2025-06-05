package abc;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your number:");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("it is even");
		}else {
			System.out.println("it is odd");
		}

	}

}
