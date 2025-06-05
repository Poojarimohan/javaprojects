package abc;

import java.util.LinkedList;
import java.util.Queue;


public class SampleQueue {

	public static void main(String[] args) {
		
		Queue<String> students=new LinkedList<String>();
	
		students.add("Student 1");
		students.add("Student 2");
		students.add("student 3");
		System.out.println(students);
		String firstout=students.poll();
		System.out.println(firstout);
		System.out.println(students);
		
				
		

	}

}
