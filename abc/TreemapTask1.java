package abc;

import java.util.TreeMap;

public class TreemapTask1 {

	public static void main(String[] args) {
		
		TreeMap<String, String> capital=new TreeMap<String, String>();
		capital.put("india", "new delhi");
		capital.put("usa", "washington");
		capital.put("germany","berlin");
		capital.put("japan", "tokyo");
		capital.put("india", "delhi");
		System.out.println(capital);
		System.out.println(capital.firstKey());
		System.out.println(capital.lastKey());
		System.out.println(capital.higherKey("india"));
		System.out.println(capital.lowerKey("usa")); 

	}

}
