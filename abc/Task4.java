package abc;

import java.util.Collections;
import java.util.TreeSet;

public class Task4 {

	public static void main(String[] args) {
		
		TreeSet<String> employees=new TreeSet<String>(Collections.reverseOrder());
		employees.add("sumit");
		employees.add("karan");
		employees.add("anjali");
		employees.add("mohan");
		employees.add("zoya");
		
		System.out.println(employees);
		for(String name:employees) {
			System.out.println(name);
		}

	}

}
