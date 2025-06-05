package abc;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int n=sc.nextInt();
		int reversed=0;
		int temp=n;
		while(temp!=0) {
			int digit=temp%10;
			reversed=reversed*10+digit;
			temp/=10;
		}
		if(n==reversed) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}
