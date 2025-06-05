package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> mobilephones=new ArrayList<String>();
		mobilephones.add("oneplus");
		mobilephones.add("iphone");
		mobilephones.add("nokia");
		mobilephones.add("samsung");
		mobilephones.add("vivo");
		mobilephones.add("redmi");
		mobilephones.add("lava");
		mobilephones.add("nothing");
		
		
		/*Collections.sort(mobilephones);
		for(int i=0;i<mobilephones.size();i++) {
			System.out.println(mobilephones.get(i));
		}*/
		
		/*
		Collections.reverse(mobilephones);
		for(int i=0;i<mobilephones.size();i++) {
			System.out.println(mobilephones.get(i));
		}
		*/
		System.out.println("enter one mobile phone name i will check if it present or no in list:");
		String phone=sc.next();
		if(mobilephones.contains(phone)) {
			System.out.println("yes,"+phone+" is present in list");
		}
		else {
			System.out.println("no,"+phone+" is not present");
		}
		/*
		mobilephones.remove(2);//System.out.println(mobilephones.remove(2));
		mobilephones.remove("lava");//System.out.println(mobilephones.remove("lava"));
		
		for(int i=0;i<mobilephones.size();i++) {
			System.out.println(mobilephones.get(i));
		}
		*/
		
	}

}
