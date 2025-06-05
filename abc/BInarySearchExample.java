package abc;

public class BInarySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= {4,5,6,7,0,1,2};
		int target =4;
		int left=0;
		boolean found=false;
		int right=numbers.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			
		
		
		if(numbers[mid]==target) {
			System.out.println("found "+target+" at index "+mid);
			found =true;
			break;
		}
		else if(target<numbers[mid]) {
			right=mid-1;
			
		}else {
			left=mid+1;
		}
		}
		if(!found) {
			System.out.println("number "+target+" not found");
		}

		
	}

}
