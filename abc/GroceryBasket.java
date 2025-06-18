package abc;

import java.util.HashMap;

public class GroceryBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> fruits=new HashMap<String, Integer>();
		fruits.put("apples", 40);
		fruits.put("mangoes", 30);
		fruits.put("pineapple", 50);
		fruits.put("grapes", 80);
		fruits.put("guava", 100);
		int cost=0;
		
		System.out.println(fruits);
		for(Integer n:fruits.values()) {
			cost=cost+n;
		}
		System.out.println("total cost is "+cost);
		fruits.replace("apples",40, 100);
		System.out.println(fruits);
		System.out.println();
		fruits.remove("grapes");
		System.out.println(fruits);
	}

}
