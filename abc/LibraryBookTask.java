package abc;

import java.util.TreeSet;

public class LibraryBookTask {

	public static void main(String[] args) {
		
		TreeSet<Integer> book_ids=new TreeSet<Integer>();
		book_ids.add(5002);
		book_ids.add(4998);
		book_ids.add(5005);
		book_ids.add(4999);
		book_ids.add(5001);
		
		System.out.println(book_ids);
		
		System.out.println(book_ids.getFirst());
		System.out.println(book_ids.getLast());
		System.out.println(book_ids.higher(4999));
		System.out.println(book_ids.lower(5005));

	}

}
