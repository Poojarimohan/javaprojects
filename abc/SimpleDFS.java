package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SimpleDFS {
	private Map<String,List<String>> homeMap=new HashMap<String, List<String>>();
	private Set<String> visited=new HashSet<String>();
	public void addRoom(String room,String connectedroom) {
		homeMap.computeIfAbsent(room,k-> new ArrayList<>()).add(connectedroom);
		homeMap.computeIfAbsent(connectedroom,k -> new ArrayList<>()).add(room);
	}
		public void dfs(String currentroom){
			if(visited.contains(currentroom)) return;
			
			visited.add(currentroom);
			System.out.println("Visited: "+currentroom);
			
			for(String neighbor:homeMap.getOrDefault(currentroom, new ArrayList<String>())) {
				dfs(neighbor);
			}
		
		
	}

	public static void main(String[] args) {
		
		 SimpleDFS home=new SimpleDFS();
		 home.addRoom("living Room", "kitchen");
		 home.addRoom("living Room","bedroom");
		 home.addRoom("bedroom","bathroom");
		 System.out.println("DFS Traversal starting from living room:");
		 home.dfs("living Room");

	}

}
