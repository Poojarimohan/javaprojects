package abc;

public class OOpsTask {
	private String name;
	private int rollno;
	private int marks;
	
	

	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getRollno() {
		return rollno;
	}





	public void setRollno(int rollno) {
		this.rollno = rollno;
	}





	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String checkResults() {
		if(marks>=40) {
			return "pass";
		}
		else {
			return "fail";
		}
	}
public void displaydetails() {
	System.out.println("Rollno"+getRollno());
	System.out.println("Name"+getName());
	System.out.println("Result:"+checkResults());
}




	public static void main(String[] args) {
	OOpsTask ob=new OOpsTask();
	ob.setMarks(90);
	ob.setRollno(12);
	ob.setName("Dhoni");
	ob.displaydetails(); 

	}

}
