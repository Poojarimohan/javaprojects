package abc;

public class SortingHort {

	public static void main(String[] args) {
		String [] studs= {"vishnu","mohan","anil","basi","venky"};
		for(int i=0;i<studs.length;i++) {
			for(int j=0;j<studs.length-i-1;j++) {
				if(studs[j].compareTo(studs[j+1])>0) {
					String temp=studs[j];
					studs[j]=studs[j+1];
					studs[j+1]=temp;
				}
			}
		}
System.out.println("sorted names");
for(String name:studs) {
	System.out.print(name+" ");
}
	}

}
