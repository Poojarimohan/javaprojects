package abc;

import java.util.ArrayList;

public class ArraylistAdventure {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("kl");
		arr.add("virat");
		arr.add("abd");
		arr.add("maxi");
		arr.add("pat");
	    System.out.println(arr);
	    arr.remove(2);
	    System.out.println(arr);
	    arr.set(1, "kohli");
	    System.out.println(arr);
	}

}
