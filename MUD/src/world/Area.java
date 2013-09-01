/**
 * 
 */
package world;

import java.util.List;

/**
 * @author ryan
 *
 */
public class Area {
	private String name;
	private String description;
	private List<Room> rooms;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the rooms
	 */
	public List<Room> getRooms() {
		return rooms;
	}
	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
