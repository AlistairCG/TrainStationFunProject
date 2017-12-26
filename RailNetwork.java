package ttc;
import java.util.LinkedList;
//Original Implementation via tutorial: 
//https://www.geeksforgeeks.org/graph-and-its-representations/

//Tentative Graph Structure
public class RailNetwork {

	private int Nodes_;
	private String Name_;

	LinkedList<RailNode> LTTC[];
	
	@SuppressWarnings("unchecked")
	RailNetwork(int Nodes, String Name) throws Exception{
		if(Name != "" && Nodes_ > 0) {
			setName_(Name);
			
			//assign lists
			Nodes_ = Nodes;
			
			LTTC = new LinkedList[Nodes];
			
			//Give every node a usable linked list to point to other nodes.
			for(int i = 0; i < Nodes_; i++) {
				LTTC[i] = new LinkedList<RailNode>();
			}
		
		}else {
			throw new Exception("Invalid RailNetwork Constructor, check arguements");
		}
		
		
	}
	//Makes the network by adding nodes into the graph
	public void addNode(RailNetwork net, RailNode src, RailNode dest) {
		//add the handed element to the back of the list for the given source
		net.LTTC[src.getId()].add(dest);
		//adds the element unidirectionally
		net.LTTC[dest.getId()].add(src);
		
	}
	/**
	 * @return the name_
	 */
	public String getName_() {
		return Name_;
	}
	/**
	 * @param name_ the name_ to set
	 */
	public void setName_(String name_) {
		Name_ = name_;
	}
//Tester, check that rail nodes are being created
	public static void main(String args[]) {
		
		
		
		
		
		
	}


}
