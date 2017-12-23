package ttc;
import java.util.LinkedList;
//Original Implemention via tutorial: 
//https://www.geeksforgeeks.org/graph-and-its-representations/

//Tentative Graph Structure
public class RailNetwork {

	int vertex_;
	String Name_;

	LinkedList<RailNode> LTTC[];
	
	@SuppressWarnings("unchecked")
	RailNetwork(int vertex, String Name) throws Exception{
		if(Name != "" && vertex > 0) {
			Name_ = Name;
			
			//assign lists
			vertex_ = vertex;
			
			LTTC = new LinkedList[vertex];
			
			//Give every node a usable linked list to point to other nodes.
			for(int i = 0; i < vertex; i++) {
				LTTC[i] = new LinkedList<>();
			}
		
		}else {
			throw new Exception("Invalid RailNetwork Constructor, check arguements");
		}
		
		
	}
	//Makes the network by adding nodes into the graph
	public void addNode(RailNetwork net, int src, RailNode dest) {
		
		//add the handed element to the back of the list for the given source
		//todo unidirectional
		net.LTTC[src].add(dest);
		
		
		
		
	}

//Tester, check that rail nodes are being created
	public static void main(String args[]) {
		
		
		
		
		
		
	}

}
