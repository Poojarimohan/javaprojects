package abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphTask {

	public static void main(String[] args) {
		
		Map<String,List<String>> animalhouse=new HashMap<String,List<String>>();
		animalhouse.put("Entrance", Arrays.asList("Reptile House","Bird Sanctuary","mammal Zone"));
		animalhouse.put("Reptile House",Arrays.asList("Snake pit"));
		animalhouse.put("Bird Sanctuary",Arrays.asList("Parrot Pavilion"));
		animalhouse.put("mammal Zone",Arrays.asList("Lion Den","Elephant Enclosure"));
		animalhouse.put("Snake pit",new ArrayList<String>());
		animalhouse.put("Parrot Pavilion",new ArrayList<String>());
		animalhouse.put("Lion Den",new ArrayList<String>());
		animalhouse.put("Elephant Enclosure",new ArrayList<String>() );
		
		bfs(animalhouse,"Entrance");
		//System.out.println(animalhouse);
		//for(String name:animalhouse.keySet()) {
			//System.out.println(name);
		//}

	}
	
	public static void bfs(Map<String, List<String>> house, String startroom) {
		Queue<String> queue=new LinkedList<String>();
		Set<String> visited=new HashSet<String>();
		
		queue.add(startroom);
		visited.add(startroom);
		
		while(!queue.isEmpty()) {
			String currentRoom=queue.poll();
			System.out.println("visited "+currentRoom);
			
			for(String neighbor:house.get(currentRoom)) {
				if(!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor);
				}
			}
		}
	}

}
