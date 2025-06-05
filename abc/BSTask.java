package abc;

import java.util.Arrays;
import java.util.Scanner;

public class BSTask {

	public static void main(String[] args) {
		String[] names= {"amit","divya","karan","priya","zoya"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		String name=sc.next();
		int index=Arrays.binarySearch(names, name);
		if(index>=0) {
			System.out.println(name+" is found at index "+index );
			
			
		}else {
			System.out.println(name +" is not found");
		}

	}

}
