package abc;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollectionExample {

	public static void main(String[] args) {
		HashMap<Integer, String> students=new HashMap< >();
		students.put(3344,"mohan");
		students.put(3392, "basi");
		students.put(3390, "vishnu");
		students.put(3327, "jayanthi");
		students.put(3388, "venky");
		students.put(0000,"unknown");
		System.out.println(students);
		//students.remove(0000);

		
		students.replace(0000, "kl");
		System.out.println(students);
		
		
		for(String id:students.values()){
			System.out.println(id);
		}
		
		
		for(Integer id:students.keySet()){
			System.out.println(id);
		}
		
		for (Integer key : students.keySet()) {
		    System.out.println( key + " "+ students.get(key));
		}



	}

}
