package ttc;

import java.util.ArrayList;

import ttc.Station.Platform;


public class Station {

	
	private String platformTypes_ = "Not Assigned";
	
	ArrayList<Platform> Platforms_ = new ArrayList<Platform>();
	private int platformAmt_;
	private int [] LinesServed_ = {0};
	
	Station(String name, int platforms) throws Exception {
		if(platforms > 0) {
			platformAmt_ = platforms;
			for(int i = 0; i < platforms; i++) {
			//Add platforms to the arraylist
				Platform in = new Platform(i + 1);
				Platforms_.add(in);
			
			}
			
		}else {
			throw new Exception("Invalid Station Constructor, missing argument platform");
		}
		
	};
	
	//Every station needs at least 1 platform
	public class Platform{
		
		private boolean isOccupied_;
		private int platId_;
		
		//ctor, platform IDs are local to the station
		//so platform 1 is valid at many stations
		Platform(int i){
			platId_ = i;
			setOccupied_(false);
		}
		/**
		 * @return the isOccupied_
		 */
		public boolean isOccupied_() {
			return isOccupied_;
		}
		/**
		 * @param isOccupied_ the isOccupied_ to set
		 */
		public void setOccupied_(boolean isOccupied_) {
			this.isOccupied_ = isOccupied_;
		}
	}
	public void setPlatformAmt(int num) {
		platformAmt_= num;
		
	}
	public int getPlatformAmt() {
		return platformAmt_;
	}
	/**
	 * @return the linesServed_
	 */
	public int [] getLinesServed_() {
		return LinesServed_;
	}
	/**
	 * @param linesServed_ the linesServed_ to set
	 */
	public void setLinesServed_(int [] linesServed_) {
		LinesServed_ = linesServed_;
	}
	
}
	
	
	

