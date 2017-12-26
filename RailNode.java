package ttc;

public class RailNode {

	private int Id_;
	private boolean isOccupied;
	private String Name_;
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
	RailNode(int Id, String Name){
		setId(Id);
		isOccupied = false;
		Name_ = Name;
		
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
	
	
	

	
}
