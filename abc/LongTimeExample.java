package abc;

public class LongTimeExample {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6};
		int target=5;
		int low=0;
		int high=nums.length-1;
		while(low<high) {
			int mid=low+high/2;
			if(nums[mid]==target) {
				System.out.println("found numbare "+target+" at postion "+mid);
			}
			else if(nums[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.println("number not found");

	}

}
