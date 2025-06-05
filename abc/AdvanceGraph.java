package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvanceGraph {
	
	static class graph{
		private Map<Integer,List< Integer>> adjlist=new HashMap<Integer, List<Integer>>();
		
		void addedge(int u,int v) {
			adjlist.computeIfAbsent(u,k->new ArrayList<>()).add(v);
			adjlist.computeIfAbsent(v,k->new ArrayList<>() ).add(u);
		}
		void printgraph() {
			for(int node:adjlist.keySet()) {
				System.out.print("Node "+node+" is connected to:");
				for(int neighbor:adjlist.get(node)) {
					System.out.println(neighbor+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		graph g=new graph();
		g.addedge(1, 2);
		g.addedge(1, 3);
		g.addedge(1, 4);
		g.addedge(1, 4);
		g.printgraph();
		

	}

}
