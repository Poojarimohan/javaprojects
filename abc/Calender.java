package abc;


import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day:");
		String day=sc.nextLine().toLowerCase();
		switch(day) {
		case "monday":
			System.out.println("lets learn python");
			break;
		
		case "tuesday":
			System.out.println("lets learn java");
			break;
			
		case "wednesday":
			System.out.println("lets learn c");
			break;
			
		case "thrusday":
			System.out.println("lets learn js");
			break;
			
		case "friday":
			System.out.println("lets learn html");
			break;
			
		case "satday":
			System.out.println("lets learn sql");
			break;
			
		case "sunday":
			System.out.println("its holiday");
			break;
			
		default:
			break;
		}
		

	}

}
