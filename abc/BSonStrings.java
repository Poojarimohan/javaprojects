package abc;

public class BSonStrings {

	public static void main(String[] args) {
		String[] names= {"mohan","basi","kl","ben","anil",
"reddaih"
	};
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names.length-i-1;j++) {
				if(names[j].compareTo(names[j+1])>0) {
					String temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;
				}
			}
		}
		for(String str:names) {
			System.out.println(str);
		}
		

}
}
