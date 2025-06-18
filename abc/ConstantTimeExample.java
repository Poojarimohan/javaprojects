package abc;

public class ConstantTimeExample {
	public static void Printfirstelement(int[] arr) {
		if(arr.length>0) {
			System.out.println("first element:"+arr[0]);
		}else {
			System.out.println("array is empty");
		}
	}

	public static void main(String[] args) {
		int [] num= {10,20,30,40,50,60,70,80,90,11,12,13,14,15,17};
		Printfirstelement(num);

	}

}
