package abc;

public class BUbbleSortTask {

	public static void main(String[] args) {
		int [] numbers= {5,3,8,4,2};
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-i-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		System.out.println("sorted list");
		for(int num:numbers) {
			System.out.println(num);
		}
		

	}

}
