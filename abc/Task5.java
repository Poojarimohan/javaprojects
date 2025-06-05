package abc;

import java.util.Scanner;
import java.util.TreeSet;

public class Task5 {

	public static void main(String[] args) {
		
		TreeSet<String> products=new TreeSet<String>();
		products.add("keyboard");
		products.add("mouse");
		products.add("moniter");
		products.add("cpu");
		products.add("webcam");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product name:");
		String name=sc.next();
		if(products.contains(name)) {
			System.out.println(name+" is present in set");
		}else {
			System.out.println(name+" is not present in set");
		}
		
		
		

	}

}
