package abc;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> students=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 student names:");
		for(int i=1;i<=5;i++) {
			System.out.println("enter name of student"+i+":");
			String name=sc.nextLine();
			students.add(name);
		}
		System.out.println("List of Students are:");
		System.out.println(students);
		for(String s:students) {
			System.out.println(s);
		}
	}

}
