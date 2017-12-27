package ttc;

//A station node extends rails nodes by providing traffic control while simplifying path finding
public class StationNode extends RailNode {
	String stationName_;
	
	//Override getName for Stations.
	public String getName_() {
		return stationName_;
	}
	StationNode(int Id, String Name) {
		super(Id, Name);
		stationName_ = Name;
	}
	
	

}
