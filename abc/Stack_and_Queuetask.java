package abc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_and_Queuetask {

	public static void main(String[] args) {
		
		Stack<String> toybox=new Stack<String>();
		toybox.push("ball");
		toybox.push("blocks");
		toybox.push("puzzle");
		System.out.println("the top toy is"+toybox.peek());
		System.out.println("the toy being played"+toybox.pop());
		System.out.println("remaining:"+toybox);
		Queue<String> iceline=new LinkedList<String>();
		iceline.add("Maya");
		iceline.add("Leo");
		iceline.add("Nina");
		System.out.println("the first icecream served for"+iceline.poll());
		System.out.println("after serving the line is"+iceline);
		
		

	}

}
