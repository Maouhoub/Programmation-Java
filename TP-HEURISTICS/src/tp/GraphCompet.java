package tp;

import java.util.HashMap;
import java.util.Map;

public class GraphCompet 
{
	private Map<Integer, Sommet> Graph ;
	
	public GraphCompet(int capacity)
	{
		this.Graph = new HashMap<Integer, Sommet>(capacity);
		
		for (int i = 1; i <= capacity; ++i)
		{
			//System.out.println(capacity-i-1);
			this.Graph.put(i, new Sommet(i, capacity-i));
			
		}
		for(int i = 1; i <= capacity; i++)
		{
			Sommet sommet = this.Graph.get(i);
			for(int j = i+1, r = 0; r< capacity-i && j <= capacity; j++, r++)
				sommet.getVoisinage().get(r).setExtDeux(this.Graph.get(j));
			
			
		
			
		}
	}

	public Map<Integer, Sommet> getGraph() {
		return Graph;
	}

	public void setGraph(Map<Integer, Sommet> graph) {
		Graph = graph;
	}
	

}
