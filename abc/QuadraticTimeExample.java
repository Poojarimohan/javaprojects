package abc;

public class QuadraticTimeExample {

	public static void main(String[] args) {
		int [] nums= {1,2,3,3,4};
		boolean hasduplicate=false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					hasduplicate=true;
					System.out.println("duplicate found: "+nums[i]);
				}
			}
		}
		if(!hasduplicate) {
			System.out.println("there is no duplicates");
		}

	}

}
