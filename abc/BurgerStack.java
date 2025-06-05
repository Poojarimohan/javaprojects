package abc;

import java.util.Scanner;
import java.util.Stack;

public class BurgerStack {

	public static void main(String[] args) {
		/*
		
		Stack<String> burgerstack=new Stack<String>();
		burgerstack.push("Burger 1");
		burgerstack.push("Burger 2");
		burgerstack.push("Burger 3");
		System.out.println(burgerstack);
		System.out.println("top burger is "+burgerstack.peek());
		
		System.out.println("serving "+burgerstack.pop());
		*/
		
		Stack<String> kitchen=new Stack<String>();
		kitchen.push("Plate 1");
		kitchen.push("plate 2");
		kitchen.push("Plate 3");
		kitchen.push("plate 4");
		kitchen.push("plate 5");
		
		System.out.println(kitchen);
		Scanner sc=new Scanner(System.in);
		System.out.println("you are going to eat?");
		String action=sc.next().toLowerCase();
		if(action.equals("yes")) {
			System.out.println("take "+kitchen.peek());
			kitchen.pop();
		}
		System.out.println(kitchen);
		
		

	}

}
