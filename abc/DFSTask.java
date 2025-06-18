package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSTask {
	
	private Map<String,List<String>> circle=new HashMap<String, List<String>>();
	private Set<String> visited=new HashSet<String>();
	public void addperson(String person,String connectedperson) {
		circle.computeIfAbsent(person, k-> new ArrayList<>()).add(connectedperson);
		circle.computeIfAbsent(connectedperson,k -> new ArrayList<>()).add(person);	
	}
	public void dfs(String currentperson) {
		if(visited.contains(currentperson)) return;
		
		visited.add(currentperson);
		System.out.println("Visited: "+currentperson);
		
		for(String neighbor:circle.getOrDefault(currentperson, new ArrayList<String>())) {
			dfs(neighbor);
		}
	}
	
	public static void main(String[] args) {
		DFSTask ds=new DFSTask();
		ds.addperson("kl","virat");
		ds.addperson("kl","rohith");
		ds.addperson("virat", "dhoni");
		System.out.println("DFS Traversal starting from person kl");
		ds.dfs("kl");

	}

}
