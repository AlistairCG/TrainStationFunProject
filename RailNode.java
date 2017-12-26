package ttc;

public class RailNode {

	private int Id_;
	private boolean isOccupied;
	/**
	 * @return the id
	 */
	public int getId() {
		return Id_;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id_ = id;
	}
	/**
	 * @return the isOccupied
	 */
	public boolean isOccupied() {
		return isOccupied;
	}

	/**
	 * @param isOccupied the isOccupied to set
	 */
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	//ctor
	RailNode(int Id){
		
		setId(Id);
		isOccupied = false;
		
	}
	
	
	

	
}
