package abc;

import java.util.ArrayList;
import java.util.LinkedList;

class citylist{
	 citylist() {
      ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("mumbai");
		cities.add("kerala");
		cities.add("chennai");
		cities.add("delhi");
		cities.add("kerala");
		System.out.println("List of cities:");
		System.out.println(cities);
		
	}
}

class Studentlist extends citylist{
	Studentlist() {
		
		LinkedList<String> students = new LinkedList<String>();
		students.add("Mohan");
		students.add("basi");
		System.out.println("List of students");
		System.out.println(students);
	}
}










public class AllList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Studentlist();
		//dn.ArrayList();
		

	}

}




/*
package abc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

// Base class: Demonstrates ArrayList
class ArrayListDemo {
    ArrayListDemo() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Hyderabad");
        cities.add("Mumbai");  // Duplicate allowed

        System.out.println("ArrayList (allows duplicates, maintains order):");
        System.out.println(cities);
        System.out.println();
    }
}

// Derived class: Extends ArrayListDemo and adds LinkedList & HashSet
class CollectionsDemo extends ArrayListDemo {
    CollectionsDemo() {
        // LinkedList
        LinkedList<String> names = new LinkedList<>();
        names.add("Mohan");
        names.add("Deepika");
        names.add("Ravi");

        System.out.println("LinkedList (maintains order, good for insert/delete):");
        System.out.println(names);
        System.out.println();

        // HashSet
        HashSet<String> states = new HashSet<>();
        states.add("Andhra");
        states.add("Tamil Nadu");
        states.add("Kerala");
        states.add("Andhra");  // Duplicate ignored

        System.out.println("HashSet (no duplicates, no order):");
        System.out.println(states);
        System.out.println();
    }
}

// Main class
public class AllList {
    public static void main(String[] args) {
        new CollectionsDemo();  // Constructor chaining calls ArrayListDemo
    }
}
*/
