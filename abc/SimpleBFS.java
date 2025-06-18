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
import java.util.Iterator;



public class SimpleBFS {

	public static void main(String[] args) {
		Map<String,List<String>> house=new HashMap<String,List<String>>();
		house.put("Living Room",Arrays.asList("kitchen","bedroom","stuudy room"));
		house.put("kitchen",Arrays.asList("bathroom"));
		house.put("bedroom", Arrays.asList("balcony"));
		house.put("study room",new ArrayList<String>());
		house.put("bathroom",new ArrayList<String>());
		house.put("balcony",new ArrayList<String>());
		
		System.out.println("Exploring the house using bfs starting from living room.");
		bfs(house,"Living Room");
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
