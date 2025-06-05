package abc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetCollection {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
		names.add("mohan");
		names.add("basi");
		names.add("vishnu");
		names.add("kl");
		System.out.println(names);
		names.add("mohan");
		System.out.println(names);//its not accepting duplicates
		
		/*
		Scanner sc =new Scanner(System.in);
		System.out.println("enter one name lets see its present or no:");
		String name=sc.next();
		
		if(names.contains(name)) {
			System.out.println("yes,"+name+" is present in list");
		}
		else {
			System.out.println("no,"+name+" is not present");
		}
		*/
		
		
		/*
		//converting HashSet to ArrayList
		
		ArrayList<String> nameslist=new ArrayList<>(names);
		System.out.println(nameslist);
		nameslist.add("mohan");
		System.out.println(nameslist); //arraylist allows duplicates
		
		
		*/
		
		//iterator is an interface basically it is used to printing the list elements(and also it is a layer of security)
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			String names1=itr.next();
			System.out.println(names1);
		}
			
		
	}

}
