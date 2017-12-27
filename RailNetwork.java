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

		if(Name != "" && Nodes > 0) {
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
	public void addNode(RailNode src, RailNode dest) {
		//add the handed element to the back of the list for the given source
		this.LTTC[src.getId()].addFirst(dest);
		//adds the element unidirectionally
		this.LTTC[dest.getId()].addFirst(src);
		
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
    static void printGraph(RailNetwork graph)
    {       
        for(int i = 0; i < graph.Nodes_; i++)
        {
            System.out.println("This Node ID "+ i);
            System.out.print("Connects to: ");
            for(RailNode Connectors: graph.LTTC[i]){
                System.out.print(Connectors.getName_()+"(" + Connectors.getId()+ ") ");
            }
            System.out.println("\n");
        }
    }
//Tester, check that rail nodes are being created
	public static void main(String args[]) {
		
		int RailNodes = 3;
		try {
			RailNetwork TTC = new RailNetwork(RailNodes, "Test");	
				RailNode src = new StationNode(0, "Source");
				RailNode Inter = new RailNode(1, "RailNode");
				TTC.addNode(src, Inter);
				RailNode dest = new StationNode(2, "Destination");
				TTC.addNode(Inter, dest);
				printGraph(TTC);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Network and Node Test Complete!");
	}


}
