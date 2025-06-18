package abc;

public class LinearTimeExample {
	
	public static void Printallelement(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("element "+i+" : "+arr[i]);
		}
	}

	public static void main(String[] args) {
		int [] num= {10,20,30,40,50,60,70,80,90,11,12,13,14,15,17};
		Printallelement(num);

	}

}
