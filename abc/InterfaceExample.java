package abc;

interface printable{
	void print();
	
}
class Msg implements printable{
	public void print() {
		System.out.println("hello from interface");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Msg m=new Msg();
		m.print();
	}
}
 