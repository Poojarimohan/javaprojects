package abc;

import java.util.*;

public class TreemapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();

        marks.put("dhoni", 89);
        marks.put("kl", 99);
        marks.put("mohan", 100);
        marks.put("rohith", 88);
        marks.put("virat", 90);

        System.out.println(marks);  
        System.out.println();
        System.out.println("enter student name to find marks:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        if(marks.containsKey(name)) {
        	System.out.println(name + " marks is " + marks.get(name));
        }else {
        	System.out.println(name+" doesn't exit");
        }
        int i;
        
        
        
   
    	   
    	   
    	   
       }
}

