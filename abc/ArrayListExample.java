package abc;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("mumbai");
		cities.add("kerala");
		cities.add("chennai");
		
		cities.add("delhi");
		cities.add("kerala");
		System.out.println(cities);
		cities.remove(0		);
		System.out.println(cities);
		cities.set(0, "pune");
		System.out.println(cities);

	}

}
