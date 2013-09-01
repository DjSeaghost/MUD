/**
 * 
 */
package world;

/**
 * @author ryan
 *
 */
public class Room {
	private String name;
	private String description;
	private String exits;
	private String flags;
	
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
	 * @return the exits
	 */
	public String getExits() {
		return exits;
	}
	/**
	 * @param exits the exits to set
	 */
	public void setExits(String exits) {
		this.exits = exits;
	}
	/**
	 * @return the flags
	 */
	public String getFlags() {
		return flags;
	}
	/**
	 * @param flags the flags to set
	 */
	public void setFlags(String flags) {
		this.flags = flags;
	}
	

}
