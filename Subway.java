package ttc;

public class Subway {

	//A single subway object. Should be controlled by a subwayLine controller...
	
	//False = closed vice versa.
	boolean doors_;
	
	private String destination_ = "Not Assigned";
	private String origin_ = "Not Assigned";
	private String currentStation_ = "Not Assigned";
	private String line_ = "Not Assigned";
	
	public static void Move() {}; //todo
	public static void Stop() {}; //todo
	
	//=========Setters and Getters==========//
	public void setCurrentStation(String Stat) {
		currentStation_ = Stat;
	};
	public String getCurrentStation() {
		return currentStation_;
	};
	public void setDestination_(String dest) {
		destination_ = dest;
	}
	public String getDestination_() {
		return destination_;
	}
	public String getOrigin_() {
		return origin_;
	}
	public void setOrigin_(String origin) {
		origin_ = origin;
	}

	public String getLine_() {
		return line_;
	}
	
	public void setLine_(String line) {
		line_ = line;
	}

	//===========================//
	


}
