package ttc;

import java.util.ArrayList;

import ttc.Station.Platform;


public class Station {

	//A E S T H E T I C 
	private String platformTypes_ = "Not Assigned";
	
	ArrayList<Platform> Platforms_ = new ArrayList<Platform>();
	private int platformAmt_;
	
	
	
	Station(String name, int platforms) throws Exception {
		if(platforms > 0) {
			for(int i = 0; i < platforms; i++) {
				//Add platforms
			Platform in = new Platform(i + 1);
			Platforms_.add(in);
			}
		}else {
			throw new Exception("Invalid Station Constructor");
		}
		
	};
	
	//Every station needs a platform
	public class Platform{
		
		boolean isOccupied_;
		public int platId_;
		
		Platform(int i){
			platId_ = i;
			isOccupied_ = false;
	
		}
		
		
	}
	
	public void setPlatformAmt(int num) {
		platformAmt_= num;
		
	}
	public int getPlatformAmt() {
		return platformAmt_;
	}
	
	
	
	
	
}
