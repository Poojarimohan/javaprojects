package abc;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] names=new String[n];
		System.out.println("enter names:");
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
		
		Arrays.sort(names);
		System.out.println();
		System.out.println("after sorting");
		
		for(String str:names) {
			System.out.println(str);
		}
		
		

	}

}
