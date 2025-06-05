package mohan;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<String>();
		
		while(true) {
			System.out.println("simple to-do list app");
			System.out.println("1.Add a task");
			System.out.println("2.view a task");
			System.out.println("3.delete a task");
			System.out.println("4.exit");
			System.out.println("choose an option(1-4)");
			
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.println("enter your task");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("Tasks added sucessfully");
				
				
			}
			
			else if(choice==2) {
				if(tasks.isEmpty()) {
					System.out.println("nothing to view");
				}else {
					 System.out.println("Enter task number to view (1 to " + tasks.size() + "): ");
	                    int tasknum = sc.nextInt();
					if (tasknum >= 1 && tasknum <= tasks.size()) {
                        System.out.println("Task " + tasknum + ": " + tasks.get(tasknum - 1));
                    } else {
                        System.out.println("Invalid task number.");
                    }
					
				}
				
				
			}
			else if(choice==3) {
				if(tasks.isEmpty()) {
					System.out.println("nothing to view");
				}else {
					System.out.println("enetr task number to delete");
					int tasknum=sc.nextInt();
					if(tasknum>=1 && tasknum<tasks.size()) {
						tasks.remove(tasknum-1);
						System.out.println("Task deleted");
					}else {
						System.out.println("invalid number");
					}
				}
			}
			else if(choice==4) {
				System.out.println("good bye...!");
				break;
			}
			else {
				System.out.println("please choose a good validation");
			}
			
		}
		
		sc.close();
		
		
		

	}

}
